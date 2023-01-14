"""


Solution :

"""

# Python3 Program to find 
# the Minimum Number of 
# Operation to make 
# GCD of given number 
# divisible by K. 

import math 

# Function to find the 
# minimum number of operations 
def minOperation(arr, N, K): 

	# Find the GCD of 
	# all the array elements. 
	gcd = arr[0] 
	for i in range(1, N): 
		gcd = math.gcd(gcd, arr[i]) 

	# If GCD is divisible by K 
	if (gcd % K == 0): 
		return 0

	# If GCD is not divisible by k. 
	else: 

		# Initialize the result 
		# with maximum value. 
		res = 100000000

		# Find the divisors of GCD 
		for i in range(1, int(math.sqrt(gcd) + 1)): 
			
			# If i divides GCD. 
			if (gcd % i == 0): 

				# If i divides K. 
				if (K % i == 0): 
				
					# Store the minimum of 
					# all the divisors. 
					res = min(res, K // i) 

				# If (GCD / i) divides K. 
				if (K % (gcd // i) == 0): 
				
					# Store the minimum of all 
					# the divisors. 
					res = min(res, K // (gcd // i)) 

		# Return -1 if no divisor is found. 
		return res if res < 100000000 else -1

# Driver Code 
if __name__ == '__main__': 

	# Number of buckets. 
	N = 3
	K = 7
	
	# Array of element in bucket. 
	arr = [10, 16, 18] 

	print(minOperation(arr, N, K)) 
	
# This code is contributed 
# by Mohit kumar 29