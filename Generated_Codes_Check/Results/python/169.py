"""
  The pattern 5 8 1 4 9 is one of the solutions. The probability is 0.9 * (1 - 0.9) * 0.9 * (1 - 0.9) * 0.9 = 0.092.


Explanation
The first case is explained in the Output section.

The second case is easy, since K = 1.

The third case is also easy, since N = 1.

In the fourth case, any K problems with probability of 0.9 will be chosen.

"""


def find(number, arr):
    for num in arr:
        if num == number:
            return True
    return False


def main():
    t = int(input())
    for _ in range(t):
        n, k = map(int, input().split())
        arr = sorted(map(int, input().split()), reverse=True)
        count = 0
        ans = []
        while count < k:
            index = 0
            while find(index+1, ans):
                index += 1
            ans.append(index+1)
            count += 1
        print(' '.join(map(str, ans)))


if __name__ == '__main__':
    main()