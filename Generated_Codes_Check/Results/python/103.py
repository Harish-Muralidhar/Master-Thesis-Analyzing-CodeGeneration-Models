"""

Test Case Generation
For the purpose of this problem, all the test cases are generated randomly by the following algorithm.

N is chosen to be a random number between 2 and 10,000, inclusive.
Choose a random integer A between 0 and 100,000, inclusive.
For i = 1 to N, choose Fi to be a random number such that A ≤ Fi ≤ 100,000 and F1 < F2 < ... < FN.
Note that A is the first element of the arithmetic progression and is chosen randomly.

Problem Setter: Chef Maddy

Test Case Generation
For the purpose of this problem, all the test cases are generated randomly by the following algorithm.

N is chosen to be a random number between 2 and 10,000, inclusive.
Choose a random integer A between 0 and 100,000, inclusive.
For i = 1 to N, choose Fi to be a random number such that A ≤ Fi ≤ 100,000 and F1 < F2 < ... < FN.
Note that A is the first element of the arithmetic progression and is chosen randomly.

Problem Setter: Chef Maddy
"""



T = int(input())

for _ in range(T):
    N = int(input())
    L = [int(x) for x in input().split()]
    arith_prog = []
    geom_prog = []
    for i in range(N-1):
        j = i+1
        while j<N:
            if (L[j]-L[i])%(j-i)==0:
                arith_prog.append((L[i],L[j]))
                geom_prog.append((L[i],L[j]))
            j += 1
    res_arith = []
    res_geom = []
    for i in arith_prog:
        for j in geom_prog:
            if i[0]!=j[0] or i[1]!=j[1]:
                if i[0]==j[0]:
                    res_arith.append(i[1])
                    res_geom.append(j[1])
                else:
                    res_arith.append(i[0])
                    res_geom.append(j[0])
                res_arith.append(i[0])
                res_geom.append(i[1])
                break
        else:
            continue
        break
    res_arith.sort()
    res_geom.sort()
    print(*res_arith)
    print(*res_geom)