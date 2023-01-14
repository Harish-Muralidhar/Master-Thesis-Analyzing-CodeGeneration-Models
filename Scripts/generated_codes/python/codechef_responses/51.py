'''


'''

#code
t = int(input())
for i in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    b = [0]*n
    c = [0]*n
    for j in range(n):
        b[j] = a[j*n:j*n+n]
    for j in range(n):
        c[j] = b[j][::-1]
    k = int(input())
    d = list(map(int, input().split()))
    e = [0]*n
    f = [0]*n
    for j in range(n):
        e[j] = d[j*n:j*n+n]
    for j in range(n):
        f[j] = e[j][::-1]
    ans = 0
    for j in range(n):
        for k in range(n):
            if(c[j][k]==f[0][0]):
                x = j
                y = k
    for j in range(1,n*n):
        if(f[0][j]==c[x][y+1]):
            x = x
            y = y+1
        elif(f[0][j]==c[x+1][y]):
            x = x+1
            y = y
        elif(f[0][j]==c[x][y-1]):
            x = x
            y = y-1
        elif(f[0][j]==c[x-1][y]):
            x = x-1
            y = y
        ans = ans + abs(x-x) + abs(y-y)
    print(ans)