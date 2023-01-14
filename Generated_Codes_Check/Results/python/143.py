"""
"""
import math
test=int(input())
for i in range(test):
    n=int(input())
    li=[]
    for j in range(n):
        x,y=[int(k) for k in input().split()]
        li.append([x,y])
    d={}
    for j in range(101):
        for k in range(101):
            x=j-50
            y=k-50
            dis=0
            for l in li:
                dis+=abs(l[0]-x)+abs(l[1]-y)
            if dis in d:
                d[dis]+=1
            else:
                d[dis]=1
    ans=0
    for i in d:
        if d[i]==1:
            ans+=1
    print(ans)
"""

def main():
	T = int(input())
	for _ in range(T):
		N = int(input())
		restaurants = []
		for i in range(N):
			restaurants.append(list(map(int, input().rstrip().split())))
		
		#print(restaurants)
		
		restaurants = sorted(restaurants)
		#print(restaurants)
		
		restaurants = list(set(restaurants))
		#print(restaurants)
		
		count = 0
		
		for i in range(-100, 101):
			for j in range(-100, 101):
				total_dist = 0
				
				for r in restaurants:
					total_dist += abs(r[0] - i) + abs(r[1] - j)
				
				if total_dist % 2 == 0:
					#print(i, j, total_dist)
					count += 1
		
		print(count)
	

main()"""