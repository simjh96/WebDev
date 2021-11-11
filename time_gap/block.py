def solution(begin, end):
    answer = []
    return answer

# memoize 필요 -> 가장 작은 첫 소인수의 pair 가
# 1~ 쭉 밀고 나가, 첫 짝 못찾은 애들만
# 소수끼리의 곱만 확인하면 됨...
result = {_:1 for _ in range(1, 10**9+1)}
idxs = set(range(1, 10**9+1))
result[1] = 0

max_block = 10**9


# idx starts with 1
b = 2
i = 2
new = i*b
while b*2 <= max_block:
    while new <= max_block:
        if result[new] == 1:
            result[new] = b
        i += 1
        new = i*b
    b += 1
    i = 2
    new = i*b

print(result[:10])