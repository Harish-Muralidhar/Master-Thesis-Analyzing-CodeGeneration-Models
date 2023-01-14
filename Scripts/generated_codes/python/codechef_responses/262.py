"""
"""

# Write your code here
import math

t = int(input())
for _ in range(t):
    n, m, k = map(int, input().split())
    print(math.ceil(k/min(n, m)))