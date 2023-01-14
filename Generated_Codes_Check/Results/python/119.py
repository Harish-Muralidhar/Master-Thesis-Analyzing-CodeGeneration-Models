*/

n,m = map(int, input().split())
houses = dict()
for i in range(1,n+1):
    houses[i] = 0
    
for i in range(m):
    temp = input().split()
    if temp[0] == 'P':
        for i in range(int(temp[1]),int(temp[2])+1):
            houses[i] += 1
    elif temp[0] == 'M':
        for i in range(int(temp[2])+1,n+1):
            houses[i] += 1
        for i in range(1,int(temp[2])):
            houses[i] += 1
    elif temp[0] == 'B':
        print(houses[int(temp[1])])