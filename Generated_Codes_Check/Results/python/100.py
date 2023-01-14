'''

'''

import numpy as np

l = []
for i in range(int(input())):
    n = int(input())
    arr = input()
    arr = arr.split()
    arr = np.array(arr)
    count = 0
    for i in range(int((2**n)/2)):
        arr[int(i*2)] = int(arr[int(i*2)]) + int(arr[int(i*2)+1])
        count+=1
    arr = np.unique(arr)
    arr = np.sort(arr)
    arr = arr.astype(int)
    arr = arr.tolist()
    l.append(arr)

for i in l:
    for j in i:
        print(j,end=' ')
    print()