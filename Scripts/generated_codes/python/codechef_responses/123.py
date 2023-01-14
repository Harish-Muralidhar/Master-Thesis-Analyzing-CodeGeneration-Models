"""

Explanation:
Here's the math:
1^1+2^1+...+10^1=55
1^2+2^2+...+10^2=385
1^3+2^3+...+10^3=3025
1^4+2^4+...+10^4=25333

Solution:
"""

t = int(input())

for i in range(t):
    n,k,p = map(int, input().split())
    ans = 0
    for a in range(1,n+1):
        ans += pow(a,k)
    print(ans%p)