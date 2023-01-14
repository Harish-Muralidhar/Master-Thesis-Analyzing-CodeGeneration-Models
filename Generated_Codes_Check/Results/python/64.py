"""

"""


def smallest_pair_sum(arr, n):
    """Function to return the smallest pair sum in the array"""
    return sum(sorted(arr)[0:2])


if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        n = int(input())
        arr = [int(i) for i in input().split()][0:n]
        print(smallest_pair_sum(arr, n))