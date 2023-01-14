"""

Solution:

from sys import stdin,stdout
from collections import Counter
from math import factorial as f

MOD = 10 ** 9 + 7

def solve(n,k,a):
    a = [0] + a
    c = Counter(a)
    ans = 1
    for i in range(1,k+1):
        ans *= f(c[i])
        ans %= MOD
    for i in range(1,n+1):
        ans *= i
        ans %= MOD
    return ans

n,k = map(int,stdin.readline().split())
ans = solve(n,k,list(map(int,stdin.readline().split())))
stdout.write(str(ans))
"""