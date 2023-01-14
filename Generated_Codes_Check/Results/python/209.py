"""

Hint:

In the first example we can partition the set X = {0,1,2,3,4} into sets A1 = {0,1,2} and A2 = {3,4}. Note that A1∩A2 = ∅ but A1∩S1 = {0,1,2}. Similarly, A2∩S2 = {3,4}.

In the second example we can partition the set X = {0,1,2,3} into sets A1 = {0}, A2 = {1}, A3 = {2} and A4 = {3}.

Output for the given input:
3
4

"""

#SOLUTION:

def intersection(lst1, lst2): 
    return list(set(lst1) & set(lst2)) 

def subsets(arr):
    """
    :param: arr - input integer array
    Return - list of lists (two dimensional array) where each list represents a subset
    """
    return return_subsets(arr, 0)

def return_subsets(arr, index):
    if index >= len(arr):
        return [[]]

    small_output = return_subsets(arr, index + 1)

    output = list()
    
    for element in small_output:
        output.append(element)
    
    for element in small_output:
        current = list()
        current.append(arr[index])
        current.extend(element)
        output.append(current)
    return output

def min_partitions(lst1,lst2):
    output = []
    for i in lst2:
        output.append(intersection(lst1,i))
    return output

def print_subsets(arr,index,value_so_far):
    if index>=len(arr):
        print(value_so_far)
        return
    
    print_subsets(arr,index+1,value_so_far)
    value_so_far.append(arr[index])
    print_subsets(arr,index+1,value_so_far)
    value_so_far.pop()

def print_subsets2(arr,index,value_so_far):
    if index>=len(arr):
        if len(value_so_far)==3:
            print(value_so_far)
        return
    
    print_subsets2(arr,index+1,value_so_far)
    value_so_far.append(arr[index])
    print_subsets2(arr,index+1,value_so_far)
    value_so_far.pop()

def equal_subset_partition(arr):
    n = len(arr)
    s = sum(arr)
    
    if s%2!=0:
        return False
    
    dp = [[False for i in range(int(s/2)+1)]for j in range(n+1)]
    
    for i in range(n+1):
        dp[i][0] = True
    
    for i in range(1,int(s/2)+1):
        dp[0][i] = False
    
    for i in range(1,n+1):
        for j in range(1,int(s/2)+1):
            if arr[i-1]<=j:
                dp[i][j] = dp[i-1][j] or dp[i-1][j-arr[i-1]]
            else:
                dp[i][j] = dp[i-1][j]
    
    return dp[n][int(s/2)]

def equal_subset_partition2(arr):
    n = len(arr)
    s = sum(arr)
    
    if s%2!=0:
        return False
    
    dp = [False for i in range(int(s/2)+1)]
    
    dp[0] = True
    
    for i in arr:
        for j in range(int(s/2),0,-1):
            if j>=i:
                dp[j] = dp[j] or dp[j-i]
    return dp[int(s/2)]

def equal_subset_partition3(arr):
    n = len(arr)
    s = sum(arr)
    
    if s%2!=0:
        return False
    
    dp = [False for i in range(int(s/2)+1)]
    
    dp[0] = True
    
    for i in range(1,n+1):
        for j in range(int(s/2),0,-1):
            if j>=arr[i-1]:
                dp[j] = dp[j] or dp[j-arr[i-1]]
    return dp[int(s/2)]

def equal_subset_partition4(arr):
    n = len(arr)
    s = sum(arr)
    
    if s%2!=0:
        return False
    
    return subset_sum(arr,n,int(s/2))

def subset_sum(arr,n,s):
    if s==0:
        return True
    if n==0 and s!=0:
        return False
    
    if arr[n-1]>s:
        return subset_sum(arr,n-1,s)
    
    return subset_sum(arr,n-1,s) or subset_sum(arr,n-1,s-arr[n-1])