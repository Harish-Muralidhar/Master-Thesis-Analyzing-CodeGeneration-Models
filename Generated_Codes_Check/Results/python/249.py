'''

'''


jacketCost,sockCost,money = map(int,input().split())

if (money-jacketCost)<=0:
    print("Unlucky Chef")
elif (money-jacketCost)%sockCost == 0:
    print("Unlucky Chef")
else:
    print("Lucky Chef")