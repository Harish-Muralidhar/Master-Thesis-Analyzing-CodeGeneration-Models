"""
"""

import math
n = int(input())
for i in range(n):
    a,b = list(map(int,(input().split())))
    arr = []
    arr = list(map(int,(input().split())))
    max_ = 0
    for i in range(a):
        temp = arr[i:]
        temp = temp[0:b]
        ans = 0
        for j in range(b):
            ans = ans|temp[j]
        if(ans>max_):
            max_ = ans
    print(max_)