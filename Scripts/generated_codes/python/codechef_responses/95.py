"""
"""
import math
for i in range(int(input())):
    n,m=map(int,input().split())
    max_area=0
    for i in range(n):
        l,b=map(int,input().split())
        area=l*b
        max_area=max(area,max_area)
    print(max_area)