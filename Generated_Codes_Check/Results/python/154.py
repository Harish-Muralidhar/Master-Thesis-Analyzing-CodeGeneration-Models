"""
"""
# Write your code here
t = int(input())
for i in range(t):
    n = int(input())
    a = list(map(int,input().split()))
    a.sort()
    b = []
    for i in range(n-1):
        b.append(a[i+1]-a[i])
    print(sum(b))