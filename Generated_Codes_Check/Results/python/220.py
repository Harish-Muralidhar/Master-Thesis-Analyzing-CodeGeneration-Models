'''


'''
def main():
    pass
    T = int(input())
    for i in range(T):
        N = int(input())
        if N in range(1,10**9):
            a = 0
            b = 1
            for i in range(1,N+1):
                c = a+b
                a = b
                b = c
            print(c)
        else:
            print("N is out of range")

if __name__ == '__main__':
    main()