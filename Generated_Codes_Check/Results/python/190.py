'''

import sys
sys.setrecursionlimit(1500)

def split(s):
    l = len(s)
    s1 = s[:l//2]
    s2 = s[l//2:]
    return s1, s2

def hash(s):
    result = s.count('A')
    if len(s) > 1:
        (s1, s2) = split(s)
        result = result + max(hash(s1), hash(s2))
    return result

if __name__ == '__main__':
    for _ in range(int(input())):
        a, e, v = map(int, input().split())
        s = 'A'*a + 'E'*e
        
        if hash(s) == v:
            print(1)
        else:
            print(0)
        
'''

import sys
sys.setrecursionlimit(1500)

def split(s):
    l = len(s)
    s1 = s[:l//2]
    s2 = s[l//2:]
    return s1, s2

def hash(s):
    result = s.count('A')
    if len(s) > 1:
        (s1, s2) = split(s)
        result = result + max(hash(s1), hash(s2))
    return result

def get_all_possible_strings(a, e):
    string_list = []
    for i in range(0, a+1):
        string_list.append('A'*i + 'E'*(a-i))
    return string_list

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        a, e, v = map(int, input().split())
        a_str_list = get_all_possible_strings(a, e)
        counter = 0
        for s in a_str_list:
            if hash(s) == v:
                counter += 1
        print(counter)