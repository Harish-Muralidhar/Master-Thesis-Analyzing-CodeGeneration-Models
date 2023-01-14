'''
'''

t_cases=int(input())
for i in range(t_cases):
    hardness, carbon, tensile=input().split()
    hardness, carbon, tensile=int(hardness), float(carbon), int(tensile)
    if hardness>50 and carbon<0.7 and tensile>5600:
        print(10)
    elif hardness>50 and carbon<0.7:
        print(9)
    elif carbon<0.7 and tensile>5600:
        print(8)
    elif hardness>50 and tensile>5600:
        print(7)
    elif hardness>50 or carbon<0.7 or tensile>5600:
        print(6)
    else:
        print(5)