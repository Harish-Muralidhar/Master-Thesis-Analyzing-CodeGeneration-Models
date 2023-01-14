'''

'''

def sumOfFirstLast(n) :
    last_digit = n % 10
    first_digit = n
    while n >= 10 :
        n = n//10
    first_digit = n
    return first_digit + last_digit
    
t = int(input())
for i in range(t) :
    n = int(input())
    print(sumOfFirstLast(n))