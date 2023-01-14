'''


'''



import math

# Function to return gcd of a and b 
def gcd(a, b): 
    if (a == 0): 
        return b 
    return gcd(b % a, a) 

# Function to return LCM of two numbers 
def lcm(a, b): 
    return (a*b) / gcd(a, b) 

# Driver program to test above function 

t = int(input())
for _ in range(t):
    k = int(input())
    l = list(map(int, input().split()))

    if(l[0] != 0):
        print("No")
        continue
    
    if(k == 1):
        if(l[0] == 0):
            print("Yes")
        else:
            print("No")

    else:
        k = k - 1
        prod = l[1]
        while(k > 1):
            prod = lcm(prod,l[k])
            k -= 1

        if(prod == l[-1]):
            print("Yes")
        else:
            print("No")