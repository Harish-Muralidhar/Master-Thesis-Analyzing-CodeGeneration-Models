"""


Explanation

Example case 1: The first transceiver is a distance 1 from the second and the second is a distance 1 from the third, so all three are
close enough to communicate.

Example case 2: The Chef and the head server are close enough to communicate directly, and the sous-chef is close enough to the
head server to communicate through it.

Example case 3: No two are close enough to communicate directly, and there is no transceiver close enough to all three to serve as an
intermediate device.



Hint:
Try to find the distance between two points using Pythagoras Theorem.

Solution:
"""
import math
t=int(input())
for _ in range(t):
  r=int(input())
  x1,y1=map(int,input().split())
  x2,y2=map(int,input().split())
  x3,y3=map(int,input().split())
  d1=math.sqrt(((x1-x2)**2)+((y1-y2)**2))
  d2=math.sqrt(((x3-x2)**2)+((y3-y2)**2))
  d3=math.sqrt(((x1-x3)**2)+((y1-y3)**2))
  if d1<=r and d2<=r or d1<=r and d3<=r or d2<=r and d3<=r:
    print("yes")
  else:
    print("no")