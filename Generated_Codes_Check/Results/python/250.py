'''


Solution:

'''


def isDoubleString(s):
    n = len(s)
    for i in range(n):
        if n % 2 == 0:
            if s[i:] + s[:i] == s[i:] + s[:i]:
                return True
        else:
            if s[i+1:] + s[:i+1] == s[i+1:] + s[:i+1]:
                return True
    else:
        return False

for _ in range(int(input())):
    s = input()
    if isDoubleString(s):
        print("YES")
    else:
        print("NO")


'''

Time Complexity of Solution:
O(n2)

'''