'''


'''
import time
import sys

start = time.time()

def is_divisible(numerator, denominator):
    if numerator % denominator == 0:
        return True
    else:
        return False

def is_divisible_by_k(numbers, k):
    divisible = [i for i in numbers if is_divisible(i, k)]
    return divisible

def read_numbers(num_lines):
    numbers = []
    for i in range(num_lines):
        line = sys.stdin.readline().strip()
        number = int(line)
        numbers.append(number)
    return numbers

def main():
    num_lines, k = [int(i) for i in sys.stdin.readline().strip().split()]
    numbers = read_numbers(num_lines)
    divisible = is_divisible_by_k(numbers, k)
    print(len(divisible))
    print(time.time() - start)

if __name__ == "__main__":
    main()