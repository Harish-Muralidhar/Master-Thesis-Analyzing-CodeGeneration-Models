'''

Input:
3
3
1 2 3
4
1 2 3 4
5
1 1 2 3 3

Output:
8
11
16

'''


from math import factorial
from functools import reduce

def ncr(n, r):
    r = min(r, n-r)
    numer = reduce(op.mul, range(n, n-r, -1), 1)
    denom = reduce(op.mul, range(1, r+1), 1)
    return numer // denom

def npr(n, r):
    return factorial(n) // factorial(n - r)

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

def factorial_exps(x):
    n = int(x)
    for i in range(1, n):
        print(n,"!=", factorial(n))

def ncr_exps(x):
    n = int(x)
    r = n // 2
    for i in range(1, n):
        print(n,"C", r,"=", ncr(n, r))

def npr_exps(x):
    n = int(x)
    r = n // 2
    for i in range(1, n):
        print(n,"P", r,"=", npr(n, r))

def main():
    t = input()
    for i in range(int(t)):
        n = input()
        b = list(map(int, input().strip().split(' ')))
        a = [0 for i in range(int(n))]
        for i in range(int(n)):
            for j in range(i, int(n)):
                a[j] += 1
        for i in range(int(n)):
            if a[i] > b[i]:
                a[i] = None
                break
        if a is None:
            print(0)
        else:
            print(a)

main()

'''

The first input line contains an integer T denoting the number of test cases.
The description of T test cases follows.
The first line of each test case contains a single integer N denoting the number of elements in A.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.


Constraints
1 ≤ T ≤ 100
1 ≤ N ≤ 100
0 ≤ Ai ≤ 100

For each test case, output a single line containing the required answer.

Example
Input:
2
3
1 2 3
4
4 3 2 1

Output:
2
0

'''