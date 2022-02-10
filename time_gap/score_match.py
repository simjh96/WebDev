t = 3
# n, s = map(int, '1000 1000001000'.split())
n, s = map(int, '1000 1000001000'.split())
# 4318 899954000
# 20000 123456789

print(f'2*n*s % 10**9:{2*n*s % 10**9}')
print(f'(2*n*s+2*n) % 10**9:{(2*n*s+2*n) % 10**9}')

a = s%10**9
max_k = 2*(n - a)

print(f'a: {a}')
print(f'max_k: {max_k}')
print((10**9)*(2*a+max_k)/(2*n) + a)
