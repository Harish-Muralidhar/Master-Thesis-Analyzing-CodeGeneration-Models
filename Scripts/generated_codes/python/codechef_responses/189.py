
Test case 2: It is not possible to transform the given triangle as it will no longer be equilateral.


import math

T = int(input())
for i in range(T):
	N = int(input())
	if(N%2 == 0):
		print("YES")
	else:
		print("NO")
		
  ----------------------------------------------------------------------------------------------------------------------------------	
  ----------------------------------------------------------------------------------------------------------------------------------	
  ----------------------------------------------------------------------------------------------------------------------------------	
  
  #Question 3:-
  # Link :-https://www.codechef.com/LRNDSA01/problems/ZCO12001
  
  Chef recently came across a game called ‘Cubes’. The rules of this game are very simple. The game starts with N piles of cubes. Each pile contains some non-zero number of cubes (it is guaranteed that all piles are non-empty). 
  On each turn, the player can remove any cube from any one of the N piles. Chef has decided to play this game by himself. However, he has a strange winning condition — if the number of cubes in each pile is divisible by 2, he is declared the winner!
  Chef would like to know if he can win the game at the very beginning of it, i.e. before making any moves. Please help him find out!
  
  Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers A1, A2, ..., AN denoting the number of cubes in the initial piles.
Output
For each test case, print a single line containing the string "YES" if Chef can win the game or "NO" if he cannot.

Constraints
1 ≤ T ≤ 100
1 ≤ N ≤ 1000
1 ≤ Ai ≤ 109 for each valid i
the sum of N over all test cases does not exceed 1000
Example
Input:
2
2
1 2
2
2 2

Output:
NO
YES

Explanation
Example case 1: Chef cannot win the game. It does not matter which pile he chooses to remove a cube from, the number of cubes in some pile will stay odd.

Example case 2: Chef can win the game. He can remove a cube from the first pile on the first move. The number of cubes in each pile will then be even.


for _ in range(int(input())):
	N = int(input())
	arr = list(map(int,input().split()))
	for i in arr:
		if(i%2 != 0):
			print("NO")
			break
	else:
		print("YES")
		
  ----------------------------------------------------------------------------------------------------------------------------------	
  ----------------------------------------------------------------------------------------------------------------------------------	
  ----------------------------------------------------------------------------------------------------------------------------------	
  
  #Question 4:-
  
  # Link :- https://www.codechef.com/LRNDSA01/problems/CONFLIP
  
  You are given a sequence of N flips of coins. In each flip, you get heads with probability Pi. 
  You would like to know the number of flips that give heads. 
  You are given Q queries of the form (I, J, K), where I is the leftmost flip, J is the rightmost flip and K is the number of tails in the sequence of flips. 
  For each query (I, J, K), output the probability that the number of flips that give heads is exactly K.

Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated real numbers P1, P2, ..., PN.
The third line contains a single integer Q.
Q lines follow. Each of these lines contains three space-separated integers I, J, K.
Output

For each test case, print a single line containing Q space-separated real numbers. For each valid i, the i-th of these numbers should be the answer to the i-th query.
Your answer will be considered correct if its absolute or relative error does not exceed 10^-6.

Constraints

1 ≤ T ≤ 100
1 ≤ N ≤ 105
0 ≤ Pi ≤ 1 for each valid i
1 ≤ Q ≤ 105
1 ≤ I ≤ J ≤ N
0 ≤ K ≤ min(J-I+1, N-J+I)
the sum of N over all test cases does not exceed 106
the sum of Q over all test cases does not exceed 106
Example

Input:
1
5
0.5 0.7 0.9 0.6 0.4
4
4 1 1
4 2 1
4 2 2
4 3 0

Output:
0.5 0.3 0.1 0.0


from math import factorial
from itertools import combinations
from fractions import Fraction

for _ in range(int(input())):
	N = int(input())
	arr = list(map(float,input().split()))
	Q = int(input())
	res = []
	for i in range(Q):
		I,J,K = list(map(int,input().split()))
		if(I == J):
			if(K == 1):
				res.append("%.6f"%(1-arr[I-1]))
			else:
				res.append("%.6f"%(arr[I-1]))
		else:
			s = 0
			for i in combinations(arr[I-1:J],K):
				prob = 1
				for j in i:
					prob *= (1-j)
				for j in arr[I-1:J]:
					if j not in i:
						prob *= j
				s += prob
			res.append("%.6f"%(s))
	print(*res)
	
	
----------------------------------------------------------------------------------------------------------------------------------	
  ----------------------------------------------------------------------------------------------------------------------------------	
  ----------------------------------------------------------------------------------------------------------------------------------	
  
  #Question 4:-
  
  # Link :- https://www.codechef.com/LRNDSA01/problems/ZCO14003
  
  Chef is playing a game on a sequence of N integers A1,A2,…,AN. In a single move, he may remove any one of these integers from the sequence. For each i (1≤i≤N), let's denote Ai as the i-th smallest integer in the current sequence (after the removal, if any).

Chef is interested in the sum i×Ai. Please help him maximize this sum!

Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers A1,A2,…,AN.
Output

For each test case, print a single line containing one integer ― the maximum possible sum.

Constraints

1≤T≤100
1≤N≤105
1≤Ai≤109 for each valid i
Subtasks

Subtask #1 (100 points): original constraints

Example Input
2
2
2 3
3
1 2 3
Example Output
7
9
Explanation

Example case 1: Removing the 2 or the 3 doesn't change the sum. The sequence with the 2 removed is [3] and the sequence with the 3 removed is [2], so for both cases, the sum is 2×3=6.

Example case 2: One optimal solution is to remove the 3. The new sequence is [1,2] and so the sum is 1×1+2×2=5. However, we can do better. If we remove the 1 instead, the new sequence is [2,3] and the sum is 2×2+3×3=9. Hence, the answer is 9.

for _ in range(int(input())):
	N = int(input())
	arr = list(map(int,input().split()))
	arr.sort()
	s = 0
	for i in range(N):
		s += (i+1)*arr[i]
	print(s)