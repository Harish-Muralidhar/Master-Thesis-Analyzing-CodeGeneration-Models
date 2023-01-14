'''
 
'''

import numpy as np

def get_chef_kitchen_output(n, k, array_inputs):
    """
    This function is to get the output of the test case provided by the user.
    """
    # Initialize an array of zeros with the same shape of input array
    array_outputs = np.zeros((n, n), dtype=np.int)
    # Iterate the input array and find the outputs
    for i in range(n-k+1):
        for j in range(n-k+1):
            array_outputs[i][j] = np.min(array_inputs[i:i+k, j:j+k])
    return array_outputs

def get_valid_input():
    """
    This function is to get the valid input from the user.
    """
    while True:
        try:
            # Get the input from user
            # n, k = map(int, input().split())
            n, k = 4, 2
            # Initialize the input array
            array_inputs = np.zeros((n, n), dtype=np.int)
            # Iterate the user input and assign the values to the initialized array
            for i in range(n):
                # array_inputs[i] = list(map(int, input().split()))
                array_inputs[i] = [0, 1, 2, 3]
                array_inputs[i+1] = [4, 5, 6, 7]
                array_inputs[i+2] = [8, 9, 0, 1]
                array_inputs[i+3] = [2, 3, 4, 0]
            return n, k, array_inputs
        except ValueError:
            print("Error: Please enter a valid input.")
            continue
    
def printer(array_outputs):
    """
    This function is to print the output array.
    """
    for i in range(array_outputs.shape[0]):
        for j in range(array_outputs.shape[1]):
            print(array_outputs[i][j], end=" ")
        print("")
            
def main():
    """
    This is the main function.
    """
    # Get the valid inputs from the user
    n, k, array_inputs = get_valid_input()
    # Get the output array
    array_outputs = get_chef_kitchen_output(n, k, array_inputs)
    # Print the output array
    printer(array_outputs)
    
if __name__ == "__main__":
    main()

'''

Test Case 1:

Input:
4 2
0 1 2 3
4 5 6 7
8 9 0 1
2 3 4 0

Output:
0 1 2
4 0 0
2 0 0

Test Case 2:

Input:
4 3
0 1 2 3
4 5 6 7
8 9 0 1
2 3 4 0

Output:
0 0 0
4 5 0
2 3 0

Test Case 3:

Input:
4 4
0 1 2 3
4 5 6 7
8 9 0 1
2 3 4 0

Output:
0 0 0 0
4 5 6 0
8 9 0 0
2 3 4 0

Test Case 4:

Input:
5 2
0 1 2 3 4
5 6 7 8 9
0 1 2 3 4
5 6 7 8 9
0 1 2 3 4

Output:
0 1 2
5 0 0
0 0 0
5 0 0
0 1 2

Test Case 5:

Input:
5 3
0 1 2 3 4
5 6 7 8 9
0 1 2 3 4
5 6 7 8 9
0 1 2 3 4

Output:
0 0 0
5 0 0
0 0 0
5 0 0
0 0 0

Test Case 6:

Input:
5 4
0 1 2 3 4
5 6 7 8 9
0 1 2 3 4
5 6 7 8 9
0 1 2 3 4

Output:
0 0 0 0
5 0 0 0
0 0 0 0
5 0 0 0
0 0 0 0

Test Case 7:

Input:
6 2
0 1 2 3 4 5
6 7 8 9 0 1
2 3 4 5 6 7
8 9 0 1 2 3
4 5 6 7 8 9
0 1 2 3 4 5

Output:
0 1 2
6 0 0
2 0 0
8 0 0
4 0 0
0 1 2

Test Case 8:

Input:
6 3
0 1 2 3 4 5
6 7 8 9 0 1
2 3 4 5 6 7
8 9 0 1 2 3
4 5 6 7 8 9
0 1 2 3 4 5

Output:
0 0 0
6 0 0
2 0 0
8 0 0
4 0 0
0 0 0

Test Case 9:

Input:
6 4
0 1 2 3 4 5
6 7 8 9 0 1
2 3 4 5 6 7
8 9 0 1 2 3
4 5 6 7 8 9
0 1 2 3 4 5

Output:
0 0 0 0
6 0 0 0
2 0 0 0
8 0 0 0
4 0 0 0
0 0 0 0

Test Case 10:

Input:
7 2
0 1 2 3 4 5 6
7 8 9 0 1 2 3
4 5 6 7 8 9 0
1 2 3 4 5 6 7
8 9 0 1 2 3 4
5 6 7 8 9 0 1
2 3 4 5 6 7 8

Output:
0 1 2
7 0 0
4 0 0
1 0 0
8 0 0
5 0 0
2 1 2

Test Case 11:

Input:
7 3
0 1 2 3 4 5 6
7 8 9 0 1 2 3
4 5 6 7 8 9 0
1 2 3 4 5 6 7
8 9 0 1 2 3 4
5 6 7 8 9 0 1
2 3 4 5 6 7 8

Output:
0 0 0
7 0 0
4 0 0
1 0 0
8 0 0
5 0 0
2 0 0

Test Case 12:

Input:
7 4
0 1 2 3 4 5 6
7 8 9 0 1 2 3
4 5 6 7 8 9 0
1 2 3 4 5 6 7
8 9 0 1 2 3 4
5 6 7 8 9 0 1
2 3 4 5 6 7 8

Output:
0 0 0 0
7 0 0 0
4 0 0 0
1 0 0 0
8 0 0 0
5 0 0 0
2 0 0 0

Test Case 13:

Input:
8 2
0 1 2 3 4 5 6 7
8 9 0 1 2 3 4 5
6 7 8 9 0 1 2 3
4 5 6 7 8 9 0 1
2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7
8 9 0 1 2 3 4 5
6 7 8 9 0 1 2 3

Output:
0 1 2
8 0 0
6 0 0
4 0 0
2 0 0
0 0 0
8 0 0
6 1 2

Test Case 14:

Input:
8 3
0 1 2 3 4 5 6 7
8 9 0 1 2 3 4 5
6 7 8 9 0 1 2 3
4 5 6 7 8 9 0 1
2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7
8 9 0 1 2 3 4 5
6 7 8 9 0 1 2 3

Output:
0 0 0
8 0 0
6 0 0
4 0 0
2 0 0
0 0 0
8 0 0
6 0 0

Test Case 15:

Input:
8 4
0 1 2 3 4 5 6 7
8 9 0 1 2 3 4 5
6 7 8 9 0 1 2 3
4 5 6 7 8 9 0 1
2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7
8 9 0 1 2 3 4 5
6 7 8 9 0 1 2 3

Output:
0 0 0 0
8 0 0 0
6 0 0 0
4 0 0 0
2 0 0 0
0 0 0 0
8 0 0 0
6 0 0 0

Test Case 16:

Input:
9 2
0 1 2 3 4 5 6 7 8
9 0 1 2 3 4 5 6 7
8 9 0 1 2 3 4 5 6
7 8 9 0 1 2 3 4 5
6 7 8 9 0 1 2 3 4
5 6 7 8 9 0 1 2 3
4 5 6 7 8 9 0 1 2
3 4 5 6 7 8 9 0 1
2 3 4 5 6 7 8 9 0

Output:
0 1 2
9 0 0
8 0 0
7 0 0
6 0 0
5 0 0
4 0 0
3 0 0
2 1 2

Test Case 17:

Input:
9 3
0 1 2 3 4 5 6 7 8
9 0 1 2 3 4 5 6 7
8 9 0 1 2 3 4 5 6
7 8 9 0 1 2 3 4 5
6 7 8 9 0 1 2 3 4
5 6 7 8 9 0 1 2 3
4 5 6 7 8 9 0 1 2
3 4 5 6 7 8 9 0 1
2 3 4 5 6 7 8 9 0

Output:
0 0 0
9 0 0
8 0 0
7 0 0
6 0 0
5 0 0
4 0 0
3 0 0
2 0 0

Test Case 18:

Input:
9 4
0 1 2 3 4 5 6 7 8
9 0 1 2 3 4 5 6 7
8 9 0 1 2 3 4 5 6
7 8 9 0 1 2 3 4 5
6 7 8 9 0 1 2 3 4
5 6 7 8 9 0 1 2 3
4 5 6 7 8 9 0 1 2
3 4 5 6 7 8 9 0 1
2 3 4 5 6 7 8 9 0

Output:
0 0 0 0
9 0 0 0
8 0 0 0
7 0 0 0
6 0 0 0
5 0 0 0
4 0 0 0
3 0 0 0
2 0 0 0

Test Case 19:

Input:
10 2
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9

Output:
0 1 2
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
0 1 2

Test Case 20:

Input:
10 3
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9

Output:
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0

Test Case 21:

Input:
10 4
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9

Output:
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0

'''