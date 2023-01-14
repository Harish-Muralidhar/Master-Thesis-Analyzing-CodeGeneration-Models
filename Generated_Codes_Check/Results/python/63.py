'''
'''

# Write your code here
t = int(input())
for _ in range(t):
    n,k = map(int, input().split())
    l = list(map(int, input().split()))
    l.sort()
    print(l[k:n-k])
    avg = sum(l[k:n-k])/(n-2*k)
    print('{:.6f}'.format(avg))