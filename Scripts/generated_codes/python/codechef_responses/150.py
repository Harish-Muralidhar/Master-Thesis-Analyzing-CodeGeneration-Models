"""

Explanation
For N=3
0 -> 1 -> -1 -> 0 -> 1 -> 3,
0 -> 2 -> 1 -> 3
0 -> 3
are some possible ways.

For N=4
0 -> 1 -> -1 -> -2 -> 0 -> 2 -> 4
0 -> 1 -> -1 -> 0 -> 1 -> 3 -> 4
0 -> 1 -> 3 -> 4
0 -> 2 -> 1 -> 3 -> 4
0 -> 2 -> 4
0 -> 4
are some possible ways.

"""
# def fib(n):
#     if n == 0:
#         return 0
#     elif n == 1:
#         return 1
#     else:
#         return fib(n-1) + fib(n-2)
def step(n):
    if n == 1:
        return 1
    elif n == 2:
        return 2
    else:
        return step(n-1) + step(n-2)

for _ in range(int(input())):
    num = int(input())
    print(step(num))