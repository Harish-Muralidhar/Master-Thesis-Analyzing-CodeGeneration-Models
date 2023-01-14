'''

'''
import math
T = int(input())
for i in range(T):
    N, K = map(int, input().split())
    print(math.floor(N/K))