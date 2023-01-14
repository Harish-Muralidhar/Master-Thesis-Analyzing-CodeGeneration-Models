'''

'''

import math
import sys
from fractions import gcd
from collections import Counter, deque, defaultdict
from heapq import heappush, heappop, heappushpop, heapify, heapreplace, merge
from bisect import bisect_left, bisect_right, bisect, insort_left, insort_right, insort
from itertools import product, combinations,permutations
from copy import deepcopy
import random
sys.setrecursionlimit(4100000)


if __name__ == '__main__':
	# sys.stdin = open('input.txt', 'r')
	# sys.stdout = open('output.txt', 'w')
	t = int(input())
	while t>0:
		t-=1
		n,k = map(int, input().split())
		arr = list(map(int, input().split()))
		disc = list(map(int, input().split()))
		s = 0
		for i in range(n):
			for j in range(k):
				s+= arr[i]*(disc[j]/100)/math.pow(n,k)
		print("%.3f" % s)