'''


'''

t = int(input())
for i in range(t):
    n = int(input())
    str1 = input()
    r=0
    g=0
    b=0
    for i in str1:
        if (i == 'R'):
            r += 1
        elif (i == 'G'):
            g += 1
        else:
            b += 1
    if (r == g == b):
        print(0)
    elif (r>g and r>b):
        print(n-r)
    elif (g>r and g>b):
        print(n-g)
    else:
        print(n-b)