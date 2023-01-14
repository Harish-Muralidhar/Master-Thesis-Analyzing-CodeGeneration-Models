'''

Input:
1
4 4
1 1
1 4
1 1 1 1 
1 1 1 1
1 1 1 1
1 1 1 1
1 1 1 1

Output:
57

'''


t = int(input())
for i in range(t):
    N, M = map(int, input().split())
    sx, sy = map(int, input().split())
    fx, fy = map(int, input().split())
    a = [[int(j) for j in input().split()] for i in range(N)]
    arr = a
    count = 0
    if fx > sx:
        if fx - sx >= 2:
            test = fx - 2
            while test <= fx:
                if arr[test][fy - 1] == 0:
                    count += 1
                    arr[test][fy - 1] = -1
                test += 1
        elif fx - sx == 1:
            test = fx - 1
            while test <= fx:
                if arr[test][fy - 1] == 0:
                    count += 1
                    arr[test][fy - 1] = -1
                test += 1
    elif fx < sx:
        if sx - fx >= 2:
            test = fx
            while test <= fx + 2:
                if arr[test][fy - 1] == 0:
                    count += 1
                    arr[test][fy - 1] = -1
                test += 1
        elif sx - fx == 1:
            test = fx
            while test <= fx + 1:
                if arr[test][fy - 1] == 0:
                    count += 1
                    arr[test][fy - 1] = -1
                test += 1
    if fy > sy:
        if fy - sy >= 2:
            test = fy - 2
            while test <= fy:
                if arr[fx - 1][test] == 0:
                    count += 1
                    arr[fx - 1][test] = -1
                test += 1
        elif fy - sy == 1:
            test = fy - 1
            while test <= fy:
                if arr[fx - 1][test] == 0:
                    count += 1
                    arr[fx - 1][test] = -1
                test += 1
    elif fy < sy:
        if sy - fy >= 2:
            test = fy
            while test <= fy + 2:
                if arr[fx - 1][test] == 0:
                    count += 1
                    arr[fx - 1][test] = -1
                test += 1
        elif sy - fy == 1:
            test = fy
            while test <= fy + 1:
                if arr[fx - 1][test] == 0:
                    count += 1
                    arr[fx - 1][test] = -1
                test += 1
    print(count)

'''
def calculate(arr, x, y, count):
    if x == N - 1 and y == M - 1:
        return count
    else:
        if arr[x][y] != 0:
            arr[x][y] -= 1
            if x + 1 < N:
                if arr[x + 1][y] == 0:
                    count += calculate(arr, x + 1, y, count)
                else:
                    count += calculate(arr, x + 1, y, count)
            if x + 2 < N:
                if arr[x + 2][y] == 0:
                    count += calculate(arr, x + 2, y, count)
                else:
                    count += calculate(arr, x + 2, y, count)
            if y + 1 < M:
                if arr[x][y + 1] == 0:
                    count += calculate(arr, x, y + 1, count)
                else:
                    count += calculate(arr, x, y + 1, count)
            if y + 2 < M:
                if arr[x][y + 2] == 0:
                    count += calculate(arr, x, y + 2, count)
                else:
                    count += calculate(arr, x, y + 2, count)
            if x - 1 >= 0:
                if arr[x - 1][y] == 0:
                    count += calculate(arr, x - 1, y, count)
                else:
                    count += calculate(arr, x - 1, y, count)
            if x - 2 >= 0:
                if arr[x - 2][y] == 0:
                    count += calculate(arr, x - 2, y, count)
                else:
                    count += calculate(arr, x - 2, y, count)
            if y - 1 >= 0:
                if arr[x][y - 1] == 0:
                    count += calculate(arr, x, y - 1, count)
                else:
                    count += calculate(arr, x, y - 1, count)
            if y - 2 >= 0:
                if arr[x][y - 2] == 0:
                    count += calculate(arr, x, y - 2, count)
                else:
                    count += calculate(arr, x, y - 2, count)
            return count
        else:
            arr[x][y] = -1
            return count


t = int(input())
for i in range(t):
    N, M = map(int, input().split())
    sx, sy = map(int, input().split())
    fx, fy = map(int, input().split())
    a = [[int(j) for j in input().split()] for i in range(N)]
    arr = a
    count = 0
    count = calculate(arr, sx - 1, sy - 1, count)
    print(count)

'''