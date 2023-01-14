"""
For second query, 2 is connected to 3 by an edge. Hence distance 1.
For third query, 4 is connected to 2 by an edge and 2 is connected to 3 by an edge. Hence distance 2.

"""

n=int(input())
for i in range(n):
    a,b=map(int,input().split())
    x=bin(a)[2:]
    y=bin(b)[2:]
    if len(x)>len(y):
        y='0'*(len(x)-len(y))+y
    else:
        x='0'*(len(y)-len(x))+x
    count=0
    for j in range(len(x)):
        if x[j]==y[j]:
            continue
        else:
            count+=1
    print(count)