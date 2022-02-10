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
  
  if prefix == len(pers):
    if (not r_cap) and (not b_cap):   # legit ending
      memo[(prefix, r_cap, b_cap)] = 0
      return memo[(prefix, r_cap, b_cap)]
    else:   # invalid
      return -1
  
  else:   # in the making
    if r_cap < 0 or b_cap < 0:   # return invalid
      memo[(prefix, r_cap, b_cap)] = -1
      return memo[(prefix, r_cap, b_cap)]      

    past = s(prefix+1, r_cap - pers[prefix][0], b_cap - pers[prefix][1], memo)
    if past >= 0:   # valid
      take = past + pers[prefix][2]
    else:   # if invalid, keep invalid
      take = past

    leave = s(prefix+1, r_cap, b_cap, memo)
    memo[(prefix, r_cap, b_cap)] = max([take, leave])
    return memo[(prefix, r_cap, b_cap)]

danger_scores = []
for _ in range(n):
  danger_scores.append([_+1, max([0, s(0, peop[_][0], peop[_][1], memo)])])   # if invalid -1 -> 0
danger_scores.sort(key=lambda x: x[1])
danger_scores = map(lambda x: f'{x[0]} {x[1]}', danger_scores)

# print('answer :')
print('\n'.join(danger_scores))

