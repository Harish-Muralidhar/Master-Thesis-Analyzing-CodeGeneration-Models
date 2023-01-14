"""

Test Cases:
Input	Output
5
10 5
3 2
5 6
1 5
8 7
1 4
-1

5
10 5
3 2
5 6
1 5
8 7
1 5
2

2
10 5
5 3
2 3
-1

5
8 5
3 2
5 6
1 5
8 7
1 2
3

3
3 2
6 4
9 6
1 3
2

5
2 3
4 6
10 15
5 8
1 1
-1

Solution:
"""

import math

def check_gcd(candi_list, c, d):
    for i in candi_list:
        if i[0] % c == 0 and i[1] % c == 0:
            return i
    return False

def check_ratio(candi_list, c, d, count=0):
    #print(candi_list)
    gcd_ratio = math.gcd(c,d)
    candies = check_gcd(candi_list, gcd_ratio, d)
    if candies:
        count += 1
        c -= candies[0]
        d -= candies[1]
        candi_list.remove(candies)
        if c == 0 and d == 0:
            return count
        else:
            return check_ratio(candi_list, c, d, count)

    else:
        for i in candi_list:
            c -= i[0]
            d -= i[1]
            count += 1
            if c == 0 and d == 0:
                return count
            elif c < 0 or d < 0:
                c += i[0]
                d += i[1]
                count -= 1
                continue
            else:
                candi_list.remove(i)
                return check_ratio(candi_list, c, d, count)
        return -1

def main():
    n = int(input())
    candi_list = []
    for i in range(n):
        candi_list.append([int(i) for i in input().strip().split()])
    c, d = [int(i) for i in input().strip().split()]
    print(check_ratio(candi_list, c, d))

if __name__ == '__main__':
    main()