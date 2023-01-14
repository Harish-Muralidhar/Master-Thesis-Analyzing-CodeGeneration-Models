"""

Samplw I/O
Example Input
CHEFCHEFFFF
CHHHEEEFFCC
Example Output
2
1
"""
s = input()
x = "CHEF"
count = 0
while(True):
    if(x in s):
        count+=1
        s = s.replace(x,"")
    else:
        break
print(count)