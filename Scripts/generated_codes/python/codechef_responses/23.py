'''
'''

# Write your code here
import math

for _ in range(int(input())):
    n = int(input())
    s = str(n)
    if len(s) == 6:
        print(n//100000, end = " ")
        n = n%100000
    if len(s) >= 5:
        print(n//50000, end = " ")
        n = n%50000
    if len(s) >= 4:
        print(n//10000, end = " ")
        n = n%10000
    if len(s) >= 3:
        print(n//1000, end = " ")
        n = n%1000
    if len(s) >= 2:
        print(n//100, end = " ")
        n = n%100
    if len(s) >= 1:
        print(n//50, end = " ")
        n = n%50
    print(n//10)