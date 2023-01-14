'''


'''


# Write your code here
n,q=map(int,input().split())
l=list(map(int,input().split()))
def add(l,x,y,v):
    for i in range(x,y+1):
        l[i-1]=(l[i-1]+v)%(10**9+7)
def mul(l,x,y,v):
    for i in range(x,y+1):
        l[i-1]=(l[i-1]*v)%(10**9+7)
def ass(l,x,y,v):
    for i in range(x,y+1):
        l[i-1]=v
def report(l,x,y):
    s=0
    for i in range(x,y+1):
        s+=l[i-1]
    print(s%(10**9+7))
for i in range(q):
    lst=list(map(int,input().split()))
    if lst[0]==1:
        add(l,lst[1],lst[2],lst[3])
    elif lst[0]==2:
        mul(l,lst[1],lst[2],lst[3])
    elif lst[0]==3:
        ass(l,lst[1],lst[2],lst[3])
    else:
        report(l,lst[1],lst[2])