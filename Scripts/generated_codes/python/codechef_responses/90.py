'''


Solution:
'''

import numpy as np

def matrix_mul(A,B):
    C = np.zeros(A.shape)
    for i in range(A.shape[0]):
        for j in range(B.shape[1]):
            C[i,j] = np.logical_or(np.logical_not(A[i,j]),B[i,j])
    return C

def matrix_not(A):
    B = np.zeros(A.shape)
    for i in range(A.shape[0]):
        for j in range(A.shape[1]):
            B[i,j] = np.logical_not(A[i,j])
    return B

def print_matrix(A):
    for i in range(A.shape[0]):
        for j in range(A.shape[1]):
            print(int(A[i,j]),end=' ')
        print()

def solve(A):
    X = np.zeros(A.shape)
    for i in range(A.shape[0]):
        for j in range(A.shape[1]):
            if i==j:
                X[i,i] = 1
            else:
                X[i,j] = not(A[i,i] or A[j,j])
    left = matrix_mul(A,X)
    right = matrix_mul(X,A)
    if np.array_equal(left,matrix_not(np.zeros(A.shape))):
        return X
    else:
        return -1

if __name__ == '__main__':
    T = int(input())
    for _ in range(T):
        N = int(input())
        A = np.zeros((N,N))
        for i in range(N):
            A[i,:] = [int(i) for i in input().split()]
        print_matrix(solve(A))