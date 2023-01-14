'''


'''

import sys
import math

def build(arr,i,gate,a,b):
	if gate=="AND":
		arr[i] = arr[a]*arr[b]
	else:
		arr[i] = arr[a]+arr[b]

def find(arr,i,p,gate,a,b):
	if gate == "OR":
		return (1-pow((1-p),arr[i]))
	else:
		return math.pow(p,arr[i])
	

try:
	num_cases = int(input())
	for i in range(0,num_cases):
		input()
		n = int(input())
		if n ==1:
			print("0.50000")
		else:
			arr = [0]*(n+1)
			arr[1] = 1
			flag = 0
			for j in range (2,n+1):
				temp = input().split()
				if len(temp) == 1:
					arr[j] = 1
					flag = 1
				else:
					build(arr,j,temp[0],int(temp[1]),int(temp[2]))
			if flag ==0:
				print("0.00000")
			else:
				p = 0
				x = 0.00000
				flag2 = 0
				while x<0.500005 and p<1.00000:
					p = p+0.00001
					x = find(arr,n,p,temp[0],int(temp[1]),int(temp[2]))
				print("{0:.5f}".format(p-0.00001))
		if i< (num_cases-1):
			print()

except:
	pass