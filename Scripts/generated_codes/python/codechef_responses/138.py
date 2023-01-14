"""

"""

from collections import defaultdict
from collections import deque
import sys
#sys.stdin = open('input.txt','r')
input = sys.stdin.readline

mod = 747474747

def bfs(graph, source):
    q = deque()
    visited = [False] * (len(graph))
    visited[source] = True

    q.append(source)

    while q:
        u = q.popleft()

        for v in graph[u]:
            if visited[v] == False:
                visited[v] = True
                q.append(v)
    
    return visited


def isCyclic(graph):
    for u in range(len(graph)):
        visited = bfs(graph, u)

        for v in range(len(graph)):
            if visited[v] == False:
                graph[u].append(v)
                if bfs(graph, u)[v] == True:
                    return True
                graph[u].pop()
    return False


def dist(x1, x2):
    ans = 0
    for i in range(len(x1)):
        ans += (x1[i] - x2[i]) ** 2

    return ans**0.5


def solve(graph, points):
    ans = 1
    for u in range(len(graph)):
        for v in range(len(graph)):
            if graph[u][v] == False:
                graph[u][v] = True
                graph[v][u] = True
                if isCyclic(graph) == False:
                    ans = (ans * (dist(points[u], points[v]) ** 2)) % mod
                graph[u][v] = False
                graph[v][u] = False
    
    return ans


def main():
    t = int(input())
    while t:
        t -= 1

        n, d = map(int, input().split())
        points = []
        graph = [[False for i in range(n)] for j in range(n)]
        for i in range(n):
            points.append(list(map(int, input().split())))
        
        print(int(solve(graph, points)))

if __name__ == "__main__":
    main()