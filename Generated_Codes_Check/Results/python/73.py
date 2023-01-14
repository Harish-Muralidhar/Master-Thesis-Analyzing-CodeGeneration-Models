"""

"""
import sys

def main():
    sys.stdin=open('test.txt','r')
    sys.stdout=open('op.txt','w')
    n=int(input())
    l1=[]
    l2=[]
    l3=[]
    l4=[]
    l5=[]
    c=1
    l1.append(0)
    l2.append(0)
    l3.append(0)
    l4.append(0)
    l5.append(0)
    for i in range(n):
        a,b=map(int,input().split())
        l1.append(a)
        l2.append(b)
        l3.append(l1[c-1]+a)
        l4.append(l2[c-1]+b)
        l5.append(abs(l3[c-1]-l4[c-1]))
        c+=1
    print(l3)
    print(l4)
    print(l5)
    if(max(l5)==0):
        print(1,max(l5))
    elif(l5.index(max(l5))%2==0):
        print(2,max(l5))
    else:
        print(1,max(l5))


main()