"""


Solution :

Python 3 code for the above problem:

import numpy
def solve(a,m,x,y):
    for i in range(m):
        for j in range(1,len(a)):
            a.insert(j,a[j-1]+a[j])
    return numpy.sum(a[x-1:y])
for i in range(int(input())):
    inp = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    print(solve(a,inp[1],inp[2],inp[3]))



# Python 3 code for the above problem:

import numpy
def solve(a,m,x,y):
    for i in range(m):
        for j in range(1,len(a)):
            a.insert(j,a[j-1]+a[j])
    return numpy.sum(a[x-1:y])
for i in range(int(input())):
    inp = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    print(solve(a,inp[1],inp[2],inp[3]))
 
"""

"""
Problem Statement:

Chef has a an array A consisting of N elements. He wants to add some elements into the array as per the below mentioned process.
After each minute, Chef iterates over the array in order from left to right, and takes every two neighbouring pair of elements, say x and y, he adds a new element x + y in the middle of elements x and y.
For example, if initial array A = {1, 6, 9}.

After first minute, the array A will be equal to {1, 7, 6, 15, 9}. Please note that the elements shown in the bold font are the newly added elements during first minute. As you can observe that 7 = 1 + 6, and 15 = 6 + 9.
After second minute, the array will be {1, 8, 7, 13, 6, 21, 15, 24, 9}. Once again, elements added during the second minute, are shown in bold. 

Chef wants to know the sum of elements between x^th and y^th positions in the array A (i.e. Ax + Ax + 1 + ... + Ay) after m minutes. As the answer could be large, output it modulo 10^9+7 (1000000007). Please note that we use 1 based indexing in the problem.

Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains four space-separated integers N, m, x, y denoting the number of elements in the array A in the beginning, amount of minutes and range for finding sum.
The second line contains N space-separated integers A1, A2, ..., AN denoting the array A in the beginning. 


Output

For each test case, output a single line containing an integer corresponding to the sum of elements between x^th and y^th positions in the array A after m minutes modulo 10^9+7.


Constraints

1 ≤ T ≤ 10
1 ≤ N ≤ 10^5
1 ≤ Ai ≤ 10^3
1 ≤ m ≤ 30
1 ≤ x ≤ y ≤ size of the array A (|A|) after m minutes


Example
Input:
2
3 1 1 5
1 6 9
3 2 6 7
1 6 9

Output:
38
36


Explanation
Example case 1. After the first minute A = {1, 7, 6, 15, 9} and sum of all elements will be 38.
Example case 2. After the second minute the array A will be {1, 8, 7, 13, 6, 21, 15, 24, 9} and sum of elements between 6^th and 7^th equals to 21 + 15 = 36.

Solution :

Python 3 code for the above problem:

import numpy
def solve(a,m,x,y):
    for i in range(m):
        for j in range(1,len(a)):
            a.insert(j,a[j-1]+a[j])
    return numpy.sum(a[x-1:y])
for i in range(int(input())):
    inp = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    print(solve(a,inp[1],inp[2],inp[3]))



# Python 3 code for the above problem:

import numpy
def solve(a,m,x,y):
    for i in range(m):
        for j in range(1,len(a)):
            a.insert(j,a[j-1]+a[j])
    return numpy.sum(a[x-1:y])
for i in range(int(input())):
    inp = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    print(solve(a,inp[1],inp[2],inp[3]))
 
"""

"""
Problem Statement:

Chef has a an array A consisting of N elements. He wants to add some elements into the array as per the below mentioned process.
After each minute, Chef iterates over the array in order from left to right, and takes every two neighbouring pair of elements, say x and y, he adds a new element x + y in the middle of elements x and y.
For example, if initial array A = {1, 6, 9}.

After first minute, the array A will be equal to {1, 7, 6, 15, 9}. Please note that the elements shown in the bold font are the newly added elements during first minute. As you can observe that 7 = 1 + 6, and 15 = 6 + 9.
After second minute, the array will be {1, 8, 7, 13, 6, 21, 15, 24, 9}. Once again, elements added during the second minute, are shown in bold. 

Chef wants to know the sum of elements between x^th and y^th positions in the array A (i.e. Ax + Ax + 1 + ... + Ay) after m minutes. As the answer could be large, output it modulo 10^9+7 (1000000007). Please note that we use 1 based indexing in the problem.

Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains four space-separated integers N, m, x, y denoting the number of elements in the array A in the beginning, amount of minutes and range for finding sum.
The second line contains N space-separated integers A1, A2, ..., AN denoting the array A in the beginning. 


Output

For each test case, output a single line containing an integer corresponding to the sum of elements between x^th and y^th positions in the array A after m minutes modulo 10^9+7.


Constraints

1 ≤ T ≤ 10
1 ≤ N ≤ 10^5
1 ≤ Ai ≤ 10^3
1 ≤ m ≤ 30
1 ≤ x ≤ y ≤ size of the array A (|A|) after m minutes


Example
Input:
2
3 1 1 5
1 6 9
3 2 6 7
1 6 9

Output:
38
36


Explanation
Example case 1. After the first minute A = {1, 7, 6, 15, 9} and sum of all elements will be 38.
Example case 2. After the second minute the array A will be {1, 8, 7, 13, 6, 21, 15, 24, 9} and sum of elements between 6^th and 7^th equals to 21 + 15 = 36.

Solution :

Python 3 code for the above problem:

import numpy
def solve(a,m,x,y):
    for i in range(m):
        for j in range(1,len(a)):
            a.insert(j,a[j-1]+a[j])
    return numpy.sum(a[x-1:y])
for i in range(int(input())):
    inp = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    print(solve(a,inp[1],inp[2],inp[3]))



# Python 3 code for the above problem:

import numpy
def solve(a,m,x,y):
    for i in range(m):
        for j in range(1,len(a)):
            a.insert(j,a[j-1]+a[j])
    return numpy.sum(a[x-1:y])
for i in range(int(input())):
    inp = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    print(solve(a,inp[1],inp[2],inp[3]))
 
"""

"""
Problem Statement:

Chef has a an array A consisting of N elements. He wants to add some elements into the array as per the below mentioned process.
After each minute, Chef iterates over the array in order from left to right, and takes every two neighbouring pair of elements, say x and y, he adds a new element x + y in the middle of elements x and y.
For example, if initial array A = {1, 6, 9}.

After first minute, the array A will be equal to {1, 7, 6, 15, 9}. Please note that the elements shown in the bold font are the newly added elements during first minute. As you can observe that 7 = 1 + 6, and 15 = 6 + 9.
After second minute, the array will be {1, 8, 7, 13, 6, 21, 15, 24, 9}. Once again, elements added during the second minute, are shown in bold. 

Chef wants to know the sum of elements between x^th and y^th positions in the array A (i.e. Ax + Ax + 1 + ... + Ay) after m minutes. As the answer could be large, output it modulo 10^9+7 (1000000007). Please note that we use 1 based indexing in the problem.

Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains four space-separated integers N, m, x, y denoting the number of elements in the array A in the beginning, amount of minutes and range for finding sum.
The second line contains N space-separated integers A1, A2, ..., AN denoting the array A in the beginning. 


Output

For each test case, output a single line containing an integer corresponding to the sum of elements between x^th and y^th positions in the array A after m minutes modulo 10^9+7.


Constraints

1 ≤ T ≤ 10
1 ≤ N ≤ 10^5
1 ≤ Ai ≤ 10^3
1 ≤ m ≤ 30
1 ≤ x ≤ y ≤ size of the array A (|A|) after m minutes


Example
Input:
2
3 1 1 5
1 6 9
3 2 6 7
1 6 9

Output:
38
36


Explanation
Example case 1. After the first minute A = {1, 7, 6, 15, 9} and sum of all elements will be 38.
Example case 2. After the second minute the array A will be {1, 8, 7, 13, 6, 21, 15, 24, 9} and sum of elements between 6^th and 7^th equals to 21 + 15 = 36.

Solution :

Python 3 code for the above problem:

import numpy
def solve(a,m,x,y):
    for i in range(m):
        for j in range(1,len(a)):
            a.insert(j,a[j-1]+a[j])
    return numpy.sum(a[x-1:y])
for i in range(int(input())):
    inp = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    print(solve(a,inp[1],inp[2],inp[3]))



# Python 3 code for the above problem:

import numpy
def solve(a,m,x,y):
    for i in range(m):
        for j in range(1,len(a)):
            a.insert(j,a[j-1]+a[j])
    return numpy.sum(a[x-1:y])
for i in range(int(input())):
    inp = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    print(solve(a,inp[1],inp[2],inp[3]))
 
"""

"""
Problem Statement:

Chef has a an array A consisting of N elements. He wants to add some elements into the array as per the below mentioned process.
After each minute, Chef iterates over the array in order from left to right, and takes every two neighbouring pair of elements, say x and y, he adds a new element x + y in the middle of elements x and y.
For example, if initial array A = {1, 6, 9}.

After first minute, the array A will be equal to {1, 7, 6, 15, 9}. Please note that the elements shown in the bold font are the newly added elements during first minute. As you can observe that 7 = 1 + 6, and 15 = 6 + 9.
After second minute, the array will be {1, 8, 7, 13, 6, 21, 15, 24, 9}. Once again, elements added during the second minute, are shown in bold. 

Chef wants to know the sum of elements between x^th and y^th positions in the array A (i.e. Ax + Ax + 1 + ... + Ay) after m minutes. As the answer could be large, output it modulo 10^9+7 (1000000007). Please note that we use 1 based indexing in the problem.

Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains four space-separated integers N, m, x, y denoting the number of elements in the array A in the beginning, amount of minutes and range for finding sum.
The second line contains N space-separated integers A1, A2, ..., AN denoting the array A in the beginning. 


Output

For each test case, output a single line containing an integer corresponding to the sum of elements between x^th and y^th positions in the array A after m minutes modulo 10^9+7.


Constraints

1 ≤ T ≤ 10
1 ≤ N ≤ 10^5
1 ≤ Ai ≤ 10^3
1 ≤ m ≤ 30
1 ≤ x ≤ y ≤ size of the array A (|A|) after m minutes


Example
Input:
2
3 1 1 5
1 6 9
3 2 6 7
1 6 9

Output:
38
36


Explanation
Example case 1. After the first minute A = {1, 7, 6, 15, 9} and sum of all elements will be 38.
Example case 2. After the second minute the array A will be {1, 8, 7, 13, 6, 21, 15, 24, 9} and sum of elements between 6^th and 7^th equals to 21 + 15 = 36.

Solution :

Python 3 code for the above problem:

import numpy
def solve(a,m,x,y):
    for i in range(m):
        for j in range(1,len(a)):
            a.insert(j,a[j-1]+a[j])
    return numpy.sum(a[x-1:y])
for i in range(int(input())):
    inp = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    print(solve(a,inp[1],inp[2],inp[3]))



# Python 3 code for the above problem:

import numpy
def solve(a,m,x,y):
    for i in range(m):
        for j in range(1,len(a)):
            a.insert(j,a[j-1]+a[j])
    return numpy.sum(a[x-1:y])
for i in range(int(input())):
    inp = [int