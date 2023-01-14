'''

Explanation
The first friend will visit the 3rd house at time 1, and this is the only house that he will visit before time 1. So, we lock him in the 3rd house.
The second friend will visit the 2nd house at time 4, and this is the only house that he will visit before time 4. So, we lock him in the 2nd house.
The third friend will visit the 1st house at time 7, and this is the only house that he will visit before time 7. So, we lock him in the 1st house.

Input:
3
1 3 5
2 4 6
7 8 10

Output:
-1
Explanation
In this example, it is impossible to lock any friend in the 1st house.
For example, the first friend will visit the 1st house at time 1, but the second friend will also visit the 1st house at time 1.
Hence, there is no sequence block that satisfies the constraints.

Input:
2
1 3
2 4

Output:
2 1
Explanation
In this example, we lock the first friend in the second house, and the second friend in the first house.


'''

# Write your code here


n = int(input())
arr = [[0 for i in range(n)] for j in range(n)]
for i in range(n):
    temp = list(map(int, input().split()))
    for j in range(n):
        arr[i][j] = temp[j]
block = [-1 for i in range(n)]

for i in range(n):
    for j in range(n):
        if(arr[i][j] != 0):
            if(block[i] == -1):
                block[i] = j + 1 
            else:
                if(block[i] == arr[i][j]):
                    continue
                else:
                    block = [-1]
                    break
        else:
            block = [-1]
            break
if(block == [-1]):
    print(-1)
else:
    for i in range(n):
        print(block[i], end = ' ')