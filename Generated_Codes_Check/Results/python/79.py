'''
'''


# Write your code here
def find_money(n,correct_ans,your_ans,money):
    c = 0
    for i in range(len(correct_ans)):
        if correct_ans[i] == your_ans[i]:
            c += 1
        else:
            break
    if c == 0:
        return money[0]
    else:
        return money[c]


if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        n = int(input())
        correct_ans = str(input())
        your_ans = str(input())
        money = list(map(int,input().split()))
        print(find_money(n,correct_ans,your_ans,money))