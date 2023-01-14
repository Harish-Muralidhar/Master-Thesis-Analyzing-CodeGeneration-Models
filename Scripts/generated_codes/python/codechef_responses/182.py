'''
 = 100 or nnn = 1, resulting in Johnny lying 0, 1, or 2 times, respectively.

'''
def reading_lines(input_lines):
    num_lines = int(input_lines[0])
    for line_num in range(1, num_lines + 1):
        num_hints = int(input_lines[line_num])
        hints = []
        for hint_num in range(line_num+1, line_num+1 + num_hints):
            hint = input_lines[hint_num].split()
            hints.append((hint[0], int(hint[1]), hint[2]))
        read_hints(hints)
        line_num += num_hints

def read_hints(hints):
    min_value = 0
    max_value = 10**9
    lies = 0
    for hint in hints:
        if hint[0] == '<':
            if hint[2] == 'Yes':
                max_value = min(hint[1] - 1, max_value)
            else:
                lies += 1
                min_value = max(hint[1], min_value)
        elif hint[0] == '>':
            if hint[2] == 'Yes':
                min_value = max(hint[1] + 1, min_value)
            else:
                lies += 1
                max_value = min(hint[1], max_value)
        else:
            if hint[2] == 'Yes':
                min_value = max(hint[1], min_value)
                max_value = min(hint[1], max_value)
            else:
                lies += 1
    print(lies)

if __name__ == '__main__':
    input_file = 'input.txt'
    input_lines = [line.rstrip('\n') for line in open(input_file)]
    reading_lines(input_lines)