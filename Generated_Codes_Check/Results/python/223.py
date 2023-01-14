'''



'''

import sys

class ColorTheCake:
    def __init__(self, numb_colors, color_string):
        self.numb_colors = numb_colors
        self.color_string = color_string
        self.size_string = len(color_string)
        self.numb_questions = color_string.count('?')

    def isValid(self, string):
        if self.size_string == 1:
            return True
        self.size_string = len(string)
        for i in range(self.size_string):
            if (i == self.size_string - 1):
                if (string[i] == string[0]):
                    return False
            else:
                if (string[i] == string[i + 1]):
                    return False
        return True

    def find_smaller_valid(self):
        if (self.size_string == 1 and (int(self.color_string[0]) < self.numb_colors)):
            return self.color_string
        if self.isValid(self.color_string):
            return self.color_string
        if self.numb_questions == 0:
            return 'NO'

        current_min = sys.maxsize
        current_min_string = None

        for i in range(self.size_string):
            if self.color_string[i] == '?':
                #print('?')
                for color_index in range(self.numb_colors):
                    #print('c')
                    temp = self.color_string[:i] + str(color_index) + self.color_string[i + 1:]
                    temp_int = int(temp)
                    if (temp_int < current_min):
                        if self.isValid(temp):
                            #print(temp)
                            current_min = temp_int
                            current_min_string = temp
        if current_min_string is None:
            return 'NO'
        return current_min_string

if __name__ == "__main__":
    #numb_colors = int(input())
    #color_string = input()
    #numb_colors = 4
    #color_string = '?????2'
    #numb_colors = 3
    #color_string = '012'
    #numb_colors = 1
    #color_string = '?'
    #numb_colors = 3
    #color_string = '0?1'
    #numb_colors = 2
    #color_string = '??'
    #numb_colors = 10
    #color_string = '79259?087'
    #numb_colors = 2
    #color_string = '?0'
    #numb_colors = 1
    #color_string = '?'
    numb_colors = 3
    color_string = '??'
    color_the_cake = ColorTheCake(numb_colors, color_string)
    print(color_the_cake.find_smaller_valid())