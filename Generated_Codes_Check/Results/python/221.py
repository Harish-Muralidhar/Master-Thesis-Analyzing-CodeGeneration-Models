'''

'''

import math
for i in range(int(input())):
    n,m=map(int,input().split())
    if(n+m>5):
        print((n*m)*(n*m-1)//2-4*(n-2)*(m-2))
    else:
        print((n*m)*(n*m-1)//2)