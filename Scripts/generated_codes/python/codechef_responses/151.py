"""
"""
from collections import defaultdict
from math import log
from math import exp

class Node:
    def __init__(self, data):
        self.data = data
        self.children = [None for i in range(26)]
        self.end = False
        self.index = None

def get_index(c):
    return ord(c) - ord('a')

def get_char(index):
    return chr(index + ord('a'))

def insert(node, word, index):
    if word[index] == '$':
        node.end = True
        node.index = index
        return

    pos = get_index(word[index])
    
    if node.children[pos] is None:
        node.children[pos] = Node(word[index])
    insert(node.children[pos], word, index + 1)

class Trie:
    def __init__(self, words):
        self.root = Node(None)
        self.words = []

        for word in words:
            self.words.append(word)
            insert(self.root, word + '$', 0)

def get_probability(root, word, index, claps):
    if word[index] == '$' and claps == 0:
        return 1.0
    if claps == 0:
        return 0.0
    if root.children[get_index(word[index])] is None:
        return 0.0

    prob = 0.0
    for i in range(26):
        prob += (root.children[get_index(word[index])].data[i] *
                get_probability(root.children[get_index(word[index])], word, index + 1, claps - 1))

    return prob

t = int(input())

for _ in range(t):
    n, k = [int(x) for x in input().split()]

    root = Node(None)
    root.data = [float(x) for x in input().split()]

    for _ in range(25):
        node = Node(None)
        node.data = [float(x) for x in input().split()]

        pos = get_index(node.data[0])
        root.children[pos] = node

    words = [input() for _ in range(n)]

    trie = Trie(words)

    print(get_probability(root, 'abc$', 0, k))