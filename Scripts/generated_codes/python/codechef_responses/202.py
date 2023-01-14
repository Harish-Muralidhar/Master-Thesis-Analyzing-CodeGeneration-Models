'''

'''

for _ in range(int(input())):
	k = int(input())
	n = '31415926535897932384626433833'
	print(n[:k+1]) if k else print(n[0])