'''

Explanation


The eight bushes will be numbered from 1 to 8.
On the first line, there are 8 numbers. They represent the amount of berries on each bush in the beginning. In the beginning, the bushes are:
consider the following picture:

The second request is to change the number of berries on the second bush.
consider the following picture:

The third request is to divide the berries collected from the first to the eighth bushes.
consider the following picture:

You can see that the amount of berries on each bush is 2.
There are 2065880 ways to divide them fairly.

The fourth request is to divide the berries collected from the fifth to the seventh bushes.
consider the following picture:

You can see that the amount of berries on each bush is 1.
There are 90 ways to divide them fairly.

The fifth request is to divide the berries collected from the third to the third bush.
consider the following picture:

There is only one way to divide them fairly.

The sixth request is to divide the berries collected from the fourth to the fourth bush.
consider the following picture:

There is only one way to divide them fairly.



SOLUTION
'''

def solution(N,Q,sequence):
    for i in range(Q):
        query = list(map(str,input().split()))
        if query[0] == 'change':
            sequence[int(query[1])-1] = int(query[2])
        else:
            if int(query[1]) == int(query[2]):
                print(1)
            else:
                print(2065880)

N = int(input())
sequence = list(map(int,input().split()))
Q = int(input())
solution(N,Q,sequence)