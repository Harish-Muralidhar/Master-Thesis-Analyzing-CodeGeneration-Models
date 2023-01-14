'''


'''


import random

A, B = map(int, input().split(' '))

right_ans = A - B

ans = list(str(right_ans))

print(ans)

while(True):
    index = random.randint(0, len(ans)-1)
    if (index == 0 and ans[index] != '0') or index != 0:
        ans[index] = str(random.randint(0, 9))
        break

print(''.join(ans))