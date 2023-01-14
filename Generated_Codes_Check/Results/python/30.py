"""
"""

def triangle_validity(a,b,c):
    if a+b+c == 180:
        return "YES"
    else:
        return "NO"

t = int(input())
for i in range(t):
    inp = list(map(int, input().split(" ")))
    print(triangle_validity(inp[0],inp[1],inp[2]))