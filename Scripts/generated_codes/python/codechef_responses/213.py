'''
 pairs.
Case 4 : N = 6. If Arjuna makes the pair (1,3), Bhima can make the pair (2,4). Arjuna can make one more pair (5,6). Now Bhima can not make any more pairs.

'''

t=int(input())
for i in range(t):
    n=int(input())
    if n%2==0:
        print("Arjuna")
    else:
        print("Bhima")