'''
Required sum = 6.0
'''
for i in range(int(input())):
    n,m = map(int,input().split(" "))
    print((n+m-2)*(n+m-2+1)/2)