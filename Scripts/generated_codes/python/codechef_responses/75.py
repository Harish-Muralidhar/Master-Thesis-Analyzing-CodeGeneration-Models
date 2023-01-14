'''

'''

t = int(input())
for _ in range(t):
    b = int(input())
    ans = 0
    for i in range(2, b):
        temp = i * i - (i - 1) ** 2
        if temp<=b:
            ans += 1
        else:
            break
    print(ans)