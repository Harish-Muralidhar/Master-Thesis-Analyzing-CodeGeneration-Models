'''
'''

def f(n):
    if n < 12:
        return n

    if n not in cache:
        cache[n] = f(n/2) + f(n/3) + f(n/4)

    return cache[n]

import sys
cache = {0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:10, 11:11, 12:13}

for line in sys.stdin:
    print f(int(line))