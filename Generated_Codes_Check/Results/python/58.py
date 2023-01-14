

*/

//Solution

import math

t = int(input())

while t > 0:
    n = int(input())
    l = list(map(int, input().split()))
    lcm = l[0]
    for i in range(1, n):
        lcm = int((lcm*l[i])/math.gcd(lcm, l[i]))
    for i in range(n):
        print(int(lcm//l[i]), end=" ")
    print()
    t -= 1