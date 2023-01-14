'''

Explanation

Example case 1. The minimum length of RS can be achieved if LS is vertical. The maximum length of RS can be achieved if LS and RS are in the ratio sqrt(2) : 1.

'''

import math

t = int(input())

for i in range(t):
    B, LS = map(int,input().split())
    print('{:.6f}'.format(B),'{:.6f}'.format(math.sqrt(LS**2-B**2)))