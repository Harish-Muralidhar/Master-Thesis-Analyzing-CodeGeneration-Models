"""


Solution:

"""

#solution 1
import Queue
def countSubarrays(arr, n): 
	# Initialize result 
	res = 0
	# Create an empty queue of pairs 
	q = Queue.Queue() 
	# Enqueue first element in the queue 
	q.put(arr[0]) 
	for i in range(1, n): 
		# Note that queue is always sorted 
		# in increasing order of value by 
		# making dequeue operation costly 
		while (not q.empty() and q.queue[0] > arr[i]): 
			q.get() 
		# Calculate current result while 
		# dequeue operation on queue 
		res += q.qsize() 
		# Enqueue current element 
		q.put(arr[i]) 
	# Result will be sum of all results for 
	# every dequeue operation in above loop 
	return (res + n)*n//2

#solution 2
def countSubarrays(arr, n): 
	res = n # Initialize result 
	q = Queue.Queue() # Create an empty queue of pairs 
	q.put(arr[0]) # Enqueue first element in the queue 
	for i in range(1, n): 
		# Note that queue is always sorted 
		# in increasing order of value by 
		# making dequeue operation costly 
		while (not q.empty() and q.queue[0] > arr[i]): 
			q.get() 
		# Calculate current result while 
		# dequeue operation on queue 
		res += q.qsize() 
		# Enqueue current element 
		q.put(arr[i]) 
	# Result will be sum of all results for 
	# every dequeue operation in above loop 
	return res 

#solution 3
def countSubarrays(arr, n): 
	res = n # Initialize result 
	q = [] # Create an empty queue of pairs 
	q.append(arr[0]) # Enqueue first element in the queue 
	for i in range(1, n): 
		# Note that queue is always sorted 
		# in increasing order of value by 
		# making dequeue operation costly 
		while (q and q[0] > arr[i]): 
			q.pop(0) 
		# Calculate current result while 
		# dequeue operation on queue 
		res += len(q) 
		# Enqueue current element 
		q.append(arr[i]) 
	# Result will be sum of all results for 
	# every dequeue operation in above loop 
	return res 

#solution 4
def countSubarrays(arr, n): 
	res = n # Initialize result 
	q = [arr[0]] # Create an empty queue of pairs 
	for i in range(1, n): 
		# Note that queue is always sorted 
		# in increasing order of value by 
		# making dequeue operation costly 
		while (q and q[0] > arr[i]): 
			q[:] = q[1:] 
		# Calculate current result while 
		# dequeue operation on queue 
		res += len(q) 
		# Enqueue current element 
		q.append(arr[i]) 
	# Result will be sum of all results for 
	# every dequeue operation in above loop 
	return res 

#solution 5
def countSubarrays(arr, n): 
	res = n # Initialize result 
	q = [arr[0]] # Create an empty queue of pairs 
	for i in range(1, n): 
		# Note that queue is always sorted 
		# in increasing order of value by 
		# making dequeue operation costly 
		while (q and q[0] > arr[i]): 
			q[:] = q[1:] 
		# Calculate current result while 
		# dequeue operation on queue 
		res += len(q) 
		# Enqueue current element 
		q.append(arr[i]) 
	# Result will be sum of all results for 
	# every dequeue operation in above loop 
	return res 

#solution 6
def countSubarrays(arr, n): 
	res = n # Initialize result 
	q = [arr[0]] # Create an empty queue of pairs 
	for i in range(1, n): 
		# Note that queue is always sorted 
		# in increasing order of value by 
		# making dequeue operation costly 
		while (q and q[0] > arr[i]): 
			q.pop(0) 
		# Calculate current result while 
		# dequeue operation on queue 
		res += len(q) 
		# Enqueue current element 
		q.append(arr[i]) 
	# Result will be sum of all results for 
	# every dequeue operation in above loop 
	return res 

#solution 7
def countSubarrays(arr, n): 
	res = n # Initialize result 
	q = [arr[0]] # Create an empty queue of pairs 
	for i in range(1, n): 
		# Note that queue is always sorted 
		# in increasing order of value by 
		# making dequeue operation costly 
		while (q and q[0] > arr[i]): 
			q.pop(0) 
		# Calculate current result while 
		# dequeue operation on queue 
		res += len(q) 
		# Enqueue current element 
		q.append(arr[i]) 
	# Result will be sum of all results for 
	# every dequeue operation in above loop 
	return res 

#solution 8
def countSubarrays(arr, n): 
	res = n # Initialize result 
	q = [arr[0]] # Create an empty queue of pairs 
	for i in range(1, n): 
		# Note that queue is always sorted 
		# in increasing order of value by 
		# making dequeue operation costly 
		while (q and q[0] > arr[i]): 
			q.pop(0) 
		# Calculate current result while 
		# dequeue operation on queue 
		res += len(q) 
		# Enqueue current element 
		q.append(arr[i]) 
	# Result will be sum of all results for 
	# every dequeue operation in above loop 
	return res 

#solution 9
def countSubarrays(arr, n): 
	res = n # Initialize result 
	q = [arr[0]] # Create an empty queue of pairs 
	for i in range(1, n): 
		# Note that queue is always sorted 
		# in increasing order of value by 
		# making dequeue operation costly 
		while (q and q[0] > arr[i]): 
			q.pop(0) 
		# Calculate current result while 
		# dequeue operation on queue 
		res += len(q) 
		# Enqueue current element 
		q.append(arr[i]) 
	# Result will be sum of all results for 
	# every dequeue operation in above loop 
	return res