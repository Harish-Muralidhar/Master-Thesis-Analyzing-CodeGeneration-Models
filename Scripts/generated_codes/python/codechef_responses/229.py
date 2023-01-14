'''


Input:
10
1
1
2
1 2
5
10 9 8 7 6
2
10 10
3
10 20 30
3
10 20 10
3
10 20 10
3
10 20 10
1
100
1
100
1
100

Output:
1
2
25
20
60
30
30
20
100
100
100


'''

# Write your code here
testCases = int(input())

for i in range(testCases):
    memory = 0
    N = int(input())
    arr = list(map(int,input().split()))
    for j in range(N):
        memory = memory + arr[j] - arr[j-1]
        if memory<0:
            memory = 0
    print(memory)