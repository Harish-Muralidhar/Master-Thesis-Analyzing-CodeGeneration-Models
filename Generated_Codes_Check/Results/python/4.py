'''

'''

def main():
    t = int(input())
    while t:
        t-=1
        n = int(input())
        a = list(map(int, input().split(' ')))
        sum_of_elements = 0
        product_of_elements = 1
        for i in range(n):
            sum_of_elements += a[i]
            product_of_elements *= a[i]
        count = 0
        for i in range(n):
            if sum_of_elements == product_of_elements:
                count += 1
            if i<n-1:
                sum_of_elements -= a[i]
                product_of_elements /= a[i]
        print(count)

if __name__ == "__main__":
    main()