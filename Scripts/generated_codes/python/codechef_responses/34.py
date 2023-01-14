'''
'''

#code

for i in range(int(input())):
    a,b,c=input().split()
    print(int(a) if b > c else (int(b) if c > a else int(c)))