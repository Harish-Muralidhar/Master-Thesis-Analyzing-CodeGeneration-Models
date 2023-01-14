'''

Sample Testcase

Input
3
2
6
10

Output
2
1826/189
877318/35343

'''

t = int(input())

while t>0:
    n = int(input())
    for i in range(2, n+1):
        print((n-1)*(n-1), ((n-i)*(n-1)+(n-i)), end=' ')
    print()
    t-=1