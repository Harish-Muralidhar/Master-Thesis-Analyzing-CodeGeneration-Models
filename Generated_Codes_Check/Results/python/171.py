'''


'''

# Write your code here

def ncr(n, r):
   if n == 0 or n == r or r == 0:
       return 1
   else:
       return ncr(n-1, r-1) + ncr(n-1, r)
       
def binomialDistribution(n, r, k):
    return ncr(n, r) * pow(0.5, n)

def getBinaryRepresentation(n, k, m):
    if k > n or m > pow(2, n):
        return -1
    if k == n or m == 1:
        return "1" * k
    
    p = 0
    for i in range(1, k+1):
        p += binomialDistribution(n-1, i-1, k)
    
    if p >= m:
        return '1' + getBinaryRepresentation(n-1, k-1, m)
    else:
        return '0' + getBinaryRepresentation(n-1, k, m - int(p))
    
n, k, m = map(int, input().split())
print(getBinaryRepresentation(n, k, m))