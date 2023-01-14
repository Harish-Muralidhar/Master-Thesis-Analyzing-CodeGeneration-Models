'''
'''
n=int(input())
a=[]
for i in range(n):
    x,y=map(int,input().split())
    a.append((x,y))
#print(a)
d={}
for i in a:
    for j in a:
        if j==i:
            continue
        d[(i,j)]=[]
#print(d)
for i in d:
    #print(i)
    temp=[(i[0][0]-i[1][0])**2+(i[0][1]-i[1][1])**2]
    #print(temp)
    for j in a:
        if j==i[0] or j==i[1]:
            continue
        temp.append((i[0][0]-j[0])**2+(i[0][1]-j[1])**2)
    temp.sort()
    #print(temp)
    for k in range(len(temp)):
        if k+1<len(temp) and temp[k]==temp[k+1]:
            d[i].append(temp[k])
        elif temp[k]!=0:
            d[i].append(temp[k])
#print(d)
m=0
for i in d:
    m=max(m,len(d[i]))
print(m)