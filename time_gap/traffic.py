
# 1. for any 2 floating car array fs = [f0, f1, ... fn] and f's = [f'0, f'1, ... f'n]
#   if k0*f0 + ... + kn*fn == upper_bound -> sum(fs) > sum(f's)
# 2. than, tree has degree of freedom of 1
#   sum(fs) = b0 + b1*f_root
#     max sum at edge value of f_root
#       calc [lower, upper] value of every vertax from leaf -> root
#       parent vertax needs
#   all fi down the line should >= 0

# as long as constraint of upper limit sum is kept, all sub tree should 


class Vertax():
  def __init__(self) -> None:
    self.parent = None
    self.adjs = {}   # {vi: t0, vj: t1 ...}
    self.children = {}   # {vi: t0, vj: t1 ...}


class Tree():
  def __init__(self, N: int) -> None:
    self.vrtxs = {_:Vertax() for _ in range(N)}

  def link(self, v0, v1):








N, Q = map(int, input())
for _ in range(N):
  v0, v1, t = map(int, input().split())


