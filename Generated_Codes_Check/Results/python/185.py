'''






'''


import re
import math


def convert_decimal(input_str):
    flag = 1
    result = ''
    for i in input_str:
        if i == '0':
            if flag == 1:
                result += '1'
            else:
                result += '0'
        else:
            if flag == 1:
                flag = 0
            else:
                flag = 1
    return result


def main():

    while True:
        try:
            input_str = input()
            if input_str[-1] != '#':
                continue
            elif input_str == '#':
                break
            else:
                input_str = re.sub(r'\s+', '', input_str).rstrip('#')
                print(int(input_str, 2))
        except EOFError:
            break


if __name__ == '__main__':
    main()