'''

** For More Input/Output Examples Use 'Expected Output' option **

'''



t = int(input())
for i in range(t):
    n = int(input())
    count = 0
    dict = {}
    for j in range(n):
        dict[j] = []
    for k in range(n):
        m = int(input())
        l = list(map(int,input().strip().split()))
        dict[k].append(l)
        dict[k].append(m)
    for l in range(n):
        for m in range(n):
            if m == l:
                continue
            else:
                count = 0
                for n in range(0,dict[m][1]):
                    if (dict[l][0][n] > dict[m][0][0]) and (dict[l][0][n] < dict[m][0][2]):
                        count = count + 1
                if count == dict[m][1]:
                    dict[l][0].append(m)
    for o in range(n):
        print(len(dict[o][0]) - dict[o][1] - 2,end=" ")
    print()