'''

Explanation:

M = 2, x = 2, y = 10

The tree will look like this:

[2] <--- node 1 of the original tree
 / \
[1] [2] <--- node 2 of the original tree

Cost: 10*2 + 10*2 = 40

M = 3, x = 2, y = 10

The tree will look like this:

[2] <--- node 1 of the original tree
 / | \
[1] [2] [2]

Cost: 2 + 2 + 2 = 6

'''


#########################################################################################################################
#
#
#
# def add_node_to_tree(node, tree):
#     """
#     :param node: Node(value, ...)
#     :param tree: Tree()
#     :return: root node
#     """
#     root = tree.root
#
#     for i, c in enumerate(tree.children):
#         if c.value >= node.value:
#             c.left = node
#             node.parent = c
#             tree.children.insert(i, node)
#             return root
#
#     tree.children.append(node)
#     node.parent = tree
#
#     return root
#
#
# class Tree:
#     def __init__(self, value=None, left=None, right=None):
#         self.value = value
#         self.left = left
#         self.right = right
#         self.children = []
#
#
# class Node:
#     def __init__(self, value, parent=None, left=None, right=None):
#         self.value = value
#         self.parent = parent
#         self.left = left
#         self.right = right
#
#     def __gt__(self, other):
#         return self.value > other.value
#
#
# class Query:
#     def __init__(self, m, x, y, nodes):
#         self.m = m
#         self.x = x
#         self.y = y
#         self.nodes = nodes
#
#
# def construct_tree(n, nodes, root_node=None, tree=None):
#     if not root_node:
#         tree = Tree()
#         root_node = Node(value=nodes[0])
#         tree.root = root_node
#         tree.children.append(root_node)
#
#     for i, node in enumerate(nodes[1:]):
#         # Add the node to the tree
#         current_node = Node(value=node)
#         tree.root = add_node_to_tree(current_node, tree)
#
#         # Get the total cost
#
#         return tree
#
#
# def get_cost_of_adding_node(node, tree, x, y):
#     cost = 0
#     n = tree.root
#
#     while n.value > node.value:
#         n = n.parent
#
#     while n.value < node.value:
#
#
# def main():
#     n = int(input())
#     node_values = list(map(int, input().split()))
#     tree = None
#     tree = construct_tree(n, node_values, tree)
#
#     for i in range(n - 1):
#         a, b = map(int, input().split())
#
#         # Add the edge to the tree
#
#
# if __name__ == '__main__':
#     main()

#########################################################################################################################
#
#
#
# def add_node_to_tree(node, tree):
#     """
#     :param node: Node(value, ...)
#     :param tree: Tree()
#     :return: root node
#     """
#     root = tree.root
#
#     for i, c in enumerate(tree.children):
#         if c.value >= node.value:
#             c.left = node
#             node.parent = c
#             tree.children.insert(i, node)
#             return root
#
#     tree.children.append(node)
#     node.parent = tree
#
#     return root
#
#
# class Tree:
#     def __init__(self, value=None, left=None, right=None):
#         self.value = value
#         self.left = left
#         self.right = right
#         self.children = []
#
#
# class Node:
#     def __init__(self, value, parent=None, left=None, right=None):
#         self.value = value
#         self.parent = parent
#         self.left = left
#         self.right = right
#
#     def __gt__(self, other):
#         return self.value > other.value
#
#
# class Query:
#     def __init__(self, m, x, y, nodes):
#         self.m = m
#         self.x = x
#         self.y = y
#         self.nodes = nodes
#
#
# def construct_tree(n, nodes, root_node=None, tree=None):
#     if not root_node:
#         tree = Tree()
#         root_node = Node(value=nodes[0])
#         tree.root = root_node
#         tree.children.append(root_node)
#
#     for i, node in enumerate(nodes[1:]):
#         # Add the node to the tree
#         current_node = Node(value=node)
#         tree.root = add_node_to_tree(current_node, tree)
#
#         # Get the total cost
#
#         return tree
#
#
# def get_cost_of_adding_node(node, tree, x, y):
#     cost = 0
#     n = tree.root
#
#     while n.value > node.value:
#         n = n.parent
#
#     while n.value < node.value:
#
#
# def main():
#     n = int(input())
#     node_values = list(map(int, input().split()))
#     tree = None
#     tree = construct_tree(n, node_values, tree)
#
#     for i in range(n - 1):
#         a, b = map(int, input().split())
#
#         # Add the edge to the tree
#
#
# if __name__ == '__main__':
#     main()

#########################################################################################################################

def construct_tree(n, nodes):
    tree = {}

    for i, node in enumerate(nodes):
        tree[i] = node

    return tree


def get_cost_of_adding_node(node, tree, x, y):
    cost = 0
    n = tree.root

    while n.value > node.value:
        n = n.parent

    while n.value < node.value:


def main():
    n = int(input())
    node_values = list(map(int, input().split()))
    tree = None
    tree = construct_tree(n, node_values)

    for i in range(n - 1):
        a, b = map(int, input().split())

        # Add the edge to the tree


if __name__ == '__main__':
    main()