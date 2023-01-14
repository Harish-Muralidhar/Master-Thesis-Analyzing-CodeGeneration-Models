'''

Input:
2 0
Output:
2

Input:
7 0
Output:
1

Input:
0 0
Output:
1

Input:
7 10
Output:
50

'''

# write your code here


def get_input(inp="input.txt"):
    inp_file = open(inp, "r")
    inp_list = inp_file.readlines()
    inp_line = inp_list[0].split()
    D = int(inp_line[0])
    K = int(inp_line[1])
    return D, K


def count_ways(D, K):
    if D == 0 and K == 0:
        return 1
    elif D == 0 and K > 0:
        return 0
    elif D > 0 and K == 0:
        return 2
    else:
        ways = 0
        for i in range(0, D+1):
            ways += count_ways(i, K - 1)
        return ways


def count_ways_memo(D, K):
    if D == 0 and K == 0:
        return 1
    elif D == 0 and K > 0:
        return 0
    elif D > 0 and K == 0:
        return 2
    else:
        ways = memo[D][K]
        if ways > 0:
            return ways
        else:
            ways = 0
            for i in range(0, D+1):
                ways += count_ways(i, K - 1)
            memo[D][K] = ways
            return ways


def count_ways_dp(D, K):
    if D == 0 and K == 0:
        return 1
    elif D == 0 and K > 0:
        return 0
    elif D > 0 and K == 0:
        return 2
    else:
        for i in range(D + 1):
            for j in range(K + 1):
                if j == 0:
                    dp[i][j] = 2
                else:
                    if i == 0:
                        dp[i][j] = 0
                    else:
                        dp[i][j] = sum(dp[0:i+1][j-1])
        return dp[D][K]


if __name__ == "__main__":
    D, K = get_input()
    print(count_ways(D, K))
    memo = [[0 for i in range(K + 1)] for j in range(D + 1)]
    print(count_ways_memo(D, K))
    dp = [[0 for i in range(K + 1)] for j in range(D + 1)]
    print(count_ways_dp(D, K))