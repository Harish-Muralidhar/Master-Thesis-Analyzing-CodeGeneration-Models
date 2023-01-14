"""
"""

# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import defaultdict
from itertools import combinations

n_cases = int(input())
for _ in range(n_cases):
    n, k, e, m = map(int, input().split())
    scores = []
    for _ in range(n-1):
        scores.append(list(map(int, input().split())))
    sergey_scores = list(map(int, input().split()))
    total_scores = []
    for i in range(n-1):
        total_scores.append(sum(scores[i][:-1]) + sergey_scores[i])
    total_scores.sort()
    n_students_in_university = n-1-k
    required_score = total_scores[n_students_in_university]
    required_score = -1 * required_score
    required_score += 1
    required_score += m
    print(required_score)