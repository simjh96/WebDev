import sys

class Groups():
  def __init__(self):
    self.gs = dict()   # {g_i: {a, b, c}}
    self.g_i = 0   # g_i++
    self.n2gi = dict()   # {name : g_i}

  def update(self, f0: str, f1: str):
    gi0 = self.n2gi.get(f0)
    gi1 = self.n2gi.get(f1)

    # both known
    if (gi0 is not None) and (gi1 is not None):   # key: 0 이 있어서...
      self._mergeG(f0, f1)
    # one known
    elif (gi0 is not None) and (gi1 is None):
      self._add_friend(f0, f1)
    elif (gi1 is not None) and (gi0 is None):
      self._add_friend(f1, f0)
    # both unknown
    else:
      self._createG(f0, f1)

    print("========================")
    print(self.gs)
    return len(self.gs[self.n2gi[f0]])

  def _createG(self, f0, f1):
    self.gs[self.g_i] = {f0, f1}
    self.n2gi[f0], self.n2gi[f1] = self.g_i, self.g_i
    self.g_i += 1

  def _add_friend(self, known_f, unknown_f):
    self.gs[self.n2gi[known_f]].add(unknown_f)
    self.n2gi[unknown_f] = self.n2gi[known_f]

  def _mergeG(self, f0, f1):
    g1 = self.gs[self.n2gi[f1]]
    # need optimizing
    for _ in g1:
      self.n2gi[_] = self.n2gi[f0]
    self.gs[self.n2gi[f0]] |= g1
    
answer = []
n = int(sys.stdin.readline().strip())
for _0 in range(n):
  m = int(sys.stdin.readline().strip())
  G = Groups()
  for _1 in range(m):
    answer.append(str(G.update(*sys.stdin.readline().strip().split())))

print('\n'.join(answer))










# visited, n2gi: 1->1, g2ns: 1->n
# check name was visited
# both visited ? for _ in gs[n2gi[1]] n2gi[_]->0 && gs[n2gi[0]] |= gs[n2gi[1]]
# one is new ? n2gi[_] = n2gi[0] && gs[n2gi[0]].add(_)
# both new ? n2gi[_0] = n2gi[_1] = gs[g_i] && g_i++
