'''

'''

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'solveExpression' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING expression as parameter.
#

def solveExpression(expression):
    # Write your code here
    opstack = []
    output = []
    expression = expression.replace('(', '( ')
    expression = expression.replace(')', ' )')
    expression = expression.replace('+', ' + ')
    expression = expression.replace('-', ' - ')
    expression = expression.replace('*', ' * ')
    expression = expression.replace('/', ' / ')
    expression = expression.split()
    for char in expression:
        if char.isalpha():
            output.append(char)
        elif char == '(':
            opstack.append(char)
        elif char == ')':
            while len(opstack)>0 and opstack[-1] != '(':
                output.append(opstack.pop())
            opstack.pop()
        elif char in ['+', '-', '*', '/']:
            while len(opstack)>0 and opstack[-1] not in ['+', '-', '(', '*', '/']:
                output.append(opstack.pop())
            opstack.append(char)
    while len(opstack)>0:
        output.append(opstack.pop())
    return ' '.join(output)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    for n_itr in range(n):
        expression = input()

        result = solveExpression(expression)

        fptr.write(result + '\n')

    fptr.close()