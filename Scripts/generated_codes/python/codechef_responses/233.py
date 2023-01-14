'''

Approach:
We first calculate the prefix xor matrix of the given matrix.
This is done by running a loop over the given matrix from the left and from the top,
and calculating the xor values of the elements present above and left of the current element.

To calculate the xor of the submatrix where the top left corner is (i1,j1) and the bottom right corner is (i2, j2),
we calculate xor of the elements (1,1) and (i1,j1) and (i2,j2) and (n,n),
where (1,1) is the top left corner of the given matrix and (n,n) is the bottom right corner of the given matrix.

This can be done by first initializing result as 0,
and then calculating xor of the elements (1,1) and (i1,j1) and (i2,j2) and (n,n) and xoring these values with result.

Then we loop over all possible pairs (i1,j1)(i1,j1) and (i2,j2)(i2,j2) and calculate the xor of the submatrix and update the result.

'''


for _ in range(int(input())):
    n = int(input())
    a = []
    for __ in range(n):
        a.append(list(map(int,input().split())))
    p = [[0 for __ in range(n)]for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if j == 0 and i == 0:
                p[i][j] = a[i][j]
            elif i == 0:
                p[i][j] = p[i][j-1]^a[i][j]
            elif j == 0:
                p[i][j] = p[i-1][j]^a[i][j]
            else:
                p[i][j] = p[i-1][j]^p[i][j-1]^p[i-1][j-1]^a[i][j]
    r = 0
    for i1 in range(n):
        for j1 in range(n):
            for i2 in range(i1,n):
                for j2 in range(j1,n):
                    if i1 == 0 and j1 == 0:
                        x = p[i2][j2]
                    elif i1 == 0:
                        x = p[i2][j2]^p[i2][j1-1]
                    elif j1 == 0:
                        x = p[i2][j2]^p[i1-1][j2]
                    else:
                        x = p[i2][j2]^p[i2][j1-1]^p[i1-1][j2]^p[i1-1][j1-1]
                    r = max(r,x)
    print(r)