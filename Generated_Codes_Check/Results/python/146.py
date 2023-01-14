"""
"""

#CODE:

import sys
mod=10**9+7
a=sys.stdin.read().split('\n')
test=int(a[0])
for i in range(test):
    c=a[i+1].split()
    if len(c)==2:
        l,r=int(c[0]),int(c[1])
        sum1=0
        for j in range(l,r+1):
            sum1+=j**j
        print(sum1%mod)