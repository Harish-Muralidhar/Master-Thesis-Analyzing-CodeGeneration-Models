"""

Explanation:
Test Case 1: 23 is a prime number 11*11 is 121 hence 23 is a prime number.
Test Case 2: 13 is a prime number 13*1 is 13 hence 13 is a prime number.
Test Case 3: 20 is not a prime number 20*1 is 20 hence 20 is not a prime number.
Test Case 4: 1000 is not a prime number 1000*1 is 1000 hence 1000 is not a prime number.
Test Case 5: 99991 is a prime number 99991*1 is 99991 hence 99991 is a prime number.

"""

def primeNo(num):
    if num > 1:
        for i in range(2, num//2):
            if (num % i) == 0:
                print("no")
                break
        else:
            print("yes")
    else:
        print("no")

# Driver Program
n = int(input("Enter the number of test cases : "))
for i in range(n):
    num = int(input("Enter the number to check : "))
    primeNo(num)