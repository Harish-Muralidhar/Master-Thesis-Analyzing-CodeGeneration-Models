'''


'''
#from collections import defaultdict
#from collections import deque
from math import ceil
def is_magic_path(N,M):
    #N=int(N)
    #M=int(M)
    #if(N==M):
    #    return("Yes")
    #else:
    #    return("No")
    if(ceil(N/2)==ceil(M/2)):
        return("Yes")
    else:
        return("No")

if __name__ == "__main__":
    t=int(input().strip())
    for _ in range(t):
        N,M=input().strip().split(' ')
        N,M=[int(N),int(M)]
        print(is_magic_path(N,M))