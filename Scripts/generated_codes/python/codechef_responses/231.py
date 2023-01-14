'''

'''

from sys import stdin

def adj():
    global colors
    global dic
    global pos
    global res
    global ans
    if len(pos) == 3:
        if pos[1]-pos[0] == 3 or pos[2]-pos[1] == 3 or abs(pos[0]-pos[1]) == 1 or abs(pos[0]-pos[2]) == 1 or abs(pos[1]-pos[2]) == 1:
            res = 'YES'
            ans.append(res)
        else:
            res = 'NO'
            ans.append(res)
        return
    for i in range(dic[colors[pos[-1]]]+1,6):
        pos.append(i)
        adj()
        pos.pop()

t = int(input())
ans = []
while t:
    colors = input().split()
    dic = {colors[i]:i for i in range(6)}
    pos = []
    res = ''
    adj()
    t -= 1

for i in ans:
    print(i)