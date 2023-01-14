'''

'''


import sys
if __name__ == "__main__":
    n = int(sys.stdin.readline().strip())
    arr = list(map(int, sys.stdin.readline().strip().split()))
    q = int(sys.stdin.readline().strip())
    for _ in range(q):
        k = int(sys.stdin.readline().strip())
        arr = sorted(arr)
        min_cost = 0
        for i in range(len(arr)):
            if k > 0:
                if i + k + 1 < len(arr):
                    min_cost += arr[i]
                else:
                    min_cost += arr[i] * (len(arr) - i)
                    break
                k -= 1
            else:
                min_cost += arr[i]
        print(min_cost)