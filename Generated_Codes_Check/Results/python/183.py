'''

'''

import sys


t = int(raw_input().strip())
for a0 in xrange(t):
    n,k = raw_input().strip().split(' ')
    n,k = [int(n),int(k)]
    # your code goes here
    n = n**n
    digits = str(n)
    print int(digits[:k]), int(digits[len(digits)-k:])