'''


Explanation

In the first case, the comparisons are consistent. To give minimum total bonus, we can give 140 to employee 1, 120 to employee 2, 100 to employee 3, and 100 to employee 4.
In the second case, the comparisons are inconsistent. Suppose we give 100 to employee 1, 100 to employee 2, 100 to employee 3. Then, employee 1 is better than 2, so 1 should get at least 10$ more than 2. Similarly, 2 should get at least 10$ more than 3, and 3 should get at least 10$ more than 1, which is not possible. 
'''

import sys

def get_bonus(n,m,l,comparison):
    bonus = [l]*n
    for i in comparison:
        if bonus[i[0]-1] < bonus[i[1]-1] + i[2]:
            bonus[i[0]-1] = bonus[i[1]-1] + i[2]
    if any(bonus[i] < l for i in range(n)):
        return 'Inconsistent analysis.'
    return sum(bonus), bonus

n,m,l = map(int, sys.stdin.readline().split())
comparison = []
for i in range(m):
    comparison.append(list(map(int, sys.stdin.readline().split())))
print(*get_bonus(n,m,l,comparison), sep = '\n')