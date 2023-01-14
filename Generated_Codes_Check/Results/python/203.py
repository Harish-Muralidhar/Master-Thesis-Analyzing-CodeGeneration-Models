'''
'''

t = int(input())

for i in range(t):
    n,k = map(int,input().split())
    arr = list(map(int,input().split()))
    
    #arr = list(map(int,input().split()))
    arr1 = []
    arr2 = []
    for i in arr:
        if i<k:
            arr1.append(i)
        elif i>k:
            arr2.append(i)
    arr1.sort()
    arr2.sort()
    #print(arr1)
    #print(arr2)
    
    i = 0
    j = 0
    count = 0
    while i<len(arr1) and j<len(arr2):
        l = arr1[i]
        r = arr2[j]
        #print(l,r)
        if l+r==k:
            count += 1
            i += 1
            j += 1
        elif l+r<k:
            i += 1
        else:
            j += 1
    
    print(count)