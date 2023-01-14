'''
'''

import re

def s_f(N, F):
    NF = ' '.join(str(s) for s in N)
    FF = ' '.join(str(s) for s in F)

    if re.search(FF, NF):
        return 'Yes'
    else:
        return 'No'

T = int(input())

for i in range(0, T):
    n = int(input())
    N = list(map(int, input().split(' ')))
    f = int(input())
    F = list(map(int, input().split(' ')))
    print(s_f(N, F))