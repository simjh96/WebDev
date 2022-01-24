_ = input()
coords = input()

coords = list(enumerate(map(int, coords.split())))
coords_ordered = sorted(coords, key=lambda x: x[1])   # [(2, -10), (4, -9) ...]

# compress only when greater
max_coord = coords_ordered[0][1]
compressed_coord = 0

for i in range(len(coords_ordered)):
  idx, coord = coords_ordered[i]
  if coord > max_coord:
    max_coord = coord
    compressed_coord += 1
    coords_ordered[i] = coords_ordered[i][0], compressed_coord
    
  else:
    coords_ordered[i] = coords_ordered[i][0], compressed_coord


print(' '.join(list(map(lambda x: str(x[1]), sorted(coords_ordered, key=lambda x: x[0])))))
