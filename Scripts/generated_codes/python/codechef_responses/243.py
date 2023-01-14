'''

'''
#

# Write your code here
def modexp(a,b,n):
    if(b==0):
        return 1
    elif(b%2==0):
        return (modexp(a,b//2,n)**2)%n
    else:
        return ((modexp(a,b//2,n)**2)*a)%n
if __name__ == '__main__':
    T = int(input())
    while(T):
        s = input()
        n = len(s)
        if(s[n-1]=='r'):
            if(n%2==0):
                print((2*modexp(2,n//2,1000000007))%1000000007)
            else:
                print(((2*modexp(2,n//2,1000000007))-1)%1000000007)
        else:
            if(n%2==0):
                print(((2*modexp(2,n//2,1000000007))-2)%1000000007)
            else:
                print((2*modexp(2,(n//2)+1,1000000007))%1000000007)
        T-=1