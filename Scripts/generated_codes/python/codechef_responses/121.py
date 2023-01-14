"""
"""

import numpy as np
cases = int(input())
for case in range(cases):
    n = int(input())
    a = np.zeros((n,n))
    for i in range(n):
        temp = list(map(int,input().split()))
        for j in range(n):
            a[i][j] = temp[j]
    """
    array([[ 0.,  0.,  0.],
       [ 1.,  1.,  0.],
       [ 1.,  1.,  0.]])
    """
    b = np.zeros((n,n))
    for i in range(n):
        temp = list(map(int,input().split()))
        for j in range(n):
            b[i][j] = temp[j]
    """
    array([[ 1.,  1.,  1.],
       [ 1.,  1.,  1.],
       [ 1.,  1.,  1.]])
    """
    row = 0
    flag = 0
    for i in range(n):
        if np.sum(a[i])==n:
            pass
        elif np.sum(a[i])==0:
            row += 1
        else:
            flag = 1
            break
    if flag == 1:
        print(-1)
    else:
        print(row)
        for i in range(n):
            if np.sum(a[i])==0:
                print(i+1,end = " ")
        print()
        col = 0
        count = 0
        flag = 0
        for j in range(n):
            if np.sum(a[:,j])==n:
                pass
            elif np.sum(a[:,j])==0:
                col += 1
            else:
                flag = 1
                break
        if flag == 1:
            print(-1)
        else:
            print(col)
            for j in range(n):
                if np.sum(a[:,j])==0:
                    print(j+1,end = " ")
            print()