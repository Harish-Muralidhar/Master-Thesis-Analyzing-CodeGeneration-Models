"""

Explanation

In the first test case the chef has two subordinates and he needs to choose exactly one of them. He has only two ways to do that. Either choose the first one or choose the second one.

In the second test case the chef has three subordinates and he needs to choose exactly three of them. He has only one way to do that. Choose all three of them.

In the third test case the chef has 10 subordinates and he needs to choose exactly five of them. He has 252 ways to do that.

"""

# Write your code here
t = int(input())
for i in range(t):
    n,k = map(int,input().split())
    if(k == 1):
        print(n)
    elif(k == 0):
        print(0)
    else:
        total = 1
        for i in range(n-k+1,n+1):
            total *= i
        for i in range(1,k+1):
            total /= i
        print(int(total))