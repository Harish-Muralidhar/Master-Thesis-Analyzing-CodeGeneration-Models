'''

'''

t = int(input())

for i in range(0,t):
    n = int(input())
    n_rev = 0
    while n > 0:
        n_rev = (n_rev * 10) + (n % 10)
        n = n // 10
    print(n_rev)