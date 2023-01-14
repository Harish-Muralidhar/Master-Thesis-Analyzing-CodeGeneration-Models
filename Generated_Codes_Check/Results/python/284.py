"""

"""
import sys
sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")

for _ in range(int(input())):
    xe, ye, xa, ya, dire, dira = list(map(str, input().split()))+list(map(str, input().split()))
    xe, ye, xa, ya = int(xe), int(ye), int(xa), int(ya)
    if dire == dira and dire in ("U", "D") and xa > xe:
        print("SAFE")
    elif dire == dira and dire in ("L", "R") and ya > ye:
        print("SAFE")
    elif dire != dira and (dire in ("U", "D") and dira in ("U", "D")) and xa > xe:
        print("SAFE")
    elif dire != dira and (dire in ("L", "R") and dira in ("L", "R")) and ya > ye:
        print("SAFE")
    else:
        if dire in ("U", "D"):
            print(abs(xa-xe))
        else:
            print(abs(ya-ye))