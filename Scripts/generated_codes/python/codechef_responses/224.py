"""

"""

import numpy as np

def prime_cross_cell(grid, row, col):
    # compute L, R, T, B
    L = 0
    R = 0
    T = 0
    B = 0

    for i in range(col-1, -1, -1):
        if grid[row][i] == '#':
            break
        L += 1

    for i in range(col+1, len(grid[0])):
        if grid[row][i] == '#':
            break
        R += 1

    for i in range(row-1, -1, -1):
        if grid[i][col] == '#':
            break
        T += 1

    for i in range(row+1, len(grid)):
        if grid[i][col] == '#':
            break
        B += 1

    min_LRTB = min(L, R, T, B)
    if min_LRTB == 0:
        return False

    # check if any prime number is less than or equal to the minimum
    for i in range(2, min_LRTB+1):
        if is_prime(i):
            return True
    return False

def is_prime(n):
    if n == 2:
        return True

    for i in range(2, n//2+1):
        if n % i == 0:
            return False
    return True

def main():
    test_cases = int(input())
    for _ in range(test_cases):
        rows, cols = input().split()
        grid = []
        for i in range(int(rows)):
            grid.append(input().strip())
        # print(grid)
        # print(prime_cross_cell(grid, 0, 0))

        count = 0
        for i in range(int(rows)):
            for j in range(int(cols)):
                if grid[i][j] != '#' and prime_cross_cell(grid, i, j):
                    count += 1
        print(count)

if __name__ == '__main__':
    main()