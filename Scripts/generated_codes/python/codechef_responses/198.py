"""
"""
t=int(input())
for i in range(t):
    n=int(input())
    a=list(map(int,input().split()))
    a.sort()
    s=0
    for j in range(n//2):
        s=s+a[n-1-j]
    print(s)