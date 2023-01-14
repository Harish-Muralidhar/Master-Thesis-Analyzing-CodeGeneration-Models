"""
"""

while True:
    try:
        n = int(input())
        m = [int(x)-1 for x in input().split()]
        if n <= 100000:
            if m == [x for x in range(n)]:
                print("ambiguous")
            elif m == [x for x in range(n)][::-1]:
                print("ambiguous")
            else:
                print("not ambiguous")
        else:
            print("not ambiguous")
    except:
        break