'''


In this problem, the length of the segment (x1, y1) - (x2, y2) is defined as the Euclidean distance between the endpoints.
That is, the length of the segment (x1, y1) - (x2, y2) is the square root of (x1 - x2)^2 + (y1 - y2)^2.

In this problem, the length of the segment (x1, y1) - (x2, y2) is defined as the Euclidean distance between the endpoints.
That is, the length of the segment (x1, y1) - (x2, y2) is the square root of (x1 - x2)^2 + (y1 - y2)^2.

'''

import math

def distance(p1, p2):
    '''
    returns the euclidean distance between the two points
    '''
    return math.sqrt((p1[0] - p2[0])**2 + (p1[1] - p2[1])**2)

def tetragon_length(points):
    '''
    points: list of points, [[x1,y1],[x2,y2],...,[xn,yn]]
    returns the length of the side of a tetragon, the side with the maximum euclidean distance
    '''
    lengths = []
    for i in range(len(points)):
        for j in range(i+1,len(points)):
            lengths.append(distance(points[i],points[j]))
    return max(lengths)

def main():
    '''
    main function
    '''
    n_test = int(input())
    for _ in range(n_test):
        n_points = int(input())
        points = []
        for _ in range(n_points):
            points.append([int(x) for x in input().split()])
        print(tetragon_length(points))

if __name__ == '__main__':
    main()