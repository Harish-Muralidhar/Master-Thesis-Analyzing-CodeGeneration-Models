"""

Example 3


Input:
7 5
....$
.....
.....
D...@
.....
.....
@....

Output:
1

"""


"""
i,j --> location of chef
x,y --> location of spoon
n,m --> size of matrix

"""

import math

def minDistanceOfSpoonFromSpagettiMonsters(matrix, i, j, x, y, n, m):
  # matrix :- input matrix
  # i,j :- cordinate of chef
  # x,y :- cordinate of spoon
  # n,m :- size of matrix

  # create matrixx to store distance of each point from chef
  distance_matrix = [[math.inf for _ in range(m)] for _ in range(n)]
  # this queue will contain tuples of cordinates of points whose neighbours still need to be visited
  points_to_visit = [(i,j)]

  # distance of chef from itself is 0
  distance_matrix[i][j] = 0

  # continue till we have points to visit
  while points_to_visit:
    # pop the point from queue
    row, col = points_to_visit.pop(0)

    # the minimum distance of the point from the chef is in distance_matrix
    dist_from_chef = distance_matrix[row][col]

    # now we will check all the neighbours of the point 
    # and update their distance if needed

    # top
    if row-1 >= 0:
      if distance_matrix[row-1][col] == math.inf:
        distance_matrix[row-1][col] = dist_from_chef + 1
        points_to_visit.append((row-1,col))

    # right
    if col+1 < m:
      if distance_matrix[row][col+1] == math.inf:
        distance_matrix[row][col+1] = dist_from_chef + 1
        points_to_visit.append((row,col+1))

    # bottom
    if row+1 < n:
      if distance_matrix[row+1][col] == math.inf:
        distance_matrix[row+1][col] = dist_from_chef + 1
        points_to_visit.append((row+1,col))

    # left
    if col-1 >= 0:
      if distance_matrix[row][col-1] == math.inf:
        distance_matrix[row][col-1] = dist_from_chef + 1
        points_to_visit.append((row,col-1))

    # top left
    if row-1 >= 0 and col-1 >= 0:
      if distance_matrix[row-1][col-1] == math.inf:
        distance_matrix[row-1][col-1] = dist_from_chef + 1
        points_to_visit.append((row-1,col-1))

    # top right
    if row-1 >= 0 and col+1 < m:
      if distance_matrix[row-1][col+1] == math.inf:
        distance_matrix[row-1][col+1] = dist_from_chef + 1
        points_to_visit.append((row-1,col+1))

    # bottom right
    if row+1 < n and col+1 < m:
      if distance_matrix[row+1][col+1] == math.inf:
        distance_matrix[row+1][col+1] = dist_from_chef + 1
        points_to_visit.append((row+1,col+1))

    # bottom left
    if row+1 < n and col-1 >= 0:
      if distance_matrix[row+1][col-1] == math.inf:
        distance_matrix[row+1][col-1] = dist_from_chef + 1
        points_to_visit.append((row+1,col-1))

  # at this point distance_matrix contains the minimum distance of the point from the chef
  # we will find the minimum distance of the spoon from the spagetti monsters

  # first we find the distance of the spoon from the chef
  dist_of_spoon_from_chef = distance_matrix[x][y]

  # now we find the minimum distance of the spagetti monsters from the chef
  min_dist = math.inf
  for i in range(n):
    for j in range(m):
      if matrix[i][j] == 'D':
        min_dist = min(min_dist, distance_matrix[i][j])

  # print(distance_matrix)
  # the final answer will be the sum of the above found two distance
  return dist_of_spoon_from_chef + min_dist


if __name__ == "__main__":
  n,m = map(int, input().split())
  matrix = [list(input()) for _ in range(n)]
  for i in range(n):
    for j in range(m):
      if matrix[i][j] == '@':
        x = i
        y = j
        break
  result = minDistanceOfSpoonFromSpagettiMonsters(matrix, x, y, x, y, n, m)
  print(result)