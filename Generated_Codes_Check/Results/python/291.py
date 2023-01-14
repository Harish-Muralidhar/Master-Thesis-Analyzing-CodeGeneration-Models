"""

"""




import numpy as np
from itertools import combinations, product
from math import sqrt


class racetrack(object):
    def __init__(self, r, R, cones):
        self.r = r
        self.R = R
        self.circles = [{'center': (0,0), 'radius': r},
                        {'center': (0,0), 'radius': R}]
        self.cones = cones
        self.n = len(cones)
        self.pairs = list(combinations(range(self.n+2), 2))
        self.circles.extend(cones)
        self.starts = self.get_starts()

    def get_starts(self):
        starts = []
        for p1, p2 in self.pairs:
            if p1 <= 1 or p2 <= 1:
                continue
            c1, c2 = self.circles[p1], self.circles[p2]
            d = sqrt((c1['center'][0] - c2['center'][0])**2 + (c1['center'][1] - c2['center'][1])**2)
            if d >= c1['radius'] + c2['radius']:
                starts.append([c1, c2])
        return starts

    def get_car_radius(self, start):
        c1, c2 = start
        car_radius = (c1['radius'] + c2['radius'] - sqrt((c1['center'][0] - c2['center'][0])**2 + (c1['center'][1] - c2['center'][1])**2))/2
        return car_radius

    def is_navigatable(self, car_radius, start):
        c1, c2 = start
        for c in [self.circles[0], self.circles[1], c1, c2]:
            if c['radius'] < car_radius:
                return False
        for c in self.cones[2:]:
            if sqrt((c['center'][0] - c1['center'][0])**2 + (c['center'][1] - c1['center'][1])**2) < car_radius or sqrt((c['center'][0] - c2['center'][0])**2 + (c['center'][1] - c2['center'][1])**2) < car_radius:
                return False
        return True

    def get_max_car_radius(self):
        max_car_radius = 0
        for start in self.starts:
            car_radius = self.get_car_radius(start)
            if self.is_navigatable(car_radius, start) and car_radius > max_car_radius:
                max_car_radius = car_radius
        return max_car_radius


def get_input():
    lines = []
    while True:
        try:
            lines.append(input())
        except EOFError:
            break
    return lines


def process_input(lines):
    test_cases = int(lines.pop(0))
    for i in range(test_cases):
        r, R = [int(n) for n in lines.pop(0).split()]
        N = int(lines.pop(0))
        cones = []
        for j in range(N):
            x, y = [int(n) for n in lines.pop(0).split()]
            cones.append({'center': (x, y), 'radius': 0})
        lines.pop(0)
        yield racetrack(r, R, cones)


def main():
    lines = get_input()
    for racetrack in process_input(lines):
        print("{:.3f}".format(racetrack.get_max_car_radius()*2))


if __name__ == '__main__':
    main()