"""
"""



import sys

T = int(input())

for i in range(T):
    S1 = list(input())
    S2 = list(input())
    min_diff = 0
    max_diff = 0
    for i in range(len(S1)):
        if (S1[i] == '?' and S2[i] == '?'):
            max_diff += 1
        elif (S1[i] == '?' or S2[i] == '?'):
            max_diff += 1
            min_diff += 1
        elif (S1[i] != S2[i]):
            min_diff += 1
            max_diff += 1
    print(min_diff, max_diff)