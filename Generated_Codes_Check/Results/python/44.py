"""


"""

# cook your dish here
for i in range(int(input())):
    n,s=input().split()
    n=int(n)
    l=[]
    d={"CONTEST_WON":300,"TOP_CONTRIBUTOR":300,"BUG_FOUND":50,"CONTEST_HOSTED":50}
    for j in range(n):
        l.append(input().split())
    c=0
    for k in range(len(l)):
        if l[k][0]=="CONTEST_WON":
            c+=d["CONTEST_WON"]+(20-int(l[k][1]))
        else:
            c+=d[l[k][0]]
    if s=="INDIAN":
        print(int(c/200))
    else:
        print(int(c/400))