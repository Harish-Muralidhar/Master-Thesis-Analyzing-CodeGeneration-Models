'''

'''

import math as mt

def func(lst):
    res = []
    for i in lst:
        if(i%2==0):
            res.append(i//2)
        elif(i%3==0):
            res.append(i//3)
        elif(i%5==0):
            res.append(i//5)
        else:
            res.append(i)
    return res

num = int(input())
lst = list(map(int,input().split()))

q = int(input())
for i in range(q):
    qr = list(map(int,input().split()))
    if(qr[0]==1):
        lst[qr[1]-1:qr[2]] = func(lst[qr[1]-1:qr[2]])
    else:
        lst[qr[1]-1]=qr[2]
        
for i in lst:
    print(i,end = " ")