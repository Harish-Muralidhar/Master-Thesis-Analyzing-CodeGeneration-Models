"""
The answers are the third element from the beginning in each of these sequences.

"""

t = int(input())

for i in range(t):
    c, s, k = [int(x) for x in input().split()]
    k = k - 1
    ans = k//(c-1) + 1
    if ans <= s:
        print(ans)
    else:
        print(-1)