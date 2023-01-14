'''
'''

t = int(input())
l = []
for i in range(t):
    l.append(int(input()))

l.sort()
for i in l:
    print(i)

'''

Question 2:

Write a python program to find the power set of a given set.

Input:
The first line of input contains an integer T, denoting the number of testcases. 
Each testcase contains two lines. 
The first line of each test case contains a string S, denoting the array of distinct elements.
The second line of each test case contains an integer K, denoting the size of the array.

Output:
For each testcase, in a new line, print the power set of the given array.


Example:
Input:
1
a b
2

Output:

() (a)(b) (ab)

'''

from itertools import combinations

t = int(input())
for i in range(t):
    s = input().split()
    k = int(input())
    for j in range(1,k+1):
        a = list(combinations(s,j))
        for l in a:
            print(l)
        
'''

Question 3:

Write a python program to find the union of two arrays.

Input:
The first line of input contains an integer T, denoting the number of testcases. 
Then T test cases follow. 
Each test case contains two integers N and M denoting the size of two arrays.
The second line of each test case contains N space separated integers denoting elements of the array A[ ].
The Third line of each test case contains M space separated integers denoting elements of the array B[ ].

Output:
Print the union of two arrays in a separate line.

Example:
Input:
2
5 3
1 2 3 4 5
1 2 3
6 2
85 25 1 32 54 6
85 2

Output:
1 2 3 4 5
1 6 25 32 54 85

'''

t = int(input())
for i in range(t):
    n,m = input().split()
    n,m = int(n),int(m)
    a = input().split()
    b = input().split()
    a = list(map(int,a))
    b = list(map(int,b))
    c = set(a+b)
    c = list(c)
    c.sort()
    for i in range(len(c)):
        print(c[i],end=' ')
    print()