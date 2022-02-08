from collections import defaultdict

n, m = map(int, input().split())

pers = []   # [[r0, b0, d0], ...]
for _ in range(m):
  pers.append(list(map(int, input().split())))
peop = []   # [[r_cap, b_cap], ...]
for _ in range(n):
  peop.append(list(map(int, input().split())))

memo = defaultdict(int)


def s(prefix: int, r_cap: int, b_cap: int, memo):
  if (prefix, r_cap, b_cap) in memo:   # memoize
    return memo[(prefix, r_cap, b_cap)]
  
  if (not r_cap - pers[prefix][0]) and (not b_cap - pers[prefix][1]):   # end exists(solution made)
    memo[(prefix, r_cap, b_cap)] = pers[prefix - 1][2]
    return memo[(prefix, r_cap, b_cap)]

  if prefix == len(pers) - 1 or r_cap < 0 or b_cap < 0:   # terminal (at the end(no solution) || cap underflow)
    return 0
  
  else:   # in the making
    take = s(prefix+1, r_cap - pers[prefix][0], b_cap - pers[prefix][1], memo) + pers[prefix][2]
    leave = s(prefix+1, r_cap, b_cap, memo)
    memo[(prefix, r_cap, b_cap)] = max([take, leave])
    return memo[(prefix, r_cap, b_cap)]

danger_scores = []
for _ in range(n):
  danger_scores.append([_+1, s(0, peop[_][0], peop[_][1], memo)])
danger_scores.sort(key=lambda x: x[1])
danger_scores = map(lambda x: f'{x[0]} {x[1]}', danger_scores)

print('answer :')
print('\n'.join(danger_scores))

