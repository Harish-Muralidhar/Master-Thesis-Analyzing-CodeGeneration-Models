'''
wi are all distinct

SAMPLE INPUT
2
codechef
2
code
chef
mississippi
4
ssissi
mippi
mi
ppi

SAMPLE OUTPUT
Tracy
Teddy

'''

for _ in range(int(input())):
    s1 = input()
    n = int(input())
    di = [i for i in input().split()]
    for i in di:
        if i in s1:
            s1 = s1.replace(i,'#')
    if len(s1) > 0:
        print('Tracy')
    else:
        print('Teddy')