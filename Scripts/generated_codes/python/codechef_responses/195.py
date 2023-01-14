*/

for i in range(int(input())):
    n=int(input())
    l=list(map(int,input().split()))
    cnt=0
    for i in l:
        if i==1:
            cnt+=1
    print(1) if cnt==n else print(2)