'''
'''

# SOLUTION

for _ in range(int(input())):
    s1 = input()
    s2 = input()
    max_count = 0
    min_count = 0
    for i in range(len(s1)):
        if s1[i] == '?' or s2[i] == '?':
            max_count += 1
        elif s1[i] != s2[i]:
            max_count += 1
            min_count += 1
    print(min_count, max_count)