# un directed
# no weight
# random root

# query: let V[U] be root of sub tree T_U
# return count(T_U.V)

# 2 <= V <= 10^5
# 1 <= Q <= 10^5
# for V-1

class Node:
    def __init__(self):
        self.adj = set()
        self.des = set()

class Tree:
    def __init__(self, n):
        self.nodes = {_:Node() for _ in range(1,n+1)}
        
    def set_adj(self, link):
        self.nodes[link[0]].add(link[1])
        self.nodes[link[1]].add(link[0])

    def dag(self, root, parent=-1):
        if len(self.nodes[root].adj) == 1:
            return set()
        else:
            des = set()
            for adj in self.nodes[root].adj:
                if adj != parent:
                    des |= self.dag(adj, root)

            self.nodes[root].des |= des
            return self.nodes[root].des

    def solution(self, root):
        return len(self.nodes[root].des)

T = Tree(n)
# for
T.set_adj(link)
T.dag(r)
T.solution(q)
