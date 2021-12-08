import heapq

d = 1000000007
past1 = 0%d
past2 = 1%d
fibo = None

n = int(input());
if n==0:
  print(0)
elif n==1:
  print(1)
else:
  for _ in range(n-1):
    fibo = past1 + past2
    if fibo >= d:
      fibo -= d
    past1 = past2
    past2 = fibo

  print(fibo)
