"""


"""

# cook your dish here
test_cases=int(input())
while test_cases:
    test_cases=test_cases-1
    freq=input()
    st=input()
    st1=""
    indic=0
    for i in st:
        if i>='a' and i<='z':
            st1=st1+freq[ord(i)-ord('a')]
        elif i>='A' and i<='Z':
            st1=st1+freq[ord(i)-ord('A')].upper()
        else:
            st1=st1+i
    print(st1)