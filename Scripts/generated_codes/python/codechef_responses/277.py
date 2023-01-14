'''

'''
#T=int(input())
#while T>0:
#    N,M=map(int,input().split())
#    L=list(map(int,input().split()))
#    c=0
#    t=[]
#    for i in range(N):
#        t.append("-")
#    for i in L:
#        if i not in t:
#            c=c+1
#            t.pop(t.index("-"))
#            t.append(i)
#    print(c)
#    T=T-1

T=int(input())
while T>0:
    N,M=map(int,input().split())
    L=list(map(int,input().split()))
    c=0
    t=[]
    for i in range(N):
        t.append("-")
    for i in L:
        if i not in t:
            c=c+1
            if t.count("-")<=0:
                t.pop(t.index("-"))
            t.append(i)
    print(c)
    T=T-1