'''


SOLUTION:
'''

from collections import Counter

test_cases=int(input())

for i in range(test_cases):
    total_players=int(input())
    players_messages=list(map(int,input().split()))
    players_messages_counter=Counter(players_messages)
    mishearing_players=0
    for i in players_messages_counter:
        if players_messages_counter[i]>1:
            mishearing_players+=players_messages_counter[i]-1
    print(mishearing_players)