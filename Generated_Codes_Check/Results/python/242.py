

*/

import math


t = int(input())

def get_max_sum(n):
    i = 1
    res = 0
    while n > 1:
        if n%i == 0:
            res += i
            n = n/i
        i += 1
    return int(res)


while t:
    n = int(input())
    print(get_max_sum(n))
    t -= 1