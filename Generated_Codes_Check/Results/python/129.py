'''

'''

def max_length_contiguous_subsequence(top, bottom):
	
	# base case
	if top == bottom:
		return len(top)
	
	i, j = 0, 0
	max_len = 0
	
	while i < len(top) and j < len(bottom):
		if top[i] == bottom[j]:
			curr_len = 1
			while i+1 < len(top) and j+1 < len(bottom) and top[i+1] == bottom[j+1]:
				curr_len += 1
				i += 1
				j += 1
			max_len = max(max_len, curr_len)
			i += 1
			j += 1
		elif top[i] < bottom[j]:
			i += 1
		else:
			j += 1
		
	return max_len


if __name__ == "__main__":
	
	t = int(input())
	
	for i in range(t):
		N = int(input())
		top = list(map(int, input().split()))
		bottom = list(map(int, input().split()))
		
		print(max_length_contiguous_subsequence(top, bottom))