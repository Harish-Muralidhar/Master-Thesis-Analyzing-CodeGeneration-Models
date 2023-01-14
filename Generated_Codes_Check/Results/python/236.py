"""

Solution:

"""

import numpy as np

def main():
	t=int(input())
	while(t>0):
		t-=1
		c=int(input())
		grid=[]
		while(c>0):
			c-=1
			grid.append(list(map(int,input().split())))
		#print(grid)
		result="MasterChef"
		for i in range(0,len(grid)):
			if grid[i][0]%2==0:
				result="Football"
				break	
		print(result)
		

if __name__=="__main__":
	main()


"""
Alternate Solution:

# cook your dish here
t=int(input())
for i in range(t):
    n=int(input())
    for j in range(n):
        x,y=map(int,input().split())
        if x%2==0:
            print("Football")
            break
    else:
        print("MasterChef")
"""