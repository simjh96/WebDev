n, m = map(int, input().split())

class Node():
  def __init__(self, s) -> None:
      self.adjs = set(_ for _ in range(1, n+1) if _ != s)

class Graph():
  def __init__(self) -> None:
    self.nodes = {_: Node(_) for _ in range(1, n+1)}

  def cut(self, a, b):
    self.nodes[a].adjs.discard(b)
    self.nodes[b].adjs.discard(a)

G = Graph()
for _ in range(m):
  G.cut(*map(int, input().split()))

# # 메모리 초과
# def bfs(frontier, i, dist):
#   # bfs([1], 0, dist)
#   _frontier = set()
#   for n in frontier:
#     if n not in dist:
#       dist[n] = i
#       _frontier |= G.nodes[n].adjs
#   if _frontier:
#     bfs(_frontier, i+1, dist)

frontier = {1,}
i = 0
dist = {}

while frontier:
  _frontier = set()
  for n_i in frontier:
    if n_i not in dist:
      dist[n_i] = i
      _frontier |= G.nodes[n_i].adjs
  frontier = _frontier
  i += 1  

print('\n'.join([str(dist.get(_, -1)) for _ in range(1, n+1)]))





