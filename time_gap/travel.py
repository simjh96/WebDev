# 78% 메모리 초과
# link shrink algo 사용 고려

import sys
# sys.setrecursionlimit(10**4)


class Node:
    def __init__(self, name):
        self.name = name
        self.parent = name
    def __str__(self) -> str:
        return f"<n:{self.name}, p:{self.parent}>"


class Graph:
    def __init__(self, n):   # n: number of nodes
        self.nodes = [Node(_) for _ in range(n)]

    def update(self, n0: int, n1: int) -> bool:
        # link n0 and n1 -> cycle formed
        [r0, u0], [r1, u1] = self.find_root(n0), self.find_root(n1)
        print("=========================================")
        print(f'self.nodes:')
        [print(_, end=' ') for _ in self.nodes]
        print('\n'+f'r0:{r0}, u0:{u0}, r1:{r1}, u1:{u1}')
        if r0 == r1:
            return True
        else:
            self.nodes[r1].parent = r0
            if u0>1:
                self.flush(n0, r0)
            if u1>1:
                self.flush(n1, r0)
            return False

    def find_root(self, n: int, cnt: int =0) -> list[int]:
        p = self.nodes[n].parent
        if n == p:
            return n, cnt
        else:
            return self.find_root(p, cnt+1)

    def flush(self, n: int, r: int):
        p = self.nodes[n].parent
        print(f'    flush: n:{n}, p:{p} -> {r}')
        if n == p:
            self.nodes[n].parent = r

        else:
            self.nodes[n].parent = r
            self.flush(p, r)


n, m = map(int, sys.stdin.readline().strip().split())
G = Graph(n)
for _ in range(m):
    if G.update(*map(int, sys.stdin.readline().strip().split())):
        print(_+1)
        break
else:
    print(0)

