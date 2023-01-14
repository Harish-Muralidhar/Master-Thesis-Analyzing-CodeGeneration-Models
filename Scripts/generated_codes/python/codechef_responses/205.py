"""

Example case 2. Game will have 2 turns. Let's consider all possible turns in some order:

Chef choose 2, Sasha choose 1. Since 2^1<1^2 girl will not kiss boy.
Chef choose 2, Sasha choose 4. Since 2^4<4^2 girl will not kiss boy.
Chef choose 3, Sasha choose 1. Since 3^1<1^3 girl will not kiss boy.
Chef choose 3, Sasha choose 4. Since 3^4>4^3 girl will kiss boy.
Hence answer is 1/4 * 1 + 3/4 * 1 = 1.5. 

Example case 3. Game will have 2 turns. Let's consider all possible turns in some order:

Chef choose 2, Sasha choose 2. Since 2^2=2^2 nobody will kiss anybody.
Chef choose 4, Sasha choose 2. Since 4^2=2^4 nobody will kiss anybody.
Hence answer is 0.

"""


""" Please note that it is Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above. """

# Your task is to complete this function
# Function should return expected number of kisses
def expectedKisses(n, a, b):
    # Code here
    return 0.0