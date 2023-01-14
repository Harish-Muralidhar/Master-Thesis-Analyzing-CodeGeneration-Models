"""


Explanation

Example case 1. The Chef must travel along the route s0 to s1 to s2 (where the stations are numbered 0, 1, and 2). The trains between s0 and s1 and s1 and s2 are scheduled to run every 7 and 5 minutes, respectively.


The Chef arrives at s0 at time 0. The train from s0 to s1 will depart in 4 minutes so the Chef waits for 4 minutes and boards this train. He arrives at s1 at time 4. The train from s1 to s2 will depart in 1 minute so the Chef waits for 1 minute and boards this train. He arrives at s2 at time 5.


Example case 2. The Chef must travel along the route s0 to s1 to s2 (where the stations are numbered 0, 1, and 2). The trains between s0 and s1 and s1 and s2 are scheduled to run every 2 and 10 minutes, respectively.


The Chef arrives at s0 at time 0. The train from s0 to s1 will depart in 1 minute so the Chef waits for 1 minute and boards this train. He arrives at s1 at time 1. The train from s1 to s2 will depart in 8 minutes so the Chef waits for 8 minutes and boards this train. He arrives at s2 at time 9.


Example case 3. The Chef must travel along the route s0 to s1 to s2 (where the stations are numbered 0, 1, and 2). The trains between s0 and s1 and s1 and s2 are scheduled to run every 3 and 3 minutes, respectively.


The Chef arrives at s0 at time 0. The train from s0 to s1 will depart in 2 minutes so the Chef waits for 2 minutes and boards this train. He arrives at s1 at time 2. The train from s1 to s2 will depart in 1 minute so the Chef waits for 1 minute and boards this train. He arrives at s2 at time 3.
"""

import sys
import itertools

def read_input(filename):
    with open(filename) as data:
        n = int(data.readline().strip())
        coords = []
        for _ in range(n):
            coords.append(list(map(int, data.readline().strip().split())))
        return coords

def time_spent(coord):
    total_time = 0
    for i in range(len(coord)-1):
        xi, li, fi = coord[i]
        xj, lj, fj = coord[i+1]
        train_time = xj - (xi + li)
        if train_time > 0:
            train_time = (train_time // fj) * fj + fj
        total_time += train_time + li
    return total_time + coord[-1][1]

def main(filename):
    coords = read_input(filename)
    for coord in coords:
        print(time_spent(coord))

if __name__ == '__main__':
    main(sys.argv[1])