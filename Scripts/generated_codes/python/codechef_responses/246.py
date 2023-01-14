'''


'''

for _ in range(int(input())):
    n = int(input())
    l = list(map(int,input().split()))
    sumi = 0
    for i in l:
        if i<2:
            sumi = sumi+2
        else:
            sumi = sumi+i
    print(sumi)