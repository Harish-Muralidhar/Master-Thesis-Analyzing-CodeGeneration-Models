"""

The numbers in each case are all distinct.
"""
## Read input as specified in the question.
## Print output as specified in the question.
def solve(n,k,arr):
    s = sum(arr)
    ins = 0
    for i in range(n):
        ins += min(arr[i],k)
    if (s - ins) >= (n-1):
        return True
    return False
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
from sys import stdin,stdout
t=int(stdin.readline().strip())
while t>0:
    t-=1
    n,k=map(int,stdin.readline().strip().split())
    arr=list(map(int,stdin.readline().strip().split()))
    res = solve(n,k,arr)
    if res:
        stdout.write("YES\n")
    else:
        stdout.write("NO\n")