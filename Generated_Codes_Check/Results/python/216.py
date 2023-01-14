"""


"""

# Write your code here
import sys
sys.setrecursionlimit(10**6)
mod = 10**9 + 7
def find_ways(node, color, parent):
    global ways
    if node == n:
        return 1
    elif (node, color) in ways:
        return ways[(node, color)]
    else:
        w = 0
        for c in range(1, k+1):
            if c == color or c == parent:
                continue
            else:
                w = (w + find_ways(node+1, c, color))%mod
        ways[(node, color)] = w
        return w

for _ in range(int(input())):
    n, k = map(int, input().split())
    ways = {}
    total_ways = 0
    for i in range(1, k+1):
        total_ways = (total_ways + find_ways(1, i, 0))%mod
    print(total_ways)