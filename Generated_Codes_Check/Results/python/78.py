"""
	"""

"""
Method 1:

# Solution to the first query
count_0 = 0
for i in range(len(b)):
    if b[i] in a:
        count_0 += 1

# Solution to the second query
count_1 = 0
for i in range(len(A)):
    if A[i] in b:
        continue
    if A[i] not in a:
        count_1 += 1

print(count_0, count_1)

"""

"""
Method 2:
"""

T = int(input())
for i in range(T):
    N, M, K = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    b = [int(x) for x in input().split()]

    A = set(list(range(1,N+1)))-set(a)
    B = set(b)

    count_0 = len(A.intersection(B))
    count_1 = len(A-B)

    print(count_0, count_1)