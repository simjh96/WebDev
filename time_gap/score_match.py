def score(a, b, c, n):
  return ((10**9)*(2*a+2*b+c))//(2*n) + a


def solution(n, s):
  # binary search with b
  left = -1
  right = n+1
  result = None

  while left <= right:
    mid = (left + right) // 2
    # 10**9 가 너무 큰 수라서 다른 b 의 boundary가 겹칠 일이 없음
    u_bound = score(0, mid, 0, n) + mid
    l_bound = score(0, mid-1, 1, n)
    m_bound = score(0, mid, 0, n)

    if s < l_bound:
      right = mid - 1

    elif s > u_bound:
      left = mid + 1
    
    else:   # in boundary L <= s <= U
      if s >= m_bound:
        result = [s - m_bound, mid - (s - m_bound), 0]
      else:
        if s <= l_bound + mid - 1:
          result = [s - l_bound, mid - 1 - (s - l_bound), 1]
      break

  if result is not None:
    a, b, c = result
    return f"{2*a+2*b+c} {a}"

  else:
    return "-1"


# answer
t = int(input())
answer = []
for _ in range(t):
  answer.append(solution(*map(int, input().split())))

print('\n'.join(answer))