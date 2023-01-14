'''
'''

#Solution:

import math
import time
from collections import Counter

class Solution:
    def __init__(self):
        self.people_needed = []
        self.tribal_list = []

    def tribal_clans(self, xi, yi, x, left_people):
        for index, val in enumerate(self.tribal_list):
            if(val[0]<xi):
                if(val[1]<=left_people):
                    left_people += val[2]
                    self.tribal_list.pop(index)
            else:
                break
        return left_people

    def min_people(self, x):
        self.people_needed = sorted(self.people_needed)
        self.tribal_list = sorted(self.tribal_list, key=lambda x: x[0])
        #print(self.people_needed, self.tribal_list)
        total_people = self.people_needed[0][1]
        left_people = self.people_needed[0][1]
        for index in range(1,len(self.people_needed)):
            left_people = self.tribal_clans(self.people_needed[index][0], self.people_needed[index][1], x, left_people)
            if(left_people < self.people_needed[index][1]):
                total_people = total_people + (self.people_needed[index][1] - left_people)
                left_people = self.people_needed[index][1]
            else:
                left_people = left_people - self.people_needed[index][1]

        left_people = self.tribal_clans(x, 0, x, left_people)
        if(left_people<0):
            total_people = total_people - left_people
        return total_people

    def main(self):
        test_case = int(input())
        while(test_case>0):
            x = int(input())
            b = int(input())
            temp = list(map(int, input().strip().split()))
            for i in range(0,2*b,2):
                self.people_needed.append([temp[i], temp[i+1]])
            c = int(input())
            temp = list(map(int, input().strip().split()))
            for i in range(0,3*c,3):
                self.tribal_list.append([temp[i], temp[i+1], temp[i+2]])
            print(self.min_people(x))
            self.people_needed = []
            self.tribal_list = []
            test_case -= 1

if __name__ == '__main__':
    sol = Solution()
    sol.main()