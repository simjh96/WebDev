# op : //3, //2, -1

# make 1 with min op

# bfs
def bfs(frontier, visited):
  print("==================")
  print(frontier)
  if 1 in frontier:
    return
  else:
    _frontier = set()
    for f in frontier:
      if (not f%3) and (not visited.get(f//3)):
        _frontier.add(f//3)
        visited[f//3] = f
      if (not f%2) and (not visited.get(f//2)):
        _frontier.add(f//2)
        visited[f//2] = f
      if not visited.get(f - 1):
        _frontier.add(f - 1)
        visited[f - 1] = f
    
    bfs(_frontier, visited)

X = int(input())
if X == 1:
  print(0)
  print(1)
else:
  visited = dict()
  bfs({X}, visited)
  answer = [1]
  i = 1
  print(visited)
  while True:
    if visited.get(i):
      i = visited.get(i)
      answer.append(i)
    else:
      break
  print(len(answer)-1)
  print(' '.join(map(str, answer[::-1])))


# visitied = {numb: before}
