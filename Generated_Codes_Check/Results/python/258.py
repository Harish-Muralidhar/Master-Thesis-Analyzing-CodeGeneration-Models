'''

Explanation:
In this case, the best strategy is to buy Antarctican Dollars at the first kiosk, sell them at the second kiosk, buy them again at the second kiosk, sell them at the third kiosk, buy them again at the third kiosk and sell them at the first kiosk. After M seconds, Chef will have 15 Peppercorns.


Input:
4 3 3
2 1 5 3 7 6
2 1 4 3 6 5
10 9 8 7 6 5
4 3 2 1 10 9

Output:
20.0000000000

Explanation:
In this case, the best strategy is to buy Antarctican Dollars at the first kiosk, sell them at the second kiosk, buy them again at the second kiosk, sell them at the fourth kiosk, buy them again at the fourth kiosk and sell them at the first kiosk. After M seconds, Chef will have 20 Peppercorns.

Input:
2 3 5
2 1 5 3 7 6
2 1 4 3 6 5

Output:
Quintillionnaire

Explanation:
In this case, the best strategy is to buy Antarctican Dollars at the first kiosk, sell them at the second kiosk, buy them again at the second kiosk, sell them at the first kiosk, buy them again at the first kiosk and sell them at the second kiosk. After M seconds, Chef will have 5*1.5^6 Peppercorns. Since this number exceeds 10^18, the answer is Quintillionnaire.

Input:
1 2 10
1 2 3 4

Output:
8.0000000000

Explanation:
In this case, the best strategy is to buy Antarctican Dollars at the first kiosk and sell them at the first kiosk. After M seconds, Chef will have 8 Peppercorns.

Input:
1 3 10
1 2 3 4

Output:
Quintillionnaire

Explanation:
In this case, the best strategy is to buy Antarctican Dollars at the first kiosk, sell them at the first kiosk, buy them again at the first kiosk and sell them at the first kiosk. After M seconds, Chef will have 10*1.5^3 Peppercorns. Since this number exceeds 10^18, the answer is Quintillionnaire.

Input:
1 1 10
1 2

Output:
10.0000000000

Explanation:
In this case, the best strategy is to buy Antarctican Dollars at the first kiosk and sell them at the first kiosk. After M seconds, Chef will have 10 Peppercorns.

Input:
1 1 0
1 2

Output:
0.0000000000

Explanation:
In this case, the best strategy is to buy Antarctican Dollars at the first kiosk and sell them at the first kiosk. After M seconds, Chef will have 0 Peppercorns.

Input:
1 1 1
1 2

Output:
1.0000000000

Explanation:
In this case, the best strategy is to buy Antarctican Dollars at the first kiosk and sell them at the first kiosk. After M seconds, Chef will have 1 Peppercorn.


'''



def buy(arr, i, st, en, count, maxi):
   # print(arr,i,st,en,count,maxi)
    if(st==en):
        if count*maxi>1000000000000000000:
            return "Quintillionnaire"
        else:
            return count*maxi
    mid = (st+en)//2
    if arr[i][mid][1] == 0:
        return buy(arr, i, st, mid-1, count, maxi)
    else:
        count+=arr[i][mid][1]
        maxi = max(maxi, arr[i][mid][0]*arr[i][mid][1])
        return buy(arr, i, mid+1, en, count, maxi)

def sell(arr, i, st, en, count, maxi):
    if(st==en):
        if count*maxi>1000000000000000000:
            return "Quintillionnaire"
        else:
            return count*maxi
    mid = (st+en)//2
    if arr[i][mid][1] == 0:
        return sell(arr, i, mid+1, en, count, maxi)
    else:
        count+=arr[i][mid][1]
        maxi = max(maxi, arr[i][mid][0]*arr[i][mid][1])
        return sell(arr, i, st, mid-1, count, maxi)

def solve(arr, n, m, d):
    dp = [[[0,0] for i in range(2*m)] for i in range(n)]
    sol = [d]
    for i in range(n):
        dp[i][0][0] = arr[i][0][0]
        dp[i][0][1] = 1
        for j in range(1, 2*m, 2):
            dp[i][j][0] = arr[i][j][0]
            dp[i][j+1][0] = arr[i][j+1][0]
            if(j>0):
                if(dp[i][j-1][0]>arr[i][j][0]):
                    dp[i][j][1] = dp[i][j-1][1] + 1
                else:
                    dp[i][j][1] = 0
                if(dp[i][j-1][0]<arr[i][j+1][0]):
                    dp[i][j+1][1] = dp[i][j-1][1] + 1
                else:
                    dp[i][j+1][1] = 0
            else:
                dp[i][j][1] = 1
                dp[i][j+1][1] = 1
    for i in range(n):
        temp = buy(dp, i, 0, 2*m-1, 0, d)
        if(temp=="Quintillionnaire"):
            return "Quintillionnaire"
        sol.append(temp)
    for i in range(n):
        temp = sell(dp, i, 0, 2*m-1, 0, d)
        if(temp=="Quintillionnaire"):
            return "Quintillionnaire"
        sol.append(temp)
    #print(sol)
    return max(sol)



for _ in range(int(input())):
    n, m, d = map(int, input().split())
    arr = []
    ans = 0
    for _ in range(n):
        l = list(map(int, input().split()))
        arr.append(l)
    for i in range(n):
        for j in range(2*m):
            if(j%2==0):
                arr[i][j] = [arr[i][j], 0]
            else:
                arr[i][j] = [arr[i][j], 1]
    sol = solve(arr, n, m, d)
    if(sol=="Quintillionnaire"):
        print(sol)
    else:
        print("%.12f"%sol)