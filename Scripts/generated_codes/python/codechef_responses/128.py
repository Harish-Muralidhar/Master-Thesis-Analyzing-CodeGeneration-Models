"""

A:

Here's an alternative solution - a full game, with a valid move generator, and all.
Note that, as in your solution, the result will be "Asuna" if the number of monsters is even, and "Kirito" if the number of monsters is odd.
<code>#!/usr/bin/env python3

from itertools import chain
from math import sqrt
from sys import stdin, stdout


def is_prime_cross(grid, i, j):
    """Whether or not the given cell is a prime cross."""
    return is_prime_cross_horizontal(grid, i, j) or is_prime_cross_vertical(grid, i, j)


def is_prime_cross_horizontal(grid, i, j):
    """Whether or not the given cell is a prime cross."""
    count = 0
    for x in range(j, -1, -1):
        if grid[i][x] == '#':
            break
        count += 1
    if not is_prime(count):
        return False
    count = 0
    for x in range(j, len(grid[i])):
        if grid[i][x] == '#':
            break
        count += 1
    return is_prime(count)


def is_prime_cross_vertical(grid, i, j):
    """Whether or not the given cell is a prime cross."""
    count = 0
    for y in range(i, -1, -1):
        if grid[y][j] == '#':
            break
        count += 1
    if not is_prime(count):
        return False
    count = 0
    for y in range(i, len(grid)):
        if grid[y][j] == '#':
            break
        count += 1
    return is_prime(count)


def is_prime(n):
    """Whether or not a given integer is prime."""
    if n &lt;= 1:
        return False
    for i in range(2, int(sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True


def get_monsters(grid):
    """Get all positions of monsters."""
    return [(i, j) for i, row in enumerate(grid) for j, char in enumerate(row) if is_prime_cross(grid, i, j)]


def get_possible_moves(grid, monsters):
    """Get all possible moves."""
    return chain.from_iterable(get_possible_moves_for_monster(grid, monsters, m) for m in monsters)


def get_possible_moves_for_monster(grid, monsters, monster):
    """Get all possible moves for a given monster."""
    moves = []
    if (monster[0], 0) in monsters:
        moves.append((monster[0], 0))
    if (monster[0], len(grid[monster[0]]) - 1) in monsters:
        moves.append((monster[0], len(grid[monster[0]]) - 1))
    if (0, monster[1]) in monsters:
        moves.append((0, monster[1]))
    if (len(grid) - 1, monster[1]) in monsters:
        moves.append((len(grid) - 1, monster[1]))
    return moves


def get_opponent(player):
    """Get opponent for a given player."""
    if player == 'Kirito':
        return 'Asuna'
    if player == 'Asuna':
        return 'Kirito'


def play_game(grid, players, monsters):
    """Play the game."""
    player = players[0]
    while True:
        if len(monsters) == 1:
            return player
        move = choose_optimal_move(grid, monsters)
        monsters = {m for m in monsters if m != move}
        player = get_opponent(player)
        print('{} played at {}'.format(player, move))


def choose_optimal_move(grid, monsters):
    """Choose optimal move for a given player."""
    moves = get_possible_moves(grid, monsters)
    print('Possible moves:', moves)
    if len(moves) == 1:
        return moves[0]
    for move in moves:
        if (move[0], 0) in monsters:
            print('Preferred move:', move)
            return move
        if (move[0], len(grid[move[0]]) - 1) in monsters:
            print('Preferred move:', move)
            return move
        if (0, move[1]) in monsters:
            print('Preferred move:', move)
            return move
        if (len(grid) - 1, move[1]) in monsters:
            print('Preferred move:', move)
            return move
    return moves[0]


def main():
    """Main."""
    players = ('Asuna', 'Kirito')
    test_cases = int(stdin.readline().strip())
    for _ in range(test_cases):
        row_count, column_count = tuple(map(int, stdin.readline().strip().split()))
        grid = []
        for _ in range(row_count):
            grid.append(stdin.readline().strip().split())
        monsters = get_monsters(grid)
        stdout.write('{}\n'.format(play_game(grid, players, monsters)))


if __name__ == '__main__':
    main()
</code>
