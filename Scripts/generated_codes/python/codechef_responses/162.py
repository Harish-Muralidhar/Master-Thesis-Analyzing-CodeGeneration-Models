'''

'''

#Answer with code

N, M = map(int, input().split())
arr = [0 for i in range(N + 1)]

for i in range(M):
    x, y = map(int, input().split())
    arr[x] += 1
    arr[y + 1] -= 1
    
ans = 0
cur = 0
for i in range(1, N + 1):
    cur += arr[i]
    if cur & 1:
        ans += 1
        
print(2 ** ans, end = '')

#Also can be solved using ncr, but time complexity will be O(M * logN) where M is no. of bits in largest value of N.
#The above code gives time complexity of O(N)