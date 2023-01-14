"""

"""
# cook your dish here
import math
def primes(n):
    lis = []
    while n % 2 == 0: 
        lis.append(2)
        n = n / 2
    for i in range(3,int(math.sqrt(n))+1,2): 
        while n % i== 0: 
            n = n / i
            lis.append(i) 
    if n > 2: 
        lis.append(n)
    return lis
    
    
    
    

t = int(input())
for i in range(t):
    n = int(input())
    A = list(map(int,input().split()))
    count = 0
    for i in A:
        lis = primes(i)
        for j in lis:
            for k in A:
                if k%j==0:
                    k = k/j
                    count+=1
    print(count)
    A = []