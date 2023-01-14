"""
"""


def lexicographically_smallest_subsequence(string, length):
    i = 0
    sequence = ""
    while len(sequence) < length and i < len(string):
        if len(sequence) == 0:
            sequence += string[i]
            i += 1
        elif string[i] < sequence:
            sequence = sequence[:len(sequence) - 1] + string[i]
            i += 1
        else:
            sequence += string[i]
            i += 1
    return sequence


if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        string = input()
        length = int(input())
        print(lexicographically_smallest_subsequence(string, length))