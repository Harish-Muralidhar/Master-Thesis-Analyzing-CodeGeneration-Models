'''

Explanation
The sample input corresponds to the example given in the problem
statement.

'''

#This approach is O(n^2)
def brute_force(a,K,P):
    n = len(a)
    min_seg_sum = 0
    for i in range(n):
        #segment sum
        seg_sum = 0
        for j in range(i,n):
            seg_sum = (seg_sum + a[j]) % P
            if seg_sum >= K:
                return seg_sum
            if seg_sum < min_seg_sum:
                min_seg_sum = seg_sum
    return min_seg_sum

#This approach is O(n)
def optimized_approach(a,K,P):
    n = len(a)
    seg_sum = 0
    min_seg_sum = 0
    for i in range(n):
        if seg_sum < K:
            seg_sum = (seg_sum + a[i]) % P
        else:
            return seg_sum
        if seg_sum < min_seg_sum:
            min_seg_sum = seg_sum
    return min_seg_sum

if __name__ == '__main__':
    n, K, P = [int(x) for x in input().split(' ')]
    a = []
    for i in range(n):
        a.append(int(input()))
    print(brute_force(a,K,P))
    print(optimized_approach(a,K,P))