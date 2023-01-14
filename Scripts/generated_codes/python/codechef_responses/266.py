*/

import sys


def cut_board(s):
    count = 0
    last_index = len(s) - 1
    for i in range(last_index):
        # if s[i] == '0':
        #     continue
        if int(s[i]) % 8 == 0:
            count += 1
    for i in range(last_index):
        for j in range(i + 1, last_index):
            # if s[i] == '0':
            #     continue
            n = int(s[i:j+1])
            if n % 8 == 0:
                count += 1
    return count


if __name__ == "__main__":
    # s = sys.stdin.readline().strip()
    s = '5858'
    print(cut_board(s))