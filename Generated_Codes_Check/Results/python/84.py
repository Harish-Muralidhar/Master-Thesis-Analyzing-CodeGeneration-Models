"""
"""

for _ in range(int(input())):
    n = int(input())
    e,o = map(int,input().split())
    if e%2!=0:
        print(-1)
        continue
    if o==0:
        print(2*(e//2) * '1 ')
        continue
    temp = o//(e//2)
    if o%(e//2)!=0:
        print(-1)
        continue
    else:
        if temp%2==0:
            print(temp*'1 ' + (e//2)*'2 ')
        else:
            print((temp-1)*'1 ' + (e//2)*'2 ' + '1 ')