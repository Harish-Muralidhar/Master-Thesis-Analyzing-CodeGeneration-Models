'''
If your solution produces extra whitespace or a trailing newline, it will still be accepted if the output is correct.
'''


import sys, re

def isCiel(num):
    num = str(num)
    num_list = []
    for i in range(len(num)):
        num_list.append(num[i])
    if ('8' in num_list) and ('5' in num_list) and ('3' in num_list):
        return True
    else:
        return False

def count_digit(num, digit):
    num = str(num)
    num_list = []
    for i in range(len(num)):
        num_list.append(num[i])
    count = 0
    for j in range(len(num_list)):
        if num_list[j] == digit:
            count += 1
    return count

def check_price(price):
    if isCiel(price):
        if count_digit(price, '8') >= count_digit(price, '5') >= count_digit(price, '3'):
            return True
        else:
            return False
    else:
        return False

if __name__ == '__main__':
    num = int(sys.stdin.readline().strip())
    count = 0
    for i in range(num):
        menu = sys.stdin.readline().strip()
        price = int(re.findall('\d+', menu)[-1])
        if check_price(price):
            count += 1
    print(count)