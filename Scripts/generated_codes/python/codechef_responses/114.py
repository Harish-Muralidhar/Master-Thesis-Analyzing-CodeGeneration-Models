'''
'''
import math
for _ in range(int(input())):
    r,c,g=map(int,input().split())
    s=0
    print(c+1)
    for i in range(r,c+1):
        if s+math.factorial(i)//(math.factorial(i-r)*math.factorial(r))<=g:
            print(math.factorial(i)//(math.factorial(i-r)*math.factorial(r)),end=" ")
            s+=math.factorial(i)//(math.factorial(i-r)*math.factorial(r))
        else:
            print(g-s,end=" ")
            s=g
    print()