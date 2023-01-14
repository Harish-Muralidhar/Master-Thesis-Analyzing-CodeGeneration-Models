"""
"""

# Write your code here
for _ in range(int(input())):
    n = int(input())
    correct_ans = list(input())
    chef_ans = list(input())
    winnings = list(map(int,input().split()))
    winnings += [0]
    count = 0
    for i in range(n):
        if(chef_ans[i]==correct_ans[i]):
            count += 1
    print(winnings[count])