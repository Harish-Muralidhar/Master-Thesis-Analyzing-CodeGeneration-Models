"""
)
"""

input = int(input())

for i in range(input):
    number = int(input())
    count = 0

    while(number > 0):
        digit = number % 10
        if digit == 4:
            count += 1
        number = number // 10
    print(count)

# DONE