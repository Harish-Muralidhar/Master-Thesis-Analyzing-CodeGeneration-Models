'''
'''

n = int(input())
l = list(map(int, input().split()))
m = 0
z = 0
for i in range(n-1):
    f = 0
    k = 0
    for j in range(i,n):
        if l[j] == 0:
            f += 1
        else:
            k = j
            break
    c = 0
    for j in range(k+1,n):
        if l[j] == 0:
            c += 1
            if c > m:
                m = c
                z = f + 1
        else:
            c = 0
print(z)