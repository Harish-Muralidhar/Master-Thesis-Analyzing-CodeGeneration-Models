"""
"""

t = int(input())
while t > 0:
    n, k, e, m = map(int, input().split())
    a = []
    for i in range(n - 1):
        a.append(list(map(int, input().split())))
    a = sorted(a, reverse=True, key=lambda x: sum(x[:e - 1]))
    if sum(a[k - 1][:e - 1]) + 1 < sum(map(int, input().split())) + m:
        print(sum(map(int, input().split())) + m - sum(a[k - 1][:e - 1]))
    else:
        print("Impossible")
    t -= 1