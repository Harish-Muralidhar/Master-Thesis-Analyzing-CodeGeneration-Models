"""
"""

# Write your code here
n = int(input())
A = list(map(int,input().split()))

s = 0
for i in range(n):
    for j in range(i+1,n):
        s+= A[i] & A[j]

print(s)