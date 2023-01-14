'''

In the third example,
You need to paint 2 balloons to make all of them the same color.

'''

def main():
    t = int(input())
    for i in range(t):
        s = input()
        count = 0

        for i in range(len(s) - 1):
            if s[i] != s[i+1]:
                count += 1

        print(count)

main()