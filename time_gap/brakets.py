
def parsable(g: str)->bool:
  return sum([int(_) for _ in g]) == len(g)/2

def parse_g(g: str)->list:
  # parse to minimum subset of AB -> A, B
  #   posibility of duplicate interpretation only happens with 'wrap' operation involoved
  # ['01','10','0011']
  i, j, zs, os = 0, 0, 0, 0
  result = []

  while j < len(g):
    # read
    if g[j]=='0': zs += 1
    if g[j]=='1': os += 1
    j += 1

    # check to parse
    if zs == os:
      result.append(g[i:j])
      i = j
      zs, os = 0, 0
  return result

def count_leaf(pg: list):
  print(pg)
  # progressive in suffix
  if len(pg)>1:
    # check mergable for 1 index behind
    #   mergable means unwrapable
    #   (if mergable, than successive 'and' relation is passed to next recursion)
    mergable = int(pg[-2][0]) + int(pg[-1][-1]) == 1
    print(mergable)
    if mergable:
      return 2*count_leaf(pg[:-1])   # _unwrapable -unwrap-> _unwrapable with idx 0, -1 switched; count_leaf stay same
    else:
      return count_leaf(pg[:-1])
  
  else:
    # minimum element has 1 interpretation -> unwrap
    if len(pg[0]) == 2:
      return 1
    else:
      return count_leaf(parse_g(pg[0][1:-1]))

g = input()
if parsable(g):
  pg = parse_g(g)
  print(count_leaf(pg)%(10**9+7))
else:
  print(0)
