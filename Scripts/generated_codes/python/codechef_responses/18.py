"""

"""

import math

def zeroes_in_factorial(n):
    count = 0
    i = 5
    while n / i >= 1:
        count += int(n/i)
        i *= 5
    return count

def main():
    T = int(input())
    numbers = [int(input()) for _ in range(T)]
    for n in numbers:
        print(zeroes_in_factorial(n))

if __name__ == "__main__":
    main()