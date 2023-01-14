'''
Thus, the probability that TR kills Ash is 8/20 = 0.4.

'''

def circl(x1,y1,x2,y2,x3,y3):
	x = ((y2-y1)*(y3*y3-y1*y1+x3*x3-x1*x1) - (y3-y1)*(y2*y2-y1*y1+x2*x2-x1*x1))
	y = ((x2-x1)*(x3*x3-x1*x1+y3*y3-y1*y1) - (x3-x1)*(x2*x2-x1*x1+y2*y2-y1*y1))
	centered_x = x / 2*(y2-y1)
	centered_y = y / 2*(x2-x1)
	rad = math.sqrt(math.pow(x1-centered_x,2)+math.pow(y1-centered_y,2))
	return (centered_x,centered_y),rad

def inside(cx,cy,rad,x,y):
	d = math.sqrt(math.pow(cx-x,2)+math.pow(cy-y,2))
	if d <= rad:
		return True
	else:
		return False

def comb(x,y,a,b):
	combinations = list(itertools.combinations(range(a,b),y))
	return combinations

#if __name__ == '__main__':
t = int(input())
for i in range(t):
	n = int(input())
	x = y = list(map(int,input().split()))
	combinations = comb(3,3,0,n-1)
	count = 0
	for i in combinations:
		k1 = circl(x[i[0]],y[i[0]],x[i[1]],y[i[1]],x[i[2]],y[i[2]])
		if len(k1) != 0:
			for j in range(n):
				if j not in i:
					if inside(k1[0][0],k1[0][1],k1[1],x[j],y[j]):
						count += 1
	print(count/len(combinations))