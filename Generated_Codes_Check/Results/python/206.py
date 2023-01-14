'''

Explanation
Example case 1. The input sequence is already sorted.

Example case 2. The input sequence is "2 4 1 3 5", and the distance between the current position of any value and its correct position is 2. For example, the distance between 4 and its correct position (which is 2) is 2.
'''

import sys

def distance(arr, n):
    for i in range(n):
        if abs(arr[i] - (i+1)) > 1:
            return False
    return True

t = int(input().strip())

for i in range(t):
    n = int(input().strip())
    arr = list(map(int, input().strip().split()))
    if distance(arr, n):
        print("YES")
    else:
        print("NO")