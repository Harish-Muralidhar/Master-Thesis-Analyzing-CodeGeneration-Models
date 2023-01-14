'''

'''

from heapq import heappop, heappush
from collections import defaultdict


def dijkstra(source, graph, distances):
    visited = set()
    queue = [(0, source)]
    while queue:
        distance, node = heappop(queue)
        if node in visited:
            continue
        visited.add(node)
        distances[node] = distance
        for k, v in graph[node].items():
            if k not in visited:
                heappush(queue, (distance + v, k))


def create_graph(N, M, A, B, C):
    graph = defaultdict(dict)
    for a, b, c in zip(A, B, C):
        graph[a][b] = c
        graph[b][a] = c
    return graph


def main():
    T = int(input())
    for _ in range(T):
        N, M = map(int, input().split())
        A = [int(x) for x in input().split()]
        B = [int(x) for x in input().split()]
        C = [int(x) for x in input().split()]
        graph = create_graph(N, M, A, B, C)
        distances = [-1 for _ in range(N + 1)]
        dijkstra(1, graph, distances)
        print(distances[N])


if __name__ == "__main__":
    main()