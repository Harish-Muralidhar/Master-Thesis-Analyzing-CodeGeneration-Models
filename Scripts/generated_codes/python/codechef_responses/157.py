'''

Input:
4 1
1 2 3 4

Output:
6

Explanation:
The 6 subsegments are OK, since there are no bad pairs at all.
'''

import numpy as np
n, k = map(int,input().split())
a = np.array(list(map(int,input().split())))
count = 0
for i in range(n):
    for j in range(i,n):
        if len(set(a[i:j+1]) & set(a[i] % a[i:j+1])) == 0:
            count += 1
print(count)