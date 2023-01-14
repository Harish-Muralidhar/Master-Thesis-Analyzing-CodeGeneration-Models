"""
"""

# Write your code here
from math import ceil
t = int(input())
for _ in range(t):
    m, x, y = map(int, input().split())
    cops = list(map(int, input().split()))
    safe_houses = [[i - y * x, i + y * x] for i in cops]
    safe_range = []
    for r in safe_houses:
        safe_range.extend(r)
    safe_range.sort()
    l, r = -1, -1
    c = 0
    while l != safe_range[-1]:
        l = safe_range[c]
        while c < len(safe_range) - 1 and safe_range[c] == safe_range[c+1]:
            c += 1
        r = safe_range[c]
        c += 1
        if l <= 0 and r >= 100:
            break
        elif l <= 0:
            l = 0
        elif r >= 100:
            r = 100
        if l == r:
            cnt = 1
        else:
            cnt = (r-l) + 1
        print(l, r, cnt)
    print(cnt)