'''



'''
for i in range(int(input())):
    n,x=map(int,input().split())
    a=list(map(int,input().split()))
    s=0
    for i in range(len(a)):
        s=s+a[i]
    if s%x==0:
        print((s//x)-n)
    else:
        print(-1)