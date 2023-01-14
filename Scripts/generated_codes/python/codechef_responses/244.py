'''

'''




import math

def chefonacci(n):
    return int(((1+math.sqrt(5))**n-(1-math.sqrt(5))**n)/(2**n*math.sqrt(5)))

def ways(x, k):
    if x == 0:
        if k == 0:
            return 1
        return 0
    
    if k == 1:
        if chefonacci(x):
            return 1
        else:
            return 0
    
    if k == 2:
        for i in range(1, x):
            if chefonacci(i) and chefonacci(x-i):
                return 1
        return 0
    
    for i in range(1, x):
        for j in range(1, x-i):
            if chefonacci(i) and chefonacci(j) and chefonacci(x-i-j):
                return ways(x-i-j, k-2)+1
    return 0

t = int(input())
for _ in range(t):
    x, k = map(int, input().split())
    print(ways(x, k))