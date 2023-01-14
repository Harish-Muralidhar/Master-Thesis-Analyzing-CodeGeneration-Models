'''
'''

def coffee_breaks(N,K,D,M,arr):
    res = 0
    #print(arr)
    for i in range(N):
        if i < K:
            res += arr[i]
        else:
            last_break = i - D
            if last_break <= 0:
                if i == K:
                    res += arr[i] * M
                else:
                    res += arr[i]
            else:
                if i == K:
                    res += arr[i] * M
                elif arr[last_break-1] == 0:
                    res += arr[i] * M
                else:
                    res += arr[i]
    
    return res



T = int(input())
while T > 0:
    N, K, D, M = map(int, input().split())
    arr = list(map(int, input().split()))
    #print(arr)
    res = coffee_breaks(N,K,D,M,arr)
    
    print(res)
    
    T -= 1