'''

Explanation

1. Consider N = 3 , The factorial of 3 is 6 (3 * 2 * 1)
2. Consider N = 4 , The factorial of 4 is 24 (4 * 3 * 2 * 1)
3. Consider N = 5 , The factorial of 5 is 120 (5 * 4 * 3 * 2 * 1) 

'''

t = input()

for i in range(t):
    n = input()
    fact = 1
    for j in range(1,n+1):
        fact = fact*j
    print fact