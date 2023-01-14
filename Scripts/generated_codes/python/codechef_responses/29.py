
*/



t = int(input())
for i in range(t):
    salary = int(input())
    if salary < 1500:
        print(salary + salary * 0.1 + salary * 0.9)
    else:
        print(salary + 500 + salary * 0.9)