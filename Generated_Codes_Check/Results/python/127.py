'''

'''

num_testcases = int(input())
for _ in range(num_testcases):
    r, c = map(int, input().split())
    a = [[0]*c for _ in range(r)]
    for i in range(r):
        a[i] = list(map(int, input().split()))
    #print(a)
    #print(max(a))
    #max_elem = max(max(a))
    #print(max_elem)
    #print(max([row.count(max_elem) for row in a]))
    #count = max([row.count(max_elem) for row in a])
    #print(count)
    #if count == c:
    #    print(max_elem*r)
    #else:
    #    print(max_elem*(r-1) + max([row[-1] for row in a]))
    print(max(sum(a[0]), sum(a[-1])))