'''


Solution

'''

import math
import os
import random
import re
import sys

# Complete the chefAndGifts function below.
def chefAndGifts(n, m, k):
    mn=min(n,m)
    if mn<k:
        if n==m or n-m==k:
            return 0
        else:
            return abs(n-m-k)
    else:
        if k%2==0:
            if m-n==k/2:
                return 0
            else:
                return min(abs(m-n-k/2),abs(m-n+k/2))
        else:
            if m-n==k/2 or m-n==k/2+1:
                return 0
            else:
                return min(abs(m-n-k/2),abs(m-n-k/2-1),abs(m-n+k/2),abs(m-n+k/2+1))

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        nmk = input().split()

        n = int(nmk[0])

        m = int(nmk[1])

        k = int(nmk[2])

        result = chefAndGifts(n, m, k)

        fptr.write(str(result) + '\n')

    fptr.close()