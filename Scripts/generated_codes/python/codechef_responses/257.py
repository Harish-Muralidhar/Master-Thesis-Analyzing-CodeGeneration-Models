"""

Explanation
Example case 1.
The dot on the first fan moves with speed of 1 unit in one second. The dot on the second fan moves with speed of 2 units in one second. Since the lengths of both the blades are same, therefore the dots on both the fans will coincide only once.

Example case 2.
The dot on the first fan moves with speed of 6 units in one second. The dot on the second fan moves with speed of 5 units in one second. Since the lengths of both the blades are same, therefore the dots on both the fans will coincide only once.

Example case 3.
The dot on the first fan moves with speed of 1 unit in one second. The dot on the second fan moves with speed of 2 units in one second. Since the lengths of both the blades are same, therefore the dots on both the fans will coincide only once.

"""

from fractions import gcd

t = int(input())

while t > 0:
    x, y = [int(x) for x in input().split()]
    
    if (x == 0 or y == 0):
        print(1)
    else:
        print(abs(gcd(x, y)))
    t -= 1