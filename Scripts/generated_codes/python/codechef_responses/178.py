"""

Explanation

In the first test case the only possible coloring is to color both links with the same color.


In the second test case the coloring should be pretty uniform, so every color must be used at least once in every 2 consecutive links. But there are only 2 links, so each color must be used in every single link. There are only two ways to do this.


In the third test case the coloring should be pretty uniform, so every color must be used at least once in every 3 consecutive links. There are 4 ways to color the first 3 links, 4 ways to color the last 3 links and 4 ways to color the first link and the last link. Hence the answer is 4 * 4 * 4 * (1 + 1 + 1 + 1) = 132.

"""

#Python 3 solution 

import sys 
import time 

#for getline() 
import io 

#for sys.stdin.readline()
import os 

#for mmap
import mmap

#for mmap.readline()
import re 

#for mmap.readline()
import mmap 

#import ctypes 
#from ctypes import *
#import ctypes.util

"""
def libcFunc(libcName):
	return getattr(ctypes.CDLL(ctypes.util.find_library('c')),libcName)

fgets = libcFunc('fgets')
fopen = libcFunc('fopen')
"""

def main():

	##### 
	#Method 1: use getline()
	#####

	#sys.stdin = io.StringIO("3\n2 1\n4 2\n6 3")
	
	#T = int(sys.stdin.readline().strip())
	
	#while T:
	#	N, M = sys.stdin.readline().strip().split(" ")
	#	N, M = int(N),int(M)
	#	print(N,M)
	#	T -= 1 
	
	
	##### 
	#Method 2: use os.read() 
	##### 
	
	#sys.stdin = os.fdopen(sys.stdin.fileno(), 'rb')
	#sys.stdin = open("input.txt", "rb")
	
	#T = int(os.read(sys.stdin.fileno(),2).strip())
	#print(T)
	#while T:
	#	N, M = os.read(sys.stdin.fileno(),20).strip().split(" ")
	#	N, M = int(N),int(M)
	#	print(N,M)
	#	T -= 1 

	##### 
	#Method 3: use mmap.readline() 
	##### 
	
	#sys.stdin = os.fdopen(sys.stdin.fileno(), 'rb')
	#sys.stdin = open("input.txt", "rb")
	
	fd = sys.stdin.fileno()
	mm = mmap.mmap(fd, 0, access=mmap.ACCESS_READ)

	T = int(mm.readline().strip())
	#print(T)
	while T:
		N, M = mm.readline().strip().split(b" ")
		N, M = int(N),int(M)
		print(N,M)
		T -= 1 

	#print(ctypes.string_at(mm, 1)) #string at pointer mm, length of 1 
	#print(ctypes.string_at(mm, 2))
	#print(ctypes.string_at(mm, 3))
	#print(ctypes.string_at(mm, 4))
	#print(ctypes.string_at(mm, 5))
	#print(ctypes.string_at(mm, 6))

	#print(mm[:1])
	#print(mm[:2])
	#print(mm[:3])
	#print(mm[:4])
	#print(mm[:5])
	#print(mm[:6])

	#print(mm[:0])
	#print(mm[:1])
	#print(mm[:2])
	#print(mm[:3])
	#print(mm[:4])
	#print(mm[:5])
	#print(mm[:6])
	
	#print(mm.readline())
	#print(mm.readline())
	#print(mm.readline())
	#print(mm.readline())
	#print(mm.readline())
	#print(mm.readline())
	#print(mm.readline())

	#print(mm.readline(1))
	#print(mm.readline(2))
	#print(mm.readline(3))
	#print(mm.readline(4))
	#print(mm.readline(5))
	#print(mm.readline(6))
	
	#print(mm.readline(0))
	#print(mm.readline(1))
	#print(mm.readline(2))
	#print(mm.readline(3))
	#print(mm.readline(4))
	#print(mm.readline(5))
	#print(mm.readline(6))

	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	#print(mm.readline(2))
	
	#print(T)
	#while T:
	#	N, M = mm.readline().strip().split(b" ")
	#	N, M = int(N),int(M)
	#	print(N,M)
	#	T -= 1 

	#for line in iter(mm.readline, ''):
	#	print(line)


if __name__ == '__main__':
	main()