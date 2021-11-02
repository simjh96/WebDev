def solution(n, cores):
    left = 0
    right = 10**9
    # 같은 수가 있다 해도 무조건 더 작은 수가 나옴(0 없는 case)
    # ㄴㄴ ㅋㅋㅋ 첫자락도 나올 수 있음
    while left<right:
        mid = left + (right-left)//2
        if n <= get_in_p(cores, mid):
            right = mid
        else:
            left = mid + 1

    # 필요한만큼 곧 돌아오는거에서 뽑아 쓰자
    required = n - get_in_p(cores, mid)
    rs = get_remains(cores, mid)   
    return rs[required - 1]


def get_in_p(cores, k):
    return sum(map(lambda x: k//x + 1, cores))

# zeros 구할게 아니라 가장 가깝게 돌아오는것 구해야하네
def get_remains(cores, k):
    return sorted([(i, r) for i, r in enumerate(map(lambda x: x - k % x,cores))], key=lambda y: y[1])

# n, cores = 6, [1,2,3]
# print(solution(n, cores))