"""
Explanation
Example case 1. Chef wants to buy 4 ingredients. The prices are 1, 2, 3, 4. There are 3 special offers:

Buy the 1st and 2nd ingredient for 3 dollars.
Buy the 3rd and 4th ingredient for 7 dollars.
Buy the 1st, 2nd and 3rd ingredient for 9 dollars.

The cheapest way to buy all the ingredients is 3+2+1=6.

Sample Input
2
4
1 2 3 4
3
2 1 2
2 3 4
3 1 2 3
8
4 5 1 2 3 1 2 3
4
4 1 2 3 4
4 2 3 4 5 6 7 8
4 3 4 5 6 7 8
4 1 2 3 6 7 8
Sample Output
6
18
Explanation
Example case 1. The prices are 1, 2, 3, 4. There are 3 special offers:

Buy the 1st and 2nd ingredient for 3 dollars.
Buy the 3rd and 4th ingredient for 7 dollars.
Buy the 1st, 2nd and 3rd ingredient for 9 dollars.

The cheapest way to buy all the ingredients is 3+2+1=6.

Example case 2. The prices are 4, 5, 1, 2, 3, 1, 2, 3. There are 4 special offers:

Buy the 1st, 2nd, 3rd and 4th ingredient for 10 dollars.
Buy the 2nd, 3rd, 4th, 5th and 6th ingredient for 15 dollars.
Buy the 3rd, 4th, 5th, 6th and 7th ingredient for 17 dollars.
Buy the 1st, 2nd, 3rd, 6th, 7th and 8th ingredient for 19 dollars.

The cheapest way to buy all the ingredients is 5+1+2+3+1+2+3=18.

"""

import sys
import itertools
class Ingredients:
    def __init__(self,total,price,offers):
        self.offer = [[] for i in range(offers)]
        self.total = total
        self.price = price
        self.offers = offers
    def readInput(self):
        for i in range(self.offers):
            self.offer[i] = list(map(int,input().split(" ")))
    def printPrice(self):
        print("Price")
        print(self.price)
        print("Offers")
        print(self.offer)
    def printOutput(self):
        min_price = sys.maxsize
        for i in range(1,self.total+1):
            for j in list(itertools.combinations(range(self.total),i)):
                temp_total = 0
                for k in range(self.offers):
                    count = 0
                    for l in j:
                        if l+1 in self.offer[k]:
                            count += 1
                    if count == 0:
                        temp_total += sum([self.price[l] for l in j])
                    if count == self.offer[k][0]:
                        temp_total += self.offer[k][self.offer[k][0]+1]
                min_price = min(min_price,temp_total)
        print(min_price)

def main():
    n = int(input())
    while n > 0:
        total = int(input())
        price = list(map(int,input().split(" ")))
        offers = int(input())
        if total <= 15 and offers <= 2**total:
            obj = Ingredients(total,price,offers)
            obj.readInput()
            obj.printOutput()
            #obj.printPrice()
        n = n-1

if __name__ == '__main__':
    main()