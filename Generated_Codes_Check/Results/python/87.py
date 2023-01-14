"""
Test Case 3: There are 12 ways the chef can place the rooks initially. The ways that are marked in bold below are those in which the Sous Chef cannot win. The notation used below is simply the number of rooks placed on each of the 3*2 cells.

1 1
1 1
0 0

1 1
1 0
1 0

1 1
0 1
0 1

1 1
0 0
1 1

1 1
0 0
0 1

1 1
0 1
0 0

2 0
0 0
0 0

0 2
0 0
0 0

0 0
2 0
0 0

0 0
0 2
0 0

0 0
0 0
2 0

0 0
0 0
0 2
Test Case 4: There are 18 ways the chef can place the rooks initially. The ways that are marked in bold below are those in which the Sous Chef cannot win. The notation used below is simply the number of rooks placed on each of the 3*3 cells.

1 1 1
1 1 1
0 0 0

1 1 1
1 1 0
0 1 0

1 1 1
1 1 0
0 0 1

1 1 1
1 0 1
0 0 1

2 1 0
0 1 0
0 0 0

1 2 0
1 0 0
0 0 0

0 1 2
0 1 0
0 0 0

0 0 1
0 0 1
2 0 0

0 0 1
0 0 1
1 1 0

0 0 1
0 0 1
0 2 0

0 0 1
0 0 0
0 1 2

0 0 0
1 1 1
0 1 0

0 0 0
1 1 1
0 0 1

0 0 0
0 1 1
1 1 0

0 0 0
0 1 1
0 2 0

2 0 0
0 0 0
1 0 0

0 2 0
0 0 0
0 1 0

0 0 2
0 0 0
0 0 1

0 0 0
2 0 0
0 1 0

0 0 0
0 2 0
0 0 1
"""

#Solution 1:
def fact(n):
    if n < 2:
        return 1
    return n * fact(n - 1)

t = input()
while t:
    t -= 1
    n, m, k = map(int, raw_input().split(' '))
    print fact(n + m - k) / (fact(n - k) * fact(m - k)) % 10007