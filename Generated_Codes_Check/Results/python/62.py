"""

"""

# Write your code here
import sys
import math

class Node:
    def __init__(self, node_id, x, y):
        self.node_id = node_id
        self.x = x
        self.y = y
        
    def __repr__(self):
        return "{}(x={},y={})".format(self.node_id, self.x,self.y)

def get_distance(node_a, node_b):
    return min(abs(node_a.x-node_b.x), node_a.y-node_b.y)

def get_xor(node_list):
    result = 0
    for node in node_list:
        if node.node_id == 0:
            continue
        result ^= node.node_id
    return result

def get_index(index, node_list):
    for i in range(len(node_list)):
        if node_list[i].node_id == index:
            return i

def set_node(node_list, index, node):
    node_list[index] = node
    return node_list

def get_new_route(route, start, end):
    if start > end:
        start, end = end, start
    new_route = route[:start] + route[start:end+1][::-1] + route[end+1:]
    return new_route

def get_shortest_route(route, distance_matrix):
    shortest_route = route
    shortest_distance = get_distance_from_route(route, distance_matrix)
    for i in range(len(route)-1):
        for j in range(i+1, len(route)):
            new_route = get_new_route(shortest_route, i, j)
            new_distance = get_distance_from_route(new_route, distance_matrix)
            if new_distance < shortest_distance:
                shortest_distance = new_distance
                shortest_route = new_route
    return shortest_route

def get_distance_from_route(node_list, distance_matrix):
    distance = 0
    for i in range(len(node_list)-1):
        distance += distance_matrix[node_list[i].node_id][node_list[i+1].node_id]
    return distance

def get_distance_matrix(node_list):
    node_len = len(node_list)
    distance_matrix = [[0 for _ in range(node_len)] for _ in range(node_len)]
    for i in range(node_len):
        for j in range(i+1, node_len):
            distance_matrix[i][j] = get_distance(node_list[i], node_list[j])
            distance_matrix[j][i] = distance_matrix[i][j]
    return distance_matrix

def get_route(node_list, distance_matrix, start_index=None):
    if start_index == None:
        start_index = 0
    if start_index >= len(node_list):
        return []
    start_node = node_list[start_index]
    route = [start_node]
    for i in range(start_index+1, len(node_list)):
        min_index = -1
        min_dist = sys.maxint
        for j in range(i, len(node_list)):
            distance = distance_matrix[start_node.node_id][node_list[j].node_id]
            if distance < min_dist:
                min_index = j
                min_dist = distance
        route.append(node_list[min_index])
        start_node = node_list[min_index]
        node_list = set_node(node_list, min_index, node_list[i])
        node_list = set_node(node_list, i, start_node)
    #route = get_shortest_route(route, distance_matrix)
    return route

def get_input_data():
    node_list = []
    for i in range(n):
        x, y = map(int, raw_input().split(" "))
        node_list.append(Node(i, x, y))
    distance_matrix = get_distance_matrix(node_list)
    return node_list, distance_matrix

t = int(raw_input())
for _ in range(t):
    n = int(raw_input())
    node_list, distance_matrix = get_input_data()
    route = get_route(node_list, distance_matrix)
    xor_result = get_xor(route)
    print xor_result