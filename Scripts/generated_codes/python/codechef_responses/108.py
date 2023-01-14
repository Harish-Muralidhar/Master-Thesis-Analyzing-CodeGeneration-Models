 */
import math
import sys

def count_guns(x1, x2, y):
    return x2 - x1 + 1

t = int(input())
while t:
    t -= 1
    y, x1, x2 = map(int, input().split())

    ans = 0
    if count_guns(x1, x2, y) > 1:
        if y < 0:
            if x1 < 0:
                if x2 < 0:
                    ans = count_guns(x1, x2, y)
                else:
                    ans = count_guns(x1, x2, y) + 1
            else:
                ans = count_guns(x1, x2, y) + 2
        else:
            if x1 < 0:
                if x2 < 0:
                    ans = count_guns(x1, x2, y)
                else:
                    ans = count_guns(x1, x2, y) + 1
            else:
                ans = count_guns(x1, x2, y)
    else:
        if y < 0:
            if x1 < 0:
                if x2 < 0:
                    ans = count_guns(x1, x2, y)
                else:
                    ans = count_guns(x1, x2, y) + 1
            else:
                ans = count_guns(x1, x2, y) + 1
        else:
            if x1 < 0:
                if x2 < 0:
                    ans = count_guns(x1, x2, y) + 1
                else:
                    ans = count_guns(x1, x2, y) + 1
            else:
                ans = count_guns(x1, x2, y)

    print(ans)