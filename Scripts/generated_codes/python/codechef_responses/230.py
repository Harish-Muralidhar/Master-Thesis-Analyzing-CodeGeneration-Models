"""
"""

def min_ballons(r,g,b,k):
    if k == 1:
        return min(r,g,b)
    elif k == 2:
        return min(r+g,g+b,b+r)
    else:
        return r+b+g+1

t = int(input("Test cases: "))
ballons = []
for i in range(t):
    ballons.append(input("Ballons: "))
k_ballons = []
for i in range(t):
    k_ballons.append(int(input("K ballons: ")))

for i in range(t):
    r,g,b = tuple(map(int, ballons[i].split()))
    print(min_ballons(r,g,b,k_ballons[i]))