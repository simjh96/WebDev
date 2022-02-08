tgt = input()
sec = int(tgt[:2])*60 + int(tgt[3:])
print(f'sec: {sec}')
denoms = [600, 60, 30, 10]
quotients = []

for d_i in range(len(denoms)):
  quotients.append(sec//denoms[d_i])
  print(f'quotient : {sec//denoms[d_i]}')
  sec = sec%denoms[d_i]
  print(f'remainder : {sec%denoms[d_i]}')

tot = sum(quotients)
if not quotients[2]:
  tot += 1

print(tot)






