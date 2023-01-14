'''

	
'''
T=int(input())
for i in range(T):
    S=input()
    count=0
    max_count=0
    for j in S:
        if j=='(':
            count+=1
            max_count=max(max_count,count)
        else:
            count-=1
    print("("*max_count+(max_count*2)*")")