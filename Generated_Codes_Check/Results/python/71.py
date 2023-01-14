


*/
from datetime import datetime
import sys

def getMaxPath(arr):
	rowLen = len(arr)

	# reverse array
	for i in range(len(arr)/2):
		tmp = arr[i]
		arr[i] = arr[len(arr) - i - 1]
		arr[len(arr) - i - 1] = tmp

	#print arr

	for i in range(1,rowLen):
		for j in range(0, rowLen - i):
			arr[rowLen-i-1][j] += max(arr[rowLen-i][j], arr[rowLen-i][j+1])

	print arr[0][0]
	


def main():
	f = open('tri.txt', 'r')
	start = datetime.now()
	n = int(f.readline())
	for i in range(1,n+1):
		rowLen = int(f.readline())
		arr = [[0 for x in range(rowLen)] for y in range(rowLen)]
		for i in range(0, rowLen):
			tmp = [int(x) for x in f.readline().split()]
			for j in range(0,len(tmp)):
				arr[i][j] = tmp[j]
		getMaxPath(arr)
	end = datetime.now()
	print end-start
		

if __name__ == "__main__":
	main()