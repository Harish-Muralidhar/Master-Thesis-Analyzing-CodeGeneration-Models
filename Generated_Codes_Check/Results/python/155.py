"""

import math

def isPalindrome(s):
    if s == s[::-1]:
        return 1
    return 0


def palindromicPartition(s):
    if isPalindrome(s):
        return 1

    ans = math.inf

    for i in range(1, len(s)):
        if isPalindrome(s[:i]):
            ans = min(ans, 1 + palindromicPartition(s[i:]))

    return ans


if __name__ == '__main__':
    print(palindromicPartition("ABCCBDA"))

"""

def isPalindrome(s):
    if s == s[::-1]:
        return 1
    return 0


def palindromicPartition(s):
    if isPalindrome(s):
        return 1

    ans = math.inf

    for i in range(1, len(s)):
        if isPalindrome(s[:i]):
            ans = min(ans, 1 + palindromicPartition(s[i:]))

    return ans


print(palindromicPartition("ABCCBDA"))