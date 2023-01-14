'''
'''

#code
for _ in range(int(input())):
    a,b,c,d = map(int,input().split())
    if a == 1 or b == 1:
        print(1)
    else:
        a-=c
        b-=d
        if a==0 or b==0:
            print(1)
        else:
            a-=1
            b-=1
            a_fac = 1
            b_fac = 1
            for i in range(1,a+1):
                a_fac*=i
            for i in range(1,b+1):
                b_fac*=i
            ans = a_fac+b_fac
            print(ans%1000000007)