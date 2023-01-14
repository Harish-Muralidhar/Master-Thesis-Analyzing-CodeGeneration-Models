'''

Explanation
Example case 1. The only orange's cost equals to 2 rubles and its weight equals to 2. You can buy this orange, so the answer is 2.
Example case 2. You can buy oranges with indices 1 and 3. Their cost is equal to 2 and their weight is equal to 5. The answer is 5.

'''

from sys import stdin, exit

t = int(stdin.readline())
for _ in range(t):
    n, k = map(int, stdin.readline().split())
    oranges = [list(map(int, stdin.readline().split())) for _ in range(n)]

    oranges.sort(key=lambda x: x[1]/x[0])
    total_weight = 0
    i = 0
    while i < n and k >= oranges[i][0]:
        total_weight += oranges[i][1]
        k -= oranges[i][0]
        i += 1
    else:
        if i < n:
            total_weight += k * oranges[i][1] / oranges[i][0]

    print(total_weight)