'''

'''

mod = 1000000007
ans = 1

# width and length of the chocolate bar
width = int(input())
length = int(input())

# 2D array with 2 rows and width columns
dp = [[0 for _ in range(width)] for _ in range(2)]

# initialize first column of the 2D array
dp[0][0] = 1
dp[1][0] = 1

# calculate the rest of the columns
for i in range(1, width):
    dp[0][i] = (dp[0][i - 1] + dp[1][i - 1]) % mod
    dp[1][i] = (dp[0][i - 1] + dp[1][i - 1]) % mod

# calculate the number of ways to color the chocolate
for i in range(length):
    ans = (ans * dp[0][width - 1]) % mod

# print the answer
print(ans)