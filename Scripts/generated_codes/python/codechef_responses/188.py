"""

Solution:
"""

for i in range(int(input())):
    l=[]
    n=int(input())
    for j in range(1,n+1):
        if n%j==0:
            l.append(j)
    print(len(l))