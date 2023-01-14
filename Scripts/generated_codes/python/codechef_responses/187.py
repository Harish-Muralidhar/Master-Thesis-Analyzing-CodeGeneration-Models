"""

"""

# cook your dish here
def chefParty(n,m,arr):
    for i in range(m):
        x=int(input())
        sumB1=0
        sumB2=0
        for j in range(1,x):
            val=arr[x-1]-arr[j-1]
            if val>0:
                sumB1=sumB1+val
            else:
                sumB2=sumB2+val
        print(sumB1-sumB2)
            
n,m=map(int,input().split())
arr=list(map(int,input().split()))
chefParty(n,m,arr)