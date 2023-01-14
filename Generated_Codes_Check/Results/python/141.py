

The question is to find the number of paths from 0,0 to n+1,0.

n,m=map(int,input().split())
k=int(input())
graph=[]
for i in range(n+2):
    graph.append([])
    for j in range(m):
        graph[i].append([])
for i in range(k):
    x,y,a,b=map(int,input().split())
    graph[x][y].append(a*m+b)
dp=[]
for i in range(n+2):
    dp.append([])
    for j in range(m):
        dp[i].append(0)
dp[0][0]=1
for i in range(n+1):
    for j in range(m):
        for k in graph[i][j]:
            dp[k//m][k%m]+=dp[i][j]
print(dp[n+1][0]%(10**9+7))