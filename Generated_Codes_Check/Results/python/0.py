'''

Hence, answer for this case is BWBW.
'''

def hamming(str1, str2):
    count=0
    for i in range(len(str1)):
        if str1[i] != str2[i]:
            count+=1
    return count 
    
def get_max_sum_hamming(x, y):
    x_ham = [0]
    y_ham = [0]
    x_y_ham = [0]
    for i in range(1, len(x)+1):
        x_ham.append(x_ham[i-1] + hamming(x[:i], x[:i-1]))
        y_ham.append(y_ham[i-1] + hamming(y[:i], y[:i-1]))
        x_y_ham.append(x_ham[i-1] + y_ham[i-1] + hamming(x[:i], y[:i]))
    return max(x_y_ham[1:])

def get_min_lexico(x, y):
    xy = x + y
    xy_sorted = sorted(xy)
    xy_sorted_odd = xy_sorted[:len(x)]
    xy_sorted_even = xy_sorted[len(x):]
    xy_sorted_even.reverse()
    return ''.join(xy_sorted_odd + xy_sorted_even)

if __name__ == "__main__":
    test_cases = int(input())
    for i in range(test_cases):
        x = input()
        y = input()
        print(get_min_lexico(x, y))