"""


"""



#Write your code here
import math

def nCr(n, r):
    f = math.factorial
    return f(n) / f(r) / f(n-r)

t=int(input())
for i in range(t):
    nq=list(map(int,input().split()))
    n=nq[0]
    q=nq[1]
    s=input()
    list1=[]
    for i in range(len(s)):
        for j in range(i+1,len(s)+1):
            list1.append(s[i:j])
    for i in range(q):
        k=int(input())
        c=0
        for j in range(len(list1)):
            if list1[j] in list1:
                c+=1
        print(c)