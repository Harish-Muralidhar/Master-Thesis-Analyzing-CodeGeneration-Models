'''


'''

def count_balanced_subsequence(lst):
    
    N=len(lst)
    stack=[]
    balanced_subsequence=[]
    balanced_subsequence.append(1)
    for i in range(N):
        if stack:
            if stack[-1] == lst[i]*-1:
                stack.pop()
                balanced_subsequence.append(1)
            else:
                stack.append(lst[i])
                balanced_subsequence.append(0)
        else:
            stack.append(lst[i])
            balanced_subsequence.append(0)
    return balanced_subsequence

def find_powerset(lst):
    
    length=len(lst)
    pow_set_size = (1 << length)
    pow_set=[]
    for counter in range(0, pow_set_size):
        temp=[]
        for j in range(0, length):
            if(counter & (1 << j)):
                temp.append(lst[j])
        pow_set.append(temp)
    return pow_set

def find_balanced_subsequence_count(pow_set):
    count=0
    for i in pow_set:
        if abs(sum(i))%2==0:
            count+=1
    return count

lst=[-1,-2,9,2,-3,-4,3,4,8,8,1]
print(find_balanced_subsequence_count(find_powerset(count_balanced_subsequence(lst))))