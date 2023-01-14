'''


'''
for _ in range(int(input())):
    n,m=map(int,input().split())
    arr=list(map(int,input().split()))
    d={}
    for i in range(m):
        d[arr[i]]=max(d.get(arr[i],0),m-i)
        d[arr[i]-1]=max(d.get(arr[i]-1,0),m-i)
        d[arr[i]+1]=max(d.get(arr[i]+1,0),m-i)
    for i in range(n):
        print(d.get(i,0),end=' ')
    print()