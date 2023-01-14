'''

'''

import sys
import math

def gcd(a, b):
	if a == 0:
		return b
	return gcd(b%a, a)

def lcm(a, b):
	return (a*b)//(gcd(a,b))

def find_lcm(arr, n):
	for i in range(1, n):
		arr[i] = lcm(arr[i-1], arr[i])
	return arr

def find_ans(arr, n):
	ans = 1
	for i in range(n):
		ans = (ans * arr[i])%1000000007
	return ans

def main(n, arr):
	arr = find_lcm(arr, n)
	ans = find_ans(arr, n)
	print(ans)

if __name__ == '__main__':
	l = []
	for line in sys.stdin:
		l.append(line.strip())
	
	for i in range(1, len(l)):
		n = int(l[i])
		arr = [int(i) for i in l[i+1].split()]
		main(n, arr)