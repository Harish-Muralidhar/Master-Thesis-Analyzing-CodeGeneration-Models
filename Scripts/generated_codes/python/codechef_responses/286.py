"""

Explanation
In the first case, the entire expression is valid.
In the second case, there's no prefix of the given expression that is valid.
In the third case, the longest prefix of the given expression that is valid is "<>" .
"""

import re

def find_max_valid(data):
    max_valid = 0
    valid_count = 0
    invalid_count = 0
    for i in range(len(data)):
        if data[i] == "<":
            valid_count += 1
        elif data[i] == ">":
            if valid_count > 0:
                valid_count -= 1
            else:
                invalid_count += 1
        else:
            continue
        if valid_count == 0:
            max_valid = i + 1

    if valid_count > 0:
        max_valid -= (valid_count + invalid_count)
    if max_valid < 0:
        max_valid = 0

    return max_valid

if __name__ == "__main__":
    test_cases = int(input().strip())
    for i in range(test_cases):
        data = input().strip()
        print(find_max_valid(data))