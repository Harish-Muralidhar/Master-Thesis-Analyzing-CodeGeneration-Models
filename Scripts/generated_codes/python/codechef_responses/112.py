

In the third case, the valid combinations are the combinations of the first 43264 boxes.

*/


import math

def get_factors(n):
    factors = []
    for i in range(1, int(math.sqrt(n))+1):
        if n%i == 0:
            factors.append(i)
            factors.append(n//i)
    return factors


def get_combinations(n):
    list_of_factors = []
    fact_count = 0
    for i in range(1, n+1):
        list_of_factors.append(get_factors(i))
        fact_count += len(list_of_factors[-1]) 
    
    return fact_count

if __name__ == '__main__':
    t = int(input())
    
    for _ in range(t):
        n = int(input())
        print(get_combinations(n)%500009)