'''


Solution:
'''
def find_triangle_height(num_coins):
    height = 1
    while num_coins > 0:
        num_coins -= height
        height += 1
        if num_coins <= 0:
            height -= 1
    return height


def main():
    num_test_cases = int(input())
    test_cases = []
    for i in range(num_test_cases):
        num_coins = int(input())
        test_cases.append(num_coins)
    for i in test_cases:
        print(find_triangle_height(i))


if __name__ == '__main__':
    main()