
def parsable(g: str)->bool:
  return sum([int(_) for _ in g]) == len(g)//2 and (not len(g)%2)

def parse_g(g: str)->list:
  # parse to minimum subset of AB -> A, B
  #   posibility of duplicate interpretation only happens with 'wrap' operation involoved
  # ['01','10','0011'] with len > 1
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
    _pg = pg[:]
    _pg[0], _pg[-1] = pg[0][1:], pg[-1][:-1]
    if mergable:
      return count_leaf(pg[:-1]) + count_leaf(parse_g(''.join(_pg)))   # _unwrapable -unwrap-> _unwrapable with idx 0, -1 switched; count_leaf stay same
    else:
      return count_leaf(pg[:-1])
  
  elif len(pg) == 1:
    # minimum element has 1 interpretation -> unwrap
    g = pg[0]
    mergable = int(g[0]) + int(g[-1]) == 1
    if mergable and len(g)>2:
      return count_leaf(parse_g(g[1:-1]))
    else:
      return 1
  else:
    return 1

g = input()
if parsable(g):
  pg = parse_g(g)
  print(count_leaf(pg)%(10**9+7))
else:
  print(0)


