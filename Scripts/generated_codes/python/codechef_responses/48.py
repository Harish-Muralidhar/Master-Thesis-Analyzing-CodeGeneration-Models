'''
Explanation:
In the first example, 2 is the number that doesn't have a pair

Solution:

'''
def find_missing_pair(arr, n):
    for i in range(n):
        for j in range(i+1,n):
            if arr[i] == arr[j]:
                break
        if j == (n-1):
            return arr[i]

for _ in range(int(input())):
    n = int(input())
    arr = list(map(int,input().split()))
    print(find_missing_pair(arr, n))