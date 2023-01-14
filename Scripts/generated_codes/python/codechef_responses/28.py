'''
'''

import math
import os
import random
import re
import sys

#
# Complete the 'classify_ship' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING id as parameter.
#

def classify_ship(id):
    # Write your code here
    if(id=='B' or id=='b'):
        return "BattleShip"
    elif(id=='C' or id=='c'):
        return "Cruiser"
    elif(id=='D' or id=='d'):
        return "Destroyer"
    elif(id=='F' or id=='f'):
        return "Frigate"
    else:
        return "Invalid Input"


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    id = input()

    result = classify_ship(id)

    fptr.write(result + '\n')

    fptr.close()