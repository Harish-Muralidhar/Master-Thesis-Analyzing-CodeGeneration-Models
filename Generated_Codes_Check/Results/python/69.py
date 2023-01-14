'''

'''

for _ in range(int(input())):
    s1=input()
    s2=input()
    if len(s1)>len(s2):
        s1,s2=s2,s1
    for i in range(len(s1)):
        if s1[i:][::-1] in s2 or s1[:i][::-1] in s2:
            print('Yes')
            break
    else:
        print('No')