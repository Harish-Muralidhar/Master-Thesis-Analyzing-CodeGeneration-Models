'''
'''

for i in range(int(input())):
    s=input()
    c=0
    while(c<len(s)-1):
        if s[c]==s[c+1]:
            c+=1
            continue
        elif s[c]=='+':
            s=s.replace('+-','-',1)
            c+=1
        elif s[c]=='-':
            s=s.replace('-+','+',1)
            c+=1
    print(len(s)-1)