'''

NOTE: Your code should be able to convert the sample input into the sample output. However, this is not enough to pass the challenge, because the code will be run on multiple test cases. Therefore, your code must solve this problem statement.

Test case 1 
Test case 2 
Test case 3
Test case 4

'''

from sys import stdin


def input():
    return stdin.readline().strip()


def main():
    test_cases = int(input())
    while test_cases > 0:
        n = int(input())
        s = input().split()
        if (n == 1 and 'a' in s[0]) or (n == 1 and 'b' in s[0]):
            print(0)
        elif n == 1:
            print(1)
        else:
            c1 = 0
            c2 = 0
            c3 = 0
            for i in s:
                if len(i) == 1:
                    if 'a' in i:
                        c1 += 1
                    if 'b' in i:
                        c2 += 1
                elif len(i) == 2:
                    if 'a' in i and 'b' in i:
                        c3 += 1
            if c1 == 0:
                print(c2)
            elif c2 == 0:
                print(c1)
            elif c3 == 0:
                print(c1 + c2)
            else:
                print(c1 + c2 - c3)
        test_cases -= 1

if __name__ == '__main__':
    main()