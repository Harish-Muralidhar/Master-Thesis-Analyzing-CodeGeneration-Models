"""

"""

t = int(input())
for _ in range(t):
    n = int(input())
    L = list(map(int,input().split()))
    R = list(map(int,input().split()))
    L_R = [(L[i]*R[i],i+1) for i in range(len(L))]
    L_R.sort()
    max_val = L_R[-1][0]
    max_idx = [x[1] for x in L_R if x[0] == max_val]
    max_idx.sort()
    print(max_idx[0])