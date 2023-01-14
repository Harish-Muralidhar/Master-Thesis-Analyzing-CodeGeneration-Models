'''

Explanation
Example case 1. We can see that:

piygu exists in the first phrase of the second language;
ezyfo exists in the third phrase of the second language;
rzotm does not exist in any phrase of the second language.
Example case 2. We can see that:

kssdy does not exist in any phrase of the second language;
tjzhy does not exist in any phrase of the second language;
ljzym does not exist in any phrase of the second language;
kegqz exists in the first, the second and the third phrases of the second language;

'''

t=int(input())
for i in range(t):
    n,k=[int(i) for i in input().split()]
    d=[i for i in input().split()]
    ans=[]
    for j in range(k):
        l,s=[int(i) for i in input().split()]
        s1=[i for i in input().split()]
        for w in d:
            if w in s1:
                ans.append("YES")
                break
        ans.append("NO")
    print(*ans)