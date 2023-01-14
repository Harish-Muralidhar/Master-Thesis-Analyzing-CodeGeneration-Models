'''


'''



t = int(input())

def primes(n):
    primes = []
    for i in range(2,n+1):
        flag = 0
        for j in range(2,i):
            if(i%j == 0):
                flag = 1
        if(flag == 0):
           primes.append(i)
    return primes

for i in range(t):
    n = int(input())
    #print(primes(n))
    p = primes(n)
    #print(len(p))
    l = len(p)
    a = n-1
    cnt = 0
    for k in range(0,l):
        if(p[k]<=a):
            cnt = cnt + 1
        else:
            break
    #print(cnt)
    cnt = n-cnt
    #print(cnt)
    ans = 0
    for i in range(cnt):
        ans = ans + 2**i
    print(ans,cnt)