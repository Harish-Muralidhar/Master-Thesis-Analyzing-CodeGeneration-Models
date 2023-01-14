"""

Explanation

Example case 1. As both guards do not know the entry of Chef, the minimum number of entry could be 0 and the maximum number of entry could be 36.

"""

def main():
    for _ in range(int(input())):
        a,b = map(int,input().split())
        print(max(a-1,0),a+b)

if __name__ == '__main__':
    main()