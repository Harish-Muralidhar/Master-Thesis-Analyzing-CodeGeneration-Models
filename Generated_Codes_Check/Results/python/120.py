'''
All coordinates are given in the coordinate system with 0,0 as the bottom-left corner and w,h as the top-right corner.

Sample Input
4 3 1 4
1 3 5
3 3 4
2 2 1
2 1 2

Sample Output
2

'''

import math
n=input().split()
w,h,d,m=int(n[0]),int(n[1]),int(n[2]),int(n[3])

d=2*d

x1,x2,y1,y2=math.floor(w/2-d/2),math.ceil(w/2+d/2),math.floor(h/2-d/2),math.ceil(h/2+d/2)

x=[]
y=[]

for i in range(0,m):
    n=input().split()
    if int(n[0]) in range(x1,x2+1) and int(n[1]) in range(y1,y2+1):
        x.append(int(n[0]))
        y.append(int(n[1]))

m=len(x)

dic={}

for i in range(0,m):
    if x[i] not in dic:
        dic[x[i]]=0
    dic[x[i]]+=int(n[2])
    
    if y[i] not in dic:
        dic[y[i]]=0
    dic[y[i]]+=int(n[2])
    

sum=0
for i in dic:
    sum+=dic[i]

print(sum)