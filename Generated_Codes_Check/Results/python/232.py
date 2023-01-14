"""


"""

def max_stones_chef_can_remove(A, n):
    dp = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if i == j:
                dp[i][j] = A[i]
            else:
                dp[i][j] = dp[i][j-1] + A[j]
    for i in range(n):
        for j in range(n):
            dp[i][j] = max(dp[i][j], dp[i+1][j])
    return dp[0][n-1]

if __name__ == "__main__":
    t = int(input())
    while t:
        n = int(input())
        A = list(map(int, input().split()))
        print(max_stones_chef_can_remove(A, n))
        t -= 1