'''

I am getting an error in this code. Kindly help.
'''

for i in range(int(input())):
    j=0
    while j<int(input()):
        a,b,c=map(int,input().split())
        if a==1 and c==1 or a==2 and c==2:
            print(int(b/2))
            j+=1
        if a==2 and c==1 or a==1 and c==2:
            print(int(b/2)+1)
            j+=1