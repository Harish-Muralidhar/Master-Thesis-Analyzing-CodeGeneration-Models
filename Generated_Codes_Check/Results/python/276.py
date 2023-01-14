*/
import sys
n=int(input())
for i in range(n):
    a=list(map(int,input().split()))
    b=list(map(int,input().split()))
    l=[]
    l1=[]
    for j in range(a[0]):
        if j+1 not in b:
            l.append(j+1)
    for j in range(len(l)):
        if j%2==0:
            l1.append(l[j])
    for j in range(len(l)):
        if j%2!=0:
            l1.append(l[j])
    for j in range(len(l1)):
        if j==len(l1)-1:
            print(l1[j])
        else:
            print(l1[j],end=' ')