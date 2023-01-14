'''

Input:
2
3 10
3 4 5
4 4 5
3 10
3 4 5
5 4 5

Output:
12
15

Explanation

Test Case 1: This is same as Sample Test Case.
Test Case 2: Here if Chef picks stones of second kind he can pick 2 stones, he will get a profit of 2*5 = 10 Rs. 
If Chef picks stones of third kind he can pick 3 stones, he will get a profit of 3*5 = 15 Rs. 


So the maximum possible profit is 15.



'''

import sys
import math

n = int(input())
profit = 0

for i in range(n):
    k = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    profit = 0
    for j in range(len(a)):
        if k % a[j] == 0:
            profit = max(profit, (int(k / a[j])) * b[j])
    print(profit)