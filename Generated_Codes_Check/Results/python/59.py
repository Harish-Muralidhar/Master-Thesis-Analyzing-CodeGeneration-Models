'''

Explanation:
For the first example, the minimum number of square plots of size 1*1 is 6.

For the second example, the minimum number of square plots of size 1*1 is 6.

'''

t = int(input())

for i in range(t):
    n,m = map(int,input().split())
    a = min(n,m)
    b = max(n,m)
    c = b//a
    d = b%a
    if d == 0:
        print(a**2)
    else:
        print(a*c + d*c + d*(d-1)//2)