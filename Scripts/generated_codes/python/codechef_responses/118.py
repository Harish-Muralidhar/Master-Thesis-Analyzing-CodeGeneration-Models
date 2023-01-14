'''


'''

#from collections import defaultdict
#d = defaultdict(list)

#import math
#import copy
#from collections import deque,Counter
#from itertools import combinations,permutations
#from collections import Counter

import sys
import heapq, math
import itertools
from itertools import permutations, combinations, accumulate,product
from operator import itemgetter
from collections import deque,Counter
from bisect import bisect_left,bisect

def readStrings():
    return sys.stdin.readline().strip()

def readInt():
    return int(sys.stdin.readline().strip())

def readInts():
    return [int(x) for x in sys.stdin.readline().strip().split()]

def readInts_1():
    return [int(x) - 1 for x in sys.stdin.readline().strip().split()]
def readStrs():
    return [x for x in sys.stdin.readline().strip().split()]
    
def readInt_1():
    return int(sys.stdin.readline().strip())-1
def rdln(fin):
    return fin.readline().strip()
def rdline(fin):
    return [x for x in fin.readline().strip().split()]
def rdlines(fin,n):
    return [rdln(fin) for _ in range(n)]
def rdstrs(fin):
    return [x for x in fin.readline().strip()]
def rdmap(fin,mapping=None):
    # Read in a map from rdline()
    if mapping is None:
        mapping = {}
    for line in fin:
        # line = line.strip()
        if not line:
            continue
        key,val = line.split('=',1)
        # print key,val
        # key = key.strip()
        # val = val.strip()
        mapping[key] = val
    return mapping
def wrln(x):
    sys.stdout.write(str(x) + '\n')
    
def U(n,r):
    return math.factorial(n) // math.factorial(r) // math.factorial(n-r)
def nCr(n,r):
    if n < r:
        return 0
    return math.factorial(n) // math.factorial(r) // math.factorial(n-r)

def make_row(n,p1,p2):
    return [0]*(n+1)

def make_rows(n,p1,p2):
    rows = [make_row(n,p1,p2)]
    for i in range(1,n+1):
        rows.append(make_row(n,p1,p2))
    return rows

def make_col(m,p1,p2):
    return [0]*(m+1)

def make_cols(m,p1,p2):
    cols = [make_col(m,p1,p2)]
    for i in range(1,m+1):
        cols.append(make_col(m,p1,p2))
    return cols

def solve(n,m,sx,sy,p1,p2,q,ts):
    rows = make_rows(n,p1,p2)
    cols = make_cols(m,p1,p2)
    # print rows
    # print cols
    for move in range(1,max(ts)+1):
        for r in range(1,n+1):
            for c in range(1,m+1):
                x = (rows[r][c]+cols[r][c])%6
                if x == 0:
                    rows[r][c+p1] += 1
                    rows[r][c] -= 1
                    cols[r+p2][c] += 1
                    cols[r][c] -= 1
                elif x == 1:
                    rows[r][c+p1] += 1
                    rows[r][c] -= 1
                    cols[r-p2][c] += 1
                    cols[r][c] -= 1
                elif x == 2:
                    rows[r][c+p1] += 1
                    rows[r][c] -= 1
                    cols[r+p2][c+p1] += 1
                    cols[r][c] -= 1
                elif x == 3:
                    rows[r+p2][c] += 1
                    rows[r][c] -= 1
                    cols[r+p2][c+p1] += 1
                    cols[r][c] -= 1
                elif x == 4:
                    rows[r+p2][c] += 1
                    rows[r][c] -= 1
                    cols[r-p2][c+p1] += 1
                    cols[r][c] -= 1
                elif x == 5:
                    rows[r][c+p1] += 1
                    rows[r][c] -= 1
                    cols[r-p2][c+p1] += 1
                    cols[r][c] -= 1

        for r in range(1,n+1):
            for c in range(1,m+1):
                if rows[r][c] % 2 == 1:
                    rows[r][c] = 1
                else:
                    rows[r][c] = 0
                if cols[r][c] % 2 == 1:
                    cols[r][c] = 1
                else:
                    cols[r][c] = 0
        if rows[sx][sy] == 1:
            rows[sx][sy+p1] += 1
            rows[sx][sy] -= 1
        if cols[sx][sy] == 1:
            cols[sx+p2][sy] += 1
            cols[sx][sy] -= 1
        if move in ts:
            # print rows
            # print cols
            tot = 0
            for r in range(1,n+1):
                for c in range(1,m+1):
                    tot += rows[r][c]+cols[r][c]
            tot += 1
            print tot

def solve_old(n,m,sx,sy,p1,p2,q,ts):
    rows = make_rows(n,p1,p2)
    cols = make_cols(m,p1,p2)
    # print rows
    # print cols
    for move in range(1,max(ts)+1):
        for r in range(1,n+1):
            for c in range(1,m+1):
                x = (rows[r][c]+cols[r][c])%6
                if x == 0:
                    rows[r][c+p1] += 1
                    rows[r][c] -= 1
                    cols[r+p2][c] += 1
                    cols[r][c] -= 1
                elif x == 1:
                    rows[r][c+p1] += 1
                    rows[r][c] -= 1
                    cols[r-p2][c] += 1
                    cols[r][c] -= 1
                elif x == 2:
                    rows[r][c+p1] += 1
                    rows[r][c] -= 1
                    cols[r+p2][c+p1] += 1
                    cols[r][c] -= 1
                elif x == 3:
                    rows[r+p2][c] += 1
                    rows[r][c] -= 1
                    cols[r+p2][c+p1] += 1
                    cols[r][c] -= 1
                elif x == 4:
                    rows[r+p2][c] += 1
                    rows[r][c] -= 1
                    cols[r-p2][c+p1] += 1
                    cols[r][c] -= 1
                elif x == 5:
                    rows[r][c+p1] += 1
                    rows[r][c] -= 1
                    cols[r-p2][c+p1] += 1
                    cols[r][c] -= 1

        for r in range(1,n+1):
            for c in range(1,m+1):
                if rows[r][c] % 2 == 1:
                    rows[r][c] = 1
                else:
                    rows[r][c] = 0
                if cols[r][c] % 2 == 1:
                    cols[r][c] = 1
                else:
                    cols[r][c] = 0
        if rows[sx][sy] == 1:
            rows[sx][sy+p1] += 1
            rows[sx][sy] -= 1
        if cols[sx][sy] == 1:
            cols[sx+p2][sy] += 1
            cols[sx][sy] -= 1
        if move in ts:
            # print rows
            # print cols
            tot = 0
            for r in range(1,n+1):
                for c in range(1,m+1):
                    tot += rows[r][c]+cols[r][c]
            tot += 1
            print tot

def main():
    f = open('input.txt')
    fin = f
    # fin = sys.stdin
    n,m,q = map(int,rdline(fin))
    sx,sy = map(int,rdline(fin))
    p1,p2 = map(int,rdline(fin))
    p1,p2 = map(int,rdline(fin))
    p1,p2 = map(int,rdline(fin))
    p1,p2 = map(int,rdline(fin))
    p1,p2 = map(int,rdline(fin))
    p1,p2 = map(int,rdline(fin))
    ts = map(int,rdlines(fin,q))
    solve(n,m,sx,sy,p1,p2,q,ts)
    # solve(n,m,sx,sy,p1,p2,q,ts)
    
    
    
    

if __name__ == '__main__':
    main()