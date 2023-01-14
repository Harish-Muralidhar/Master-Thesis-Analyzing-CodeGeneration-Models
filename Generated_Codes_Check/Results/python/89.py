'''


'''

# Write your code here

#input

T = int(input())
for _ in range(T):
    N = int(input())
    x = list(map(int, input().split()))
    bit_list = [bin(i)[2:] for i in x]
    ans = 0
    
    
#bitwise xor
for i in range(N):
    for j in range(i+1,N):
        if bit_list[i] > bit_list[j]:
            bit_list[i], bit_list[j] = bit_list[j], bit_list[i]
            x[i], x[j] = x[j], x[i]
    b = bit_list[i]
    c = len(b)
    k = x[i]
    ans += (2**c-1)*(k+1)
    for j in range(i+1,N):
        b = bit_list[j]
        c = len(b)
        k = x[j]
        ans -= (2**c-1)*(k+1)
    print(ans)
    
    
'''

#Output

1
4
16
6

'''