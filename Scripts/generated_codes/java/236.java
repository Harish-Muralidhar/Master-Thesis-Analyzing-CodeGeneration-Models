'''

Input:
1
2
3 3
3 3
Output:
Football
Explanation: 
The Chef makes the first move on the first board and moves the coin from (1,1)->(2,2). Now his brother takes his turn and moves the coin to either (3,3) or (2,3). 
Either way, he has won the game.
'''
import math

def get_winner(boards, turn):
    if turn == 0 and len(boards) == 1:
        return 'MasterChef'
    elif turn == 1 and len(boards) == 1:
        return 'Football'
    elif len(boards) == 1:
        return boards[0][0][0]
    else:
        for board in boards:
            if board[1][1] == True:
                x = board[0][0]
                y = board[0][1]
                new_board = ([x-1, y-1], [board[1][0], board[1][1]])
                boards.remove(board)
                boards.append(new_board)
                get_winner(boards, turn)
            elif board[1][1] == False:
                x = board[0][0]
                y = board[0][1]
                new_board = ([x-1, y-1], [board[1][0], board[1][1]])
                boards.remove(board)
                boards.append(new_board)
                get_winner(boards, turn)

#Main Code:
number_of_test_cases = int(input())
for i in range(number_of_test_cases):
    number_of_boards = int(input())
    boards = []
    for j in range(number_of_boards):
        dimensions_of_board = [int(dim) for dim in input().split()]
        x = dimensions_of_board[0]
        y = dimensions_of_board[1]
        board = ([x,y], [True, True])
        boards.append(board)
    print(get_winner(boards, 0))