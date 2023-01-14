'''
'''

import os,sys
from io import BytesIO, IOBase


if __name__ == "__main__":
    try:
        from math import floor,ceil
        from bisect import bisect_left, bisect_right

        def main():
            t=int(input())
            for i in range(t):
                n,m=map(int,input().split())
                if n<m:
                    print('<')
                elif n>m:
                    print('>')
                else:
                    print('=')


        main()
    except Exception as e:
        pass
    
    
    

'''
import sys

def main():
  t= int(input())
  while t:
    a,b = sys.stdin.readline().split()
    a = int(a)
    b = int(b)
    if a>b:
      print('>')
    elif a<b:
      print('<')
    else:
      print('=')
    t-=1

main()

'''