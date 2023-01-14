'''


For the sake of clarity in explanation, let us define the following

Formula to calculate #ways to reach (a+2, 0) from (0, 0):

ways[a+2] = ways[a] + ways[a+1]

We can see that second term is added to the current term, which makes the formula similar to Fibonacci series.

This motivates the following solution.

Let an integer be called good if it is equal to the count of good integers in the range [1, good] inclusive.

Let DP[i] be the number of good integers in the range [1, i]

If a number is not good, then it will not contribute to DP[i]. Thus, we can reduce the size of the problem to only good numbers.

Let x be a good number.

If x is clean, we have a new DP[x + 2] = DP[x + 1] + DP[x]

If x is dirty, we have DP[x + 2] = DP[x + 1]

Thus, if we know DP[x] and DP[x + 1], we can find DP[x + 2].

We can find all good numbers in the range [1, R] and then fill DP[i] for all i in the range [L, R]

For each test case, output DP[R] - DP[L - 1]


'''

import math
t=int(input())
for test in range(t):
    l,r,n=list(map(int,input().split()))
    good=[]
    for i in range(l,r+1):
        c=0
        for j in range(1,i+1):
            if(j%2==0):
                c+=1
        if i==c:
            good.append(i)
    #print(good)
    dp=[0]*(r+1)
    dp[1]=1
    dp[2]=1
    for i in range(3,r+1):
        if i in good:
            dp[i]=dp[i-1]+dp[i-2]
        else:
            dp[i]=dp[i-1]
    if n>dp[r]-dp[l-1]:
        print(-1)
        continue
    res=dp[r]-dp[l-1]
    #print(res)
    c=0
    for i in range(r,l-1,-1):
        if res==0:
            break
        if dp[i-2]>=res:
            c+=1
            res-=dp[i-2]
    if c%2==0:
        res='.'*(r-c)+'#'*c+'.'
    else:
        res='.'*(r-c+1)+'#'*(c-1)+'.'
    print(dp[r]-dp[l-1],res)