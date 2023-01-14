"""

"""

# cook your dish here
import math

def main():
    T = int(input())
    for _ in range(T):
        N,M,K = map(int, input().split(' '))
        Ai = list(map(int, input().split(' ')))
        Bi = [[0 for _ in range(M)] for _ in range(N)]
        Ci = [[0 for _ in range(M)] for _ in range(N)]
        for i in range(N):
            Bi[i] = list(map(int, input().split(' ')))
        for i in range(N):
            Ci[i] = list(map(int, input().split(' ')))
        print(max_points(N,M,K,Ai,Bi,Ci))
        
def max_points(N,M,K,Ai,Bi,Ci):
    dp = [[0 for _ in range(M)] for _ in range(K+1)]
    dp[0] = [0 for _ in range(M)]
    for i in range(1,K+1):
        for j in range(1,M+1):
            mx = 0
            for k in range(1,N+1):
                mx = max(mx, dp[i-1][k-1] + Bi[k-1][j-1] - Ci[k-1][j-1])
            dp[i][j-1] = mx
    return dp[K][Ai[N-1]-1]
            
main()