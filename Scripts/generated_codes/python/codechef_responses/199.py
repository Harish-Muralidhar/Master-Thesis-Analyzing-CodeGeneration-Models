'''

Explanation
Example case 2.
Is it possible to make N equal pieces?
No, there are no integer angles that can be split into 7 equal integer angles.
Is it possible to make N pieces?
Yes, you can cut 7 pieces each with 45 degrees angle.
Is it possible to make N pieces, such that no two of them are equal?
Yes, you can cut 7 pieces with angles 41, 42, 43, 44, 45, 46, 47.
'''

import sys

def equal_pieces(N):
    if N == 1:
        return 'y'
    if N == 2:
        return 'n'
    if N == 3 or N == 4 or N == 6:
        return 'y'
    for i in range(3, int(N / 2) + 2):
        if N % i == 0:
            return 'n'
    return 'y'

def not_equal_pieces(N):
    return 'y'

def all_equal(N):
    return 'y'

def get_result(N):
    equal = equal_pieces(N)
    not_equal = not_equal_pieces(N)
    all_equal = all_equal(N)
    return ' '.join([equal, not_equal, all_equal])

if __name__ == '__main__':
    lines = sys.stdin.readlines()
    num_cases = int(lines[0])
    for i in range(1, num_cases + 1):
        N = int(lines[i])
        print(get_result(N))