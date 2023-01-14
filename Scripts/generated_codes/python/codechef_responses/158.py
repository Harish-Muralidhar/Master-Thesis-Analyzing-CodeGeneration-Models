'''

Solution:

import itertools
T=int(input())
for i in range(T):
    N=int(input())
    L1=list(map(int,input().split()))
    K=int(input())
    for j in range(K):
        L2=list(map(int,input().split()))
        if L2[1]==1:
            print(L1[L2[0]-1][L2[2]-1])
        else:
            L3=[]
            for x in itertools.count(0):
                if L2[0]+(L2[1])*x>N:
                    break
                L3.extend(L1[L2[0]+(L2[1])*x-1])
            if len(L3)>=L2[2]:
                print(L3[L2[2]-1])
            else:
                print("So sad")

'''