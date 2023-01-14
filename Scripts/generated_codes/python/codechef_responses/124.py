"""

"""

#Answer

import sys
from math import *
class Node:
    def __init__(self, data=None):
        self.data = data
        self.next_node = None
class LinkedList:
    def __init__(self):
        self.head = None

    def insert(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        temp = self.head
        while temp.next_node:
            temp = temp.next_node
        temp.next_node = new_node

    def print_linked_list(self):
        temp = self.head
        while temp is not None:
            print(temp.data,end=" ")
            temp = temp.next_node
        print()

    def remove(self, data):
        temp = self.head
        if temp is not None:
            if temp.data == data:
                self.head = temp.next_node
                temp = None
                return
        while temp is not None:
            if temp.data == data:
                break
            prev = temp
            temp = temp.next_node
        if temp == None:
            return
        prev.next_node = temp.next_node
        temp = None
t=int(input())
for _ in range(t):
    a,b=map(int,input().split())
    l=LinkedList()
    l.insert(a)
    l.insert(b)
    l.insert(b-1)
    l.insert(a-1)
    l.insert(a-2)
    l.insert(b-2)
    l.insert(b+1)
    l.insert(a+1)
    l.insert(a+2)
    l.insert(b+2)
    l.print_linked_list()
    l.remove(a)
    l.remove(b)
    l.remove(b-1)
    l.remove(a-1)
    l.remove(a-2)
    l.remove(b-2)
    l.remove(b+1)
    l.remove(a+1)
    l.remove(a+2)
    l.remove(b+2)
    l.print_linked_list()