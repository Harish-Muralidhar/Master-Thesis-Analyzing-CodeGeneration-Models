'''


'''

t=int(input())
for i in range(t):
    n,m,s=map(int,input().split())
    arr=list(map(int,input().split()))
    for i in range(len(arr)):
        if arr[i] > n:
            arr[i]=n
    if m < n:
        m=n 
    l=[]
    for i in range(1,n+1):
        l.append(i)
    if s in l:
        l.remove(s)
    l.insert(0,s)
    p=[0]*n
    p[0]=1
    for i in range(m):
        q=[0]*n
        for j in range(len(l)):
            j=j+1
            if j-arr[i] > 0:
                if l[j-arr[i]-1] in l[:j]:
                    q[l[j-1]-1]+=p[l[j-arr[i]-1]-1]
            if j+arr[i] <= n:
                if l[j+arr[i]-1] in l[:j]:
                    q[l[j-1]-1]+=p[l[j+arr[i]-1]-1]
        p=q
    for i in p:
        print(i,end=" ")
    print()