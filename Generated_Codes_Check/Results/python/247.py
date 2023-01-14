'''

'''

import math

def chef_game(x,k):
    count = 0
    while k > 0:
        mid = (x/2)
        count += 1
        if count == k:
            return mid
        else:
            x -= mid
    
    

if __name__ == "__main__":
    n = int(input())
    for i in range(n):
        x,k = map(int, input().split())
        print(chef_game(x,k))