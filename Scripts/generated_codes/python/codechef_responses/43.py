'''

'''

import math
import os
import random
import re
import sys

# Complete the function below.

def schedule(A, B):
    count=0
    for i in range(0,len(A)):
        if B[i] <= A[i]:
            count+=1
    return count


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        A = list(map(int, input().rstrip().split()))

        B = list(map(int, input().rstrip().split()))

        result = schedule(A, B)

        fptr.write(str(result) + "\n")

    fptr.close()