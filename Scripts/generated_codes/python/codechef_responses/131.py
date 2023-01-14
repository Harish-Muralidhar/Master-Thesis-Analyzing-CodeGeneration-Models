"""
"""

import math
import os
import random
import re
import sys


def inversions(m,k,n,x,y,a):
    li = []
    for ii in range(m):
        li.append(str(ii+1))
    
    if a == li[:n]:
        return 0
    else:
        for ii in range(k):
            if li[x[ii]-1] == a[y[ii]-1]:
                li[x[ii]-1],li[y[ii]-1] = li[y[ii]-1],li[x[ii]-1]
        if a == li[:n]:
            return 1
        else:
            return -1


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        mkn = input().split()

        m = int(mkn[0])

        k = int(mkn[1])

        n = int(mkn[2])

        xy = []

        for _ in range(k):
            xy.append(list(map(int, input().rstrip().split())))

        a = list(map(int, input().rstrip().split()))

        fptr.write(str(inversions(m,k,n,xy[0],xy[1],a)) + '\n')

    fptr.close()