"""


"""


import math


def get_answer(x, y, r, w, h):
    answer = 0
    x1 = x - r
    y1 = y - r

    x2 = x + r
    y2 = y + r

    if x2 > w:
        x2 = w
    if y2 > h:
        y2 = h
    if x1 < 0:
        x1 = 0
    if y1 < 0:
        y1 = 0

    if x2-x1 >= 0 and y2-y1 >= 0:
        answer = 2 * math.pi * r - 4 * (x2 - x1 + y2 - y1)
    elif x2-x1 < 0 and y2-y1 >= 0:
        answer = 2 * math.pi * r - 4 * (y2 - y1)
    elif x2-x1 >= 0 and y2-y1 < 0:
        answer = 2 * math.pi * r - 4 * (x2 - x1)
    else:
        answer = 2 * math.pi * r

    return answer


if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        w, h, n = map(int, input().split())
        circles = []
        for j in range(n):
            circles.append(list(map(float, input().split())))
        answer = 0
        for circle in circles:
            x, y, r = circle
            answer += get_answer(x, y, r, w, h)

        print("{:.6f}".format(answer))