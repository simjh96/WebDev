import sys

n = int(sys.stdin.readline())
As = []
for _ in range(n):
  As.append(list(map(int, sys.stdin.readline().split())))

i = 0
m = 0

while (i < len(As)):
  # each shuffle
  l = 0
  r = 0
  atLeft = True if m < 13 else False
  m = m if m < 13 else m - 13

  for j in range(len(As[i])):
    if j%2:
      l += As[i][j]
      if atLeft and l > m:
        m = r + m
        break

    else:
      r += As[i][j]
      if not atLeft and r > m:
        m = m + l
        break
  
  i += 1

print(m+1)