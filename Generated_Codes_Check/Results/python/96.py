"""
 


"""
from math import log

def gcd(a, b): 
    if b == 0: 
        return a 
    return gcd(b, a % b) 

def lcm(a, b): 
    return (a*b) // gcd(a, b) 

def reduce(num, den):
    common_factor = gcd(num,den)
    (reduced_num, reduced_den) = (num // common_factor, den // common_factor)
    return reduced_num, reduced_den

def find_probability(N):
    l = len(str(N))
    if l%2 == 0:
        p = 5**(l//2)
        q = 10**(l//2)
    else:
        p = 10**(l//2)
        q = 10**(l//2)
    return reduce(p,q)


if __name__ == "__main__":
    T = int(input())
    for _ in range(T):
        N = int(input())
        (p,q) = find_probability(N)
        print(p,q)