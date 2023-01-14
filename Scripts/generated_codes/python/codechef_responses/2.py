'''


'''

n = int(input("Enter the number of soldiers: "))
a = []
for i in range(n):
    a.append(int(input("Enter the number of weapons: ")))

even = 0
odd = 0

for i in range(n):
    if a[i] % 2 == 0:
        even += 1
    else:
        odd += 1

if even > odd:
    print("READY FOR BATTLE")
else:
    print("NOT READY")