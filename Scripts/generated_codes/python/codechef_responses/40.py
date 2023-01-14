'''


Explanation
Example case 1. The first person only gestures "No". In the Indian convention, gesturing "No" uses the left-right movement of the head, and not the up-down movement. Hence this cannot be an Indian.

Example case 2. The second person gestured "Yes" thrice, using the up-down movement of the head. This is an unusual way of gesturing "Yes" for an American / European, but quite common among Indians. Hence this can be an Indian.

Example case 3. The third person gestured "No" four times using left-right movement, and then "Yes" once using the up-down movement. Even though this looks like an Indian, the information provided is not sufficient to make a decision.
'''

T=int(input())
for i in range(T):
    T1=list()
    T1.append(input())
    T1.append(input())
    if "I" in T1[1]:
        print("INDIAN")
    elif "Y" in T1[1]:
        print("NOT INDIAN")
    else:
        print("NOT SURE")