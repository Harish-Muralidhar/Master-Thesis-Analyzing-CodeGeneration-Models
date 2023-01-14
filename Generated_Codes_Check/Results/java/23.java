"""

** For More Input/Output Examples Use 'Expected Output' option **
"""

import math

def currency_notes(amount):
    """
    Function to calculate the no of currency notes needed to dispense the amount given. 
    Args:
        amount (int): The amount for which the currency notes need to be calculated. 
    Return:
        total (int): The total number of minimum notes needed for the given amount. 
        
    """
    # Dictionary to store the denomination of currency notes. 
    currency_dict = {1:1, 2:1, 5:1, 10:1, 50:1, 100:1}
    # Creating a list of the keys of the dictionary. 
    currency = list(currency_dict.keys())
    # Sorting the list in Descending order.
    currency.sort(reverse=True)
    total = 0
    # Iterating over the sorted list. 
    for i in currency:
        # Calculating the no of currency notes of each denomination. 
        count = math.floor(amount/i)
        # Updating the amount after the calculation. 
        amount = amount - i*count
        total = total + count
        # If the amount is zero, no need to iterate further. 
        if amount == 0:
            break
    return total

if __name__ == '__main__':
    testcase = int(input('Enter the no of testcases::'))
    for i in range(testcase):
        amount = int(input('Enter the amount for which you need the currency notes::'))
        print('\n')
        print(currency_notes(amount))
        print('\n')