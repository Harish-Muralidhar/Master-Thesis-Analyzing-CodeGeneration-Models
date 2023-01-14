'''

'''

test = int(input())
for i in range(test):
    str1 = list(input())
    str2 = list(input())
    j = 0
    for i in range(len(str1)):
        if str1[i] == str2[i] or str1[i] == '?':
            j += 1
    if j == len(str1):
        print('Yes')
    else:
        print('No')