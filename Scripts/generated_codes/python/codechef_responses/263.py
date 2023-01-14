"""

"""


def dfs(visited, graph, node):
    if node not in visited:
        visited.append(node)
        for n in graph[node]:
            dfs(visited, graph, n)
    return visited


def connectedComponents(graph):
    visited = []
    cc = []
    for node in graph:
        if node not in visited:
            cc.append(dfs(visited, graph, node))
    return cc


def min_employees(graph):
    cc = connectedComponents(graph)
    return len(cc)