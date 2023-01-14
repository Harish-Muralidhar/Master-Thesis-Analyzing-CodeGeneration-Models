"""

Solution:
"""

test=int(input())
for i in range(test):
    a,b=map(int,input().split())
    count=0
    while(True):
        if a==b:
            break
        elif a%2==0 and a>b:
            a=int(a/2)
            count+=1
        elif a%2!=0 and a>b:
            a=int((a-1)/2)
            count+=1
        elif a<b:
            a=a*2
            count+=1
    print(count)