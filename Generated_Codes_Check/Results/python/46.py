"""

"""
#Solution

t = int(input())
for _ in range(t):
    n,m = map(int,input().split())
    l = []
    for i in range(n):
        s = input()
        l.append(s)
    count = 0
    m = set()
    for i in range(n):
        for j in range(m):
            if l[i][j] == '1':
                if (i,j) not in m:
                    m.add((i,j))
                else:
                    count += 1
    print(count)