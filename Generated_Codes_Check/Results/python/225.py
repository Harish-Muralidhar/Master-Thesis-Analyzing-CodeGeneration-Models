"""


"""

#Solution 1 (Recursion)
import math
def check_prime(num):
    if num > 1:
        for i in range(2, int(math.sqrt(num)) + 1):
            if num % i == 0:
                return False
        return True
    return False

def check_cpc(grid, i, j, r, c):
    if grid[i][j] == '#':
        return 0
    left = 1
    right = 1
    top = 1
    bottom = 1
    for l in range(j - 1, -1, -1):
        if grid[i][l] == '#':
            break
        left += 1
    for r in range(j + 1, c):
        if grid[i][r] == '#':
            break
        right += 1
    for t in range(i - 1, -1, -1):
        if grid[t][j] == '#':
            break
        top += 1
    for b in range(i + 1, r):
        if grid[b][j] == '#':
            break
        bottom += 1
    min_val = min(left, right, top, bottom)
    count = 0
    for n in range(2, min_val + 1):
        if check_prime(n):
            count += 1
    return count

def get_monster_count(grid, r, c):
    count = 0
    for i in range(r):
        for j in range(c):
            count += check_cpc(grid, i, j, r, c)
    return count

grid = [
        ['#', '^', '^', '^', '^', '^', '#', '^', '#', '#'],
        ['^', '^', '^', '^', '^', '^', '^', '^', '^', '^'],
        ['^', '^', '^', '^', '^', '^', '^', '^', '^', '#']
        ]
r = 3
c = 10
print(get_monster_count(grid, r, c))

grid = [
        ['^', '^', '^', '^', '#', '^', '^', '^', '^', '#'],
        ['^', '^', '^', '^', '^', '^', '^', '#', '^', '^'],
        ['^', '^', '#', '#', '^', '^', '#', '^', '#', '^'],
        ['#', '^', '^', '^', '^', '^', '^', '^', '#', '^'],
        ['^', '^', '#', '^', '^', '^', '^', '^', '^', '^'],
        ['^', '^', '^', '^', '#', '^', '^', '^', '^', '^'],
        ['^', '^', '^', '^', '^', '^', '^', '^', '^', '^']
        ]
r = 7
c = 10
print(get_monster_count(grid, r, c))


#Solution 2 (Non-Recursion)