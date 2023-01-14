'''

'''

#Solution

T = int(input())

for t in range(T):
    N, M, K = map(int, input().split())
    A = list(map(int, input().split()))

    A.sort()

    if K == 1:
        print(sum(A[:M]))
        continue

    result = -1
    count = 0
    for i in range(M, N):
        count += A[i]
        if (count % K) == 0:
            result = count
            break

    if result == -1:
        for i in range(N - M - 1, -1, -1):
            count += A[i]
            if (count % K) == 0:
                result = count
                break

    print(result)