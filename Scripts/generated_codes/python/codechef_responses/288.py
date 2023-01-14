'''

Note: The test cases will be generated randomly.
'''

def gcd(a,b): 
    if(b==0): 
        return a 
    else: 
        return gcd(b,a%b)
def findProbability(n): 
    c=0
    for i in range(1,n+1): 
        for j in range(1,n+1): 
            if(i>=j): 
                if(gcd(i,j)==j): 
                    c=c+1
    num = c 
    den = n*n
    gcd = gcd(num,den)
    num = num/gcd
    den = den/gcd
    print(num,"/",den)

t = int(input())
for i in range(t):
    n = int(input())
    findProbability(n)