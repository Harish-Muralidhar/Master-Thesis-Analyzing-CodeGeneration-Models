'''
'''
import sys

def isPalindromicNumber(num):
	num_str = str(num)
	num_len = len(num_str)
	for i in range(0, int(num_len/2)):
		if num_str[i] != num_str[num_len - i -1]:
			return False
	return True

def main():
	T = int(sys.stdin.readline())
	for i in range(0, T):
		line = sys.stdin.readline()
		L, R = line.split()
		L = int(L)
		R = int(R)
		sum = 0
		for j in range(L, R+1):
			if isPalindromicNumber(j):
				sum += j
		print(sum)
		

if __name__ == "__main__":
	main()