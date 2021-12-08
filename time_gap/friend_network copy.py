import sys
import copy

class Groups():
  def __init__(self):
    self.gs = dict()   # {g_i: {a, b, c}}
    self.g_i = 0   # g_i++
    self.n2g = dict()   # {name : gs[g_i]}

  def update(self, f0: str, f1: str):
    g0 = self.n2g.get(f0)
    g1 = self.n2g.get(f1)

    # both known
    if (g0 is not None) and (g1 is not None):   # key: 0 이 있어서...
      self._mergeG(f0, f1)
    # one known
    elif (g0 is not None) and (g1 is None):
      self._add_friend(f0, f1)
    elif (g1 is not None) and (g0 is None):
      self._add_friend(f1, f0)
    # both unknown
    else:
      self._createG(f0, f1)

    return len(self.n2g[f0])

  def _createG(self, f0, f1):
    self.gs[self.g_i] = {f0, f1}
    self.n2g[f0], self.n2g[f1] = self.gs[self.g_i], self.gs[self.g_i]
    self.g_i += 1

  def _add_friend(self, known_f, unknown_f):
    self.n2g[known_f].add(unknown_f)
    self.n2g[unknown_f] = self.n2g[known_f]

  def _mergeG(self, f0, f1):
    g1 = copy.deepcopy(self.n2g[f1])
    self.n2g[f0] |= g1
    self.n2g[f1] = self.n2g[f0]   # 이거 안되는게 정상 아닌가??? 일단 메모리 개선 해서 보내보자
    
answer = []
n = int(sys.stdin.readline().strip())
for _0 in range(n):
  m = int(sys.stdin.readline().strip())
  G = Groups()
  for _1 in range(m):
    answer.append(str(G.update(*sys.stdin.readline().strip().split())))

print('\n'.join(answer))

