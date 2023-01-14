'''




'''

import sys
def main():

    testcases = int(sys.stdin.readline())

    for _ in range(testcases):
        line = sys.stdin.readline()
        pl = line.strip()
        if '#' == pl[0] and '#' == pl[-1]:
            pl = pl[1:-1]
        else:
            print('Error')
            continue
        #print(pl)
        days = 0
        jump = 1
        for i in range(len(pl)):
            if pl[i] == '#':
                #jump += 1
                continue
            else:
                days += 1
                jump += 1
        print(days)


if __name__ == '__main__':
    main()