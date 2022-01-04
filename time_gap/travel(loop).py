# 84% 메모리 초과
# link shrink algo 사용 완료
# link shrink 했는데도 recursion error 나는거는 평소 등장 안했는데도 link가 쌓여가는 node가 갑자기 불려서 그런듯
#     자주 생기지는 않으니까 recursion 너무 커지면 for 문으로 돌리는 우회법 사용하자

# loop는 stack 안써서 over flow 안나긴함, loop는 그 자리 바로바로 덮어 버리니까

import sys
sys.setrecursionlimit(500000)


class Node:
    def __init__(self, name):
        self.parent = name


class Graph:
    def __init__(self, n):   # n: number of nodes
        self.nodes = [Node(_) for _ in range(n)]

    def update(self, n0: int, n1: int) -> bool:
        # link n0 and n1 -> cycle formed
        [r0, c0], [r1, c1] = self.find_root(n0, self.nodes[n0].parent), self.find_root(n1, self.nodes[n1].parent)
        if r0 == r1:
            return True
        else:
            if c0 > c1:
                if c0 > 3:
                    self.flush(n0, self.nodes[n0].parent, r0)
                self.nodes[r1].parent = r0
            else:
                if c1 > 3:
                    self.flush(n1, self.nodes[n1].parent, r1)
                self.nodes[r0].parent = r1
            return False

    # def find_root(self, n: int, cnt=0) -> int:
    #     p = self.nodes[n].parent
    #     if n == p:
    #         return n, cnt
    #     else:
    #         return self.find_root(p, cnt+1)

    # def flush(self, n, r):
    #     # flush all parent to root
    #     p = self.nodes[n].parent
    #     if n == p:
    #         return
    #     else:
    #         self.nodes[n].parent = r
    #         self.flush(p, r)

    def find_root(self, n, p, cnt=0):
        while (n != p):
            cnt += 1
            n = p
            p = self.nodes[n].parent
        return n, cnt

    def flush(self, n, p, r):
        while (n != p):
            self.nodes[n].parent = r
            n = p
            p = self.nodes[n].parent



n, m = map(int, sys.stdin.readline().strip().split())
G = Graph(n)
for _ in range(m):
    if G.update(*map(int, sys.stdin.readline().strip().split())):
        print(_+1)
        break
else:
    print(0)

