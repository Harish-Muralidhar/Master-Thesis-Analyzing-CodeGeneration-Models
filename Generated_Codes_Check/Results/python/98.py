"""

"""

import numpy as np

def subset_sum(nums, target):
    dp = [1] + [0] * target
    for n in nums:
        for i in range(target, n-1, -1):
            dp[i] += dp[i-n]
    return dp[target]


T = int(input())
for _ in range(T):
    N, Q = map(int, input().split())
    nums = list(map(int, input().split()))
    for _ in range(Q):
        M = int(input())
        cnt = subset_sum(nums, M)
        print(cnt % (10**9+9))