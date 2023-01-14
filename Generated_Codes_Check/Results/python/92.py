"""

Explanation
In the first query (0 2 5), the minimum integer in the range [2, 5] is 2. In the second query (1 1 5 6), the elements of the array become A = [1, 5, 6, 6, 4]. In the third query (0 2 2), the minimum integer in the range [2, 2] is 6. In the fourth query (1 2 5 3), the elements of the array become A = [1, 5, 2, 2, 2]. In the fifth query (0 1 3), the minimum integer in the range [1, 3] is 2.

"""

def createSegTree(arr,tree,start,end,index):
#     print(arr,tree,start,end,index)
    if start == end:
        tree[index] = arr[start]
        return
    mid = (start+end)//2
    createSegTree(arr,tree,start,mid,2*index)
    createSegTree(arr,tree,mid+1,end,2*index+1)
    tree[index] = min(tree[2*index],tree[2*index+1])
#     print( tree[index])
    
def query(tree,start,end,index,l,r):
#     print(tree,start,end,index,l,r)
    if r<start or l>end or start>end:
        return 999999999999999
    if start>=l and end<=r:
        return tree[index]
    mid = (start+end)//2
    return min(query(tree,start,mid,2*index,l,r),query(tree,mid+1,end,2*index+1,l,r))
    
def updateTree(arr,tree,start,end,index,l,r,x):
    if start>end or l>end or r<start:
        return
    if start == end:
        tree[index] = arr[start]
        return
    mid = (start+end)//2
    updateTree(arr,tree,start,mid,2*index,l,r,x)
    updateTree(arr,tree,mid+1,end,2*index+1,l,r,x)
    tree[index] = min(tree[2*index],tree[2*index+1])
    
def update(arr,tree,start,end,index,pos,value):
    if start == end:
        arr[pos] = value
        tree[index] = value
        return
    mid = (start+end)//2
    if pos>mid:
        update(arr,tree,mid+1,end,2*index+1,pos,value)
    else:
        update(arr,tree,start,mid,2*index,pos,value)
    tree[index] = min(tree[2*index],tree[2*index+1])
    
 

def main():
    n,q = map(int,input().strip().split())
    arr = list(map(int,input().strip().split()))
    tree = [0]*(4*n)
    createSegTree(arr,tree,0,n-1,1)
    for i in range(q):
        querytype = list(map(int,input().strip().split()))
#         print(querytype)
        if querytype[0] == 0:
            ans = query(tree,0,n-1,1,querytype[1],querytype[2])
            print(ans)
        elif querytype[0] == 1:
            updateTree(arr,tree,0,n-1,1,querytype[1],querytype[2],querytype[3])
        else:
            update(arr,tree,0,n-1,1,querytype[1],querytype[2])
main()