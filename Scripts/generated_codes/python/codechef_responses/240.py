'''

'''

for _ in range(int(input())):
    n,m=map(int,input().split())
    l=list(map(int,input().split()))
    if sum(l)==m:
        print("Yes")
    elif sum(l)<m:
        print("No")
    else:
        m=max(l)-m
        while(m>0):
            i=l.index(max(l))
            l[i]-=1
            m-=1
        if sum(l)==m:
            print("Yes")
        else:
            print("No")