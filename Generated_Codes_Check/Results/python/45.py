'''

Explanation
In the first testcase there are 3 occurrences of 'a', 2 occurrences of 'b' and 1 occurrence of 'c'. So 3 is equal to 1+2.
'''

def is_valid(string):
    count_dict = {}
    for i in string:
        if i in count_dict:
            count_dict[i] += 1
        else:
            count_dict[i] = 1
    
    for key, value in count_dict.items():
        if value == sum(count_dict.values()) - value:
            return "YES"
    return "NO"

if __name__ == "__main__":
    t = int(input())
    
    for i in range(t):
        string = input()
        print(is_valid(string))