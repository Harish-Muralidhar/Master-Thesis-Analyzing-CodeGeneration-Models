'''

'''

import sys
sys.setrecursionlimit(10**6)

def solve(days,white,black,a,b,c,d):
    if days==1:
        return a[0]-b[0]

    if dp[days][white][black]!=-1:
        return dp[days][white][black]

    ans1=solve(days-1,white,black,a,b,c,d)
    ans2=solve(days-1,white-1,black,a,b,c,d)
    ans3=solve(days-1,white,black-1,a,b,c,d)
    if a[days-1]-c[white-1]>=b[days-1]:
        ans2+=abs(a[days-1]-c[white-1]-b[days-1])
        if ans2<=ans1:
            ans1=ans2
    if b[days-1]+d[black-1]<=a[days-1]:
        ans3+=abs(a[days-1]-b[days-1]-d[black-1])
        if ans3<=ans1:
            ans1=ans3
    dp[days][white][black]=ans1
    return ans1

t=int(input())
while t>0:
    n,k,m=map(int,input().split())
    a=list(map(int,input().split()))
    b=list(map(int,input().split()))
    c=list(map(int,input().split()))
    d=list(map(int,input().split()))
    dp=[[[-1 for i in range(m+1)] for j in range(k+1)] for _ in range(n+1)]
    print(solve(n,k,m,a,b,c,d))
    t-=1