'''

There are 6 possible gameplays.

A0A1A2 — score = 1 * 2 * 1 = 2
A0A2A1 — score = 1 * 1 * 2 = 2
A1A0A2 — score = 2 * 1 * 1 = 2
A1A2A0 — score = 2 * 1 * 1 = 2
A2A0A1 — score = 1 * 1 * 2 = 2
A2A1A0 — score = 1 * 2 * 1 = 2

So sum of scores of all gameplays = 2 + 2 + 2 + 2 + 2 + 2 = 12

However, A2A0A1 and A2A1A0 are considered to be the same gameplay as after writing all numbers, they give same result when read from left to right. So, the answer is 12 – 2 = 10.

'''

#code
t = int(input())

for i in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    arr1 = arr.copy()
    arr2 = arr.copy()
    arr1.reverse()
    arr = arr1+arr2
    dp = [-1]*(2*n+1)
    dp[0] = 0
    dp[1] = 0
    dp[2] = arr[1]+arr[0]
    for j in range(3,2*n+1):
        dp[j] = max(arr[j-1]*arr[j-2]+dp[j-2],dp[j-1])
    print(dp[2*n])