'''

(2, 3, 1, 4) -> (2, 3) -> (3)


(4, 3, 2, 1) -> (4, 3) -> (4)


(2, 1, 4, 3) -> (2, 4) -> (4)


(3, 4, 1, 2) -> (3, 4) -> (4)


(3, 1, 4, 2) -> (3, 4) -> (4)


(2, 4, 3, 1) -> (2, 4) -> (4)


(1, 4, 2, 3) -> (4, 2) -> (4)


(2, 3, 4, 1) -> (2, 3) -> (3)


(3, 4, 2, 1) -> (3, 4) -> (4)


(1, 2, 4, 3) -> (2, 4) -> (4)


(1, 3, 2, 4) -> (3, 2) -> (3)


(4, 3, 1, 2) -> (4, 3) -> (4)


(4, 2, 3, 1) -> (4, 2) -> (4)


(3, 2, 1, 4) -> (3, 2) -> (3)


(1, 4, 3, 2) -> (4, 3) -> (4)


(1, 3, 4, 2) -> (3, 4) -> (4)


Input:
3

Output:
0
0
64
128
64
0
0
 

Input:
4

Output:
0
0
0
0
512
1024
1024
512
0
0
0
0
0
 

Input:
5

Output:
0
0
0
0
0
0
0
16384
32768
65536
65536
32768
16384
0
0
0
0
0
0
0
0
 

Note
In the first example there are only two possible initial configurations: (1, 2) and (2, 1).

In the third example the winner is always the knight with the strength 3, so the runner-up can be one of the knights with the strength 2, 4 or 5.

In the fourth example the winner is always the knight with the strength 5, so the runner-up can be one of the knights with the strength 2, 4 or 7.

In the fifth example the winner is always the knight with the strength 9, so the runner-up can be one of the knights with the strength 4, 5, 8 or 11.

'''

import sys
import math

def tournament(n):
    # Write your code here
    # To print results to the standard output you can use print
    # Example: print "Hello world!"
    print "Hello world!"

if __name__ == "__main__":
    tournament(int(sys.stdin.readline()))