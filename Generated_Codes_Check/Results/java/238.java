'''
5, so the multiplier of the entire problem is 1.5 instead of 2.5.

'''

N, K, Q = map(int, input().strip().split())

a, b, c, d, e, f, r, s, t, m, A1 = map(int, input().strip().split())

# for x = 2 to N:
# 	if(t^x mod s  <= r)        // Here t^x signifies "t to the power of x"
# 		A[x] = (a*A[x-1]^2 + b*A[x-1] + c) mod m
# 	else
# 		A[x] = (d*A[x-1]^2 + e*A[x-1] + f) mod m

A = [A1]
for i in range(2, N+1):
    if pow(t, i, s) <= r:
        A.append((a*(A[i-2]**2) + b*A[i-2] + c)%m)
    else:
        A.append((d*(A[i-2]**2) + e*A[i-2] + f)%m)

# Method of generation of range of ingredients for Q dishes  You are given non-negative integer parameters L1, La, Lc, Lm, D1, Da, Dc, Dm

# for i = 1 to Q:
# 	L1 = (La * L1 + Lc) mod Lm;
# 	D1 = (Da * D1 + Dc) mod Dm; 
# 	L = L1 + 1;
# 	R = min(L + K - 1 + D1, N);


L1, La, Lc, Lm, D1, Da, Dc, Dm = map(int, input().strip().split())

sum_min = 0
prod_min = 1

for i in range(Q):
    L1 = (La * L1 + Lc) % Lm
    D1 = (Da * D1 + Dc) % Dm 
    L = L1 + 1
    R = min(L + K - 1 + D1, N)
    
    sum_min += min(A[L-1:R])
    prod_min *= min(A[L-1:R])
    prod_min = prod_min % 1000000007


print(sum_min, prod_min)