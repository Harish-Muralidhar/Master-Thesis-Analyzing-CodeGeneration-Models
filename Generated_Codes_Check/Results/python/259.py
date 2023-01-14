'''


'''


import math
import os
import random
import re
import sys

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    q = int(input())

    for _ in range(q):
        temp = list(map(int, input().rstrip().split()))

        f = 1
        for i in range(temp[0]-1, temp[1]):
            f = (f * arr[i]) % temp[2]
        print(f)