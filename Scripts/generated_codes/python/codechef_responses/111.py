"""



"""

import sys

def get_input():
    lines = sys.stdin.read().splitlines()
    n = int(lines[0])
    it = iter(lines[1:])
    return [[int(x) for x in next(it).split()] for _ in range(n)]

def f(S,T):
    """return maximal difference between number of A and number of B in S and T respectively"""
    a = 0
    b = 0
    for x in S:
        if x == 0:
            a += 1
        else:
            b += 1
    aa = a
    bb = b
    for x in T:
        if x == 0:
            aa -= 1
        else:
            bb -= 1
    return max(abs(a-b), abs(aa-bb))

def solve(n, S, T):
    if f(S, T) == 0:
        return "A"*n
    else:
        return "A"*n + "B"*n

def main():
    for i, case in enumerate(get_input()):
        n, S, T = case
        print("Case {}: {}".format(i+1, solve(n,S,T)))

if __name__ == "__main__":
    main()