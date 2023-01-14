'''
Example case 4. Chef cannot use the old notebook, because the old notebook doesn't contain sufficient number of pages.

Testcase 1 :
5 3 2 2
3 4
2 2
Output :
LuckyChef

Testcase 2 :
5 2 1 2
3 4
2 2
Output :
UnluckyChef

Testcase 3 :
3 3 2 2
2 3
3 3
Output :
UnluckyChef

Testcase 4 :
3 2 2 2
3 4
2 2
Output :
UnluckyChef

Testcase 5 :
1 1 1 2
1 2
2 3
Output :
LuckyChef

Testcase 6 :
1 1 1 1
1 3
Output :
UnluckyChef
'''
T=int(input())
for i in range(T):
    X,Y,K,N=list(map(int,input().split()))
    flag=0
    for j in range(N):
        P,C=map(int,input().split())
        if(X<=Y+P and C<=K):
            flag=1
            break
    if(flag==1):
        print("LuckyChef")
    else:
        print("UnluckyChef")