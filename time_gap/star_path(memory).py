from collections import defaultdict
import sys

n, m = map(int, sys.stdin.readline().split())

cuts = defaultdict(set)
for _ in range(m):
  a, b = map(int, sys.stdin.readline().split())
  cuts[a].add(b)
  cuts[b].add(a)

frontier = {1,}
i = 0
dist = {}
full = {_ for _ in range(1, n+1)}

while frontier:
  # check current frontier
  for f in frontier:
    dist[f] = i
  full -= frontier   # erase already checked

  # get next frontier
  deprecated = cuts[frontier.pop()]
  for n_i in frontier:   # get one step unreachables
    deprecated &= cuts[n_i]   # everything is reachable except all unreachable

  frontier = full - deprecated
  i += 1

print('\n'.join([str(dist.get(_, -1)) for _ in range(1, n+1)]))
