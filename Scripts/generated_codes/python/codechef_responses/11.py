'''

"""
import math
from collections import Counter

def get_min_menus(price, menu_dict):
    total_num_of_menus = 0
    for menu in menu_dict:
        num_of_menus, remainder = divmod(price, menu)
        menu_dict[menu] = num_of_menus
        total_num_of_menus += num_of_menus
        price = remainder
        if price == 0:
            break
    return total_num_of_menus


if __name__ == '__main__':
    num_of_test_cases = int(input())
    menu_dict = {2 ** i - 1: 0 for i in range(1, 13)}
    for i in range(num_of_test_cases):
        price = int(input())
        print(get_min_menus(price, menu_dict))



'''
def get_min_menus(price, menu_dict):
    total_num_of_menus = 0
    for menu in menu_dict:
        num_of_menus, remainder = divmod(price, menu)
        menu_dict[menu] = num_of_menus
        total_num_of_menus += num_of_menus
        price = remainder
        if price == 0:
            break
    return total_num_of_menus

if __name__ == '__main__':
    num_of_test_cases = int(input())
    menu_dict = {2 ** i - 1: 0 for i in range(1, 13)}
    for i in range(num_of_test_cases):
        price = int(input())
        print(get_min_menus(price, menu_dict))
'''