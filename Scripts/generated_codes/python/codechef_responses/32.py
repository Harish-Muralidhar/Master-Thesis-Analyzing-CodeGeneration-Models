"""

"""

import datetime
n = int(input())
arr = []
for i in range(n):
    arr.append(int(input()))

for i in arr:
    print(datetime.date(i,1,1).strftime("%A").lower())