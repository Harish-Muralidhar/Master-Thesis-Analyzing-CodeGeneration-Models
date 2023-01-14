"""



Explanation

In the first sample case, Ciel's K is 1, so Ciel has to create 1 road.
For example, if the road is created parallel to the y-axis at y=10, the nearest distance di is 10 for the i-th restaurant with xi=20.
The nearest distance di is 20 for the i-th restaurant with xi=-20.
In this case, max(d1, d2, ..., dN) is 20.

In the second sample case, Ciel's K is 2, so Ciel has to create 2 roads.
For example, if the roads are created parallel to the x-axis at x=10 and x=-10, the nearest distance di is 10 for the i-th restaurant with yi=20.
The nearest distance di is 10 for the i-th restaurant with yi=-20.
In this case, max(d1, d2, ..., dN) is 10.

Notice that in the second sample case, the distance between x=0 and the nearest restaurant from x=0 is 0.707...
For this case, max(d1, d2, ..., dN) can be minimized to 0.707...

In the second sample case, the distance between y=0 and the nearest restaurant from y=0 is also 0.707...
Please notice that Ciel cannot create 2 roads parallel to the y-axis.
"""

def get_nearest_road(distance, i, j):
    return min(distance[i][j], distance[i][j+1])

def get_all_road_distance(points, n, k):
    distance = [[0 for i in range(n)] for j in range(n)]
    for i in range(n-1):
        for j in range(i+1, n):
            distance[i][j] = abs(points[i][0]-points[j][0])
    distance.sort()

    for i in range(n):
        for j in range(n):
            distance[i][j] = min(distance[i][j], distance[j][i])

    return distance

def main():
    t = int(input())
    for _ in range(t):
        n, k = map(int, input().split())
        points = []
        for i in range(n):
            points.append(list(map(int, input().split())))

        distance = get_all_road_distance(points, n, k)

        _min = float('inf')
        for i in range(n-k+1):
            for j in range(i, n):
                _max = max(distance[i][j], get_nearest_road(distance, i, j))
                if _max < _min:
                    _min = _max

        print("%.10f"%_min)

if __name__ == '__main__':
    main()