"""


"""

import itertools

def rectangle_area(sticks):
    area = -1
    _len = len(sticks)
    if _len > 3:
        sticks = sorted(sticks, reverse = True)
        comb = itertools.combinations(sticks, 4)
        for x in comb:
            x = list(x)
            if x[0] == x[1] == x[2] == x[3]:
                if area != -1:
                    if area < 4 * x[0]:
                        area = 4 * x[0]
                else:
                    area = 4 * x[0]
            elif x[0] == x[1] and x[2] == x[3]:
                if area != -1:
                    if area < max(x[0],x[2])*min(x[0],x[2]):
                        area = max(x[0],x[2])*min(x[0],x[2])
                else:
                    area = max(x[0],x[2])*min(x[0],x[2])
                
            elif x[0] == x[2] and x[1] == x[3]:
                if area != -1:
                    if area < max(x[0],x[1])*min(x[0],x[1]):
                        area = max(x[0],x[1])*min(x[0],x[1])
                else:
                    area = max(x[0],x[1])*min(x[0],x[1])
                
            elif x[0] == x[3] and x[1] == x[2]:
                if area != -1:
                    if area < max(x[0],x[1])*min(x[0],x[1]):
                        area = max(x[0],x[1])*min(x[0],x[1])
                else:
                    area = max(x[0],x[1])*min(x[0],x[1])
                    
    return area

if __name__ == "__main__":
    T = int(input())
    sticks = []
    for i in range(T):
        N = int(input())
        sticks = list(map(int, input().split()))
        print(rectangle_area(sticks))