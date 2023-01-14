'''

Solution:
'''

import sys
sys.setrecursionlimit(1000000)

#sys.stdin = open('input.txt','rt')


def neighbor(x,y):
    res = 0
    if x-1>=0:
        res+=1
    if x+1<n:
        res+=1
    if y-1>=0:
        res+=1
    if y+1<m:
        res+=1
    return res

def color(i,j,arr,visited):
    global ans
    ans += neighbor(i,j)
    visited[i][j] = 1
    if j-1>=0 and visited[i][j-1]==0:
        color(i,j-1,arr,visited)
    if j+1<m and visited[i][j+1]==0:
        color(i,j+1,arr,visited)
    if i-1>=0 and visited[i-1][j]==0:
        color(i-1,j,arr,visited)
    if i+1<n and visited[i+1][j]==0:
        color(i+1,j,arr,visited)


t = int(input())
for i in range(t):
    n,m = map(int,input().split())
    arr = [[0 for _ in range(m)] for _ in range(n)]
    visited = [[0 for _ in range(m)] for _ in range(n)]
    ans = 0
    for i in range(n):
        for j in range(m):
            if visited[i][j]==0:
                color(i,j,arr,visited)
    print(ans)