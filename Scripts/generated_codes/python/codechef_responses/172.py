"""

"""

# Python3 program to find  
# solutions of equations of 
# the form a^x+b^y = c^z 
  
# Function to find solutions 
# of above equations 
def findSolution(a, b, c): 
  
    # Iterate through all 
    # possible values of x 
    for x in range(1, c): 
  
        # Iterate through all 
        # possible values of y 
        for y in range(1, c): 
  
            # Check if a^x + b^y = c^z 
            # has any solutions 
            if (a ** x + b ** y == c ** (x + y)): 
                print("%d^%d + %d^%d = %d^%d"
                      % (a, x, b, y, c, 
                         x + y)) 
  
# Driver code 
a = 2
b = 3
c = 5
findSolution(a, b, c)