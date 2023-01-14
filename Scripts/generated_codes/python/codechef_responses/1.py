'''
'''

#code
for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    ans=[1]*n
    for i in range(1,n):
        if ((arr[i-1]<0 and arr[i]>0) or (arr[i-1]>0 and arr[i]<0)):
            ans[i]=ans[i-1]+1
    print(*ans)