"""


"""
import sys

sys.setrecursionlimit(10 ** 9)

t = int(input())
while t > 0:
    m = int(input())
    A = []
    for _ in range(m):
        A.append(list(map(int, input().rstrip().split())))
    N = 1
    for i in range(m):
        N *= A[i][0] ** A[i][1]

    def phi(n):
        result = n
        p = 2
        while p * p <= n:
            if n % p == 0:
                while n % p == 0:
                    n = n // p
                result -= result // p
            p += 1
        if n > 1:
            result -= result // n
        return result

    # print(N, phi(N))
    ans = 1
    n = phi(N)
    if n == 1:
        print(ans)
    else:
        while n > 1:
            ans += 1
            n = phi(n)
        print(ans)
    t -= 1