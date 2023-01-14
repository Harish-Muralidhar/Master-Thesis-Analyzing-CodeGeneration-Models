'''


'''


import sys

def main():
    
    test_count = sys.stdin.readline()
    test_count = int(test_count)
    for i in range(test_count):
        pile_count = sys.stdin.readline()
        pile_count = int(pile_count)
        pile = sys.stdin.readline()
        pile = pile.split()
        pile = list(map(int, pile))
        avg = sum(pile)/pile_count
        count = 0
        for i in range(pile_count):
            if pile[i] > avg:
                count += pile[i] - avg
        print(int(count))
    


if __name__ == "__main__":
    main()