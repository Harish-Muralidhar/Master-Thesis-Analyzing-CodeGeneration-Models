"""


"""
def gcd(x,y):
    if x>y:
        small=y
    else:
        small=x
    for i in range(1,small+1):
        if((x%i==0)and(y%i==0)):
            gcd=i
    return gcd
def lcm(x,y):
    if x>y:
        greater=x
    else:
        greater=y
    while(True):
        if((greater%x==0)and(greater%y==0)):
            lcm=greater
            break
        greater+=1
    return lcm
t=int(input())
for i in range(t):
    a,b=map(int,input().split())
    result=gcd(a,b)
    result1=lcm(a,b)
    print(result,result1)