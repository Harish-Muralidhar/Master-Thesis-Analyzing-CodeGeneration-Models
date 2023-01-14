"""

"""

import sys

# Write your code here

def remove_numbers(nums):
    res = []
    for i in nums:
        if not res or i >= res[-1]:
            res.append(i)
    return len(res)

n = int(input())
nums = [int(i) for i in input().split()]
print(remove_numbers(nums))