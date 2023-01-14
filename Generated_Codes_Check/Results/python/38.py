'''


'''

import math as m

def square_root(n):
    return m.sqrt(n)

T = int(input())

for i in range(T):
    N = int(input())
    print(int(square_root(N)))