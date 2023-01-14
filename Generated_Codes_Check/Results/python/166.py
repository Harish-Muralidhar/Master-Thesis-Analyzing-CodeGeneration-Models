"""
"""
import sys

MODULO = 1000000009

def get_patterns(f=sys.stdin):
    t = int(f.readline().strip())

    for _ in range(t):
        n, m, k = map(int, f.readline().strip().split())
        result = 0

        # 1. If k = 0, it is the same as genjiko.
        if k == 0:
            # In the traditional game genjiko, we make connections between each possible answer and the name of a book of The Tale of Genji.
            # However The Tale of Genji is composed of 54 books, so the names of the first book and the last book are unused.
            result = 52

        # 2. Else, given the condition of the game, we can only use one of the two patterns "ABA" or "BAB".
        else:
            result = 2

        print(result)

get_patterns()