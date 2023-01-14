'''

Test #2:
Polygon 1: (62, 73)-(-66, -27)-(-14, 85)-(82, 19), encloses a single black point: (-11, -13).
Polygon 2: (82, 19)-(-14, 85)-(-38, 85), contains three black points: (-11, -13), (-95, -25), (-11, -55).
Polygon 3: (82, 19)-(-38, 85)-(-38, 44), contains a single black point: (-11, -13).
Polygon 4: (82, 19)-(-38, 44)-(-46, -9), has no black points inside.
Polygon 5: (-38, 85)-(-38, 44)-(-46, -9), encloses a single black point: (-11, -13).
Polygon 6: (-38, 85)-(-46, -9)-(-14, 85), contains a single black point: (-11, -13).
Polygon 7: (-38, 44)-(-46, -9)-(-14, 85), has no black points inside.


'''

import numpy as np
import matplotlib.pyplot as plt

def isInside(red, black):
    '''
    To check whether a given point is inside the polygon
    '''
    if len(red) < 3: # polygon with less than 3 vertices is not a polygon
        return False
    red = np.array(red)
    black = np.array(black)
    x = black[0]
    y = black[1]
    polygon = plt.Polygon(red)
    fig = plt.gcf()
    ax = fig.gca()
    ax.add_patch(polygon)
    plt.plot(x, y)
    fig.canvas.draw()
    return polygon.contains_point([x, y])


def main():
    n, m = map(int, input().split())
    red = []
    black = []
    for i in range(n):
        x, y = map(int, input().split())
        red.append((x, y))
    for i in range(m):
        x, y = map(int, input().split())
        black.append((x, y))
    Q = int(input())
    while Q > 0:
        Q -= 1
        k = int(input())
        vert = list(map(int, input().split()))
        points = []
        for i in vert:
            points.append(red[i-1])
        count = 0
        for pt in black:
            if isInside(points, pt):
                count += 1
        print(count)

main()