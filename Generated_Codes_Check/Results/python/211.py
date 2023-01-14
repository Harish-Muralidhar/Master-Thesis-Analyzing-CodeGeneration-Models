"""

Example case 2. In the second case, there are two ways to divide the money: either both thieves run away with half of the money, or Chef runs away with half of the money and his colleague gets nothing. If they choose the second option, they get 250 million dollars each and the total amount of stolen money is 500 million. If they choose the first option, they get half a billion each and the total amount of stolen money is 1 billion.
"""


def get_money(m,p,d):
    t = 10**9
    for i in range(m):
        t = t*p
    return round(t/2,d)

if __name__ == "__main__":
    T = int(input())
    output = []
    for i in range(T):
        m,p = map(float,input().split())
        output.append(get_money(m,p,3))
    for i in output:
        print(i,0)