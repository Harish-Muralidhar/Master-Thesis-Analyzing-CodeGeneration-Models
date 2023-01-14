"""
"""

from collections import defaultdict

class Graph:
    def __init__(self, n):
        self.V = n              # No. of vertices
        self.graph = defaultdict(list)
        
    def addEdge(self, u, v):
        self.graph[u].append(v)
        self.graph[v].append(u)
        
    def DFSUtil(self, v, visited):
        visited[v] = True
        for i in self.graph[v]:
            if visited[i] == False:
                self.DFSUtil(i, visited)
                
    def isConnected(self):
        visited = [False] * self.V
        count = 0
        for v in range(self.V):
            if visited[v] == False:
                self.DFSUtil(v, visited)
                count += 1
        if count == 1:
            return True
        return False
    
    def isEulerian(self):
        if self.isConnected() == False:
            return False
        for v in range(self.V):
            if len(self.graph[v]) % 2 != 0:
                return False
        return True
    
g = Graph(4) 
g.addEdge(3, 2) 
g.addEdge(3, 1) 
g.addEdge(2, 1) 
g.addEdge(1, 4) 
  
if g.isEulerian(): 
    print("YES")
else: 
    print("NO")