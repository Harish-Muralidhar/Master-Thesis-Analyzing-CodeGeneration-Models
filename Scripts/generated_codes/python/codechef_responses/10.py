'''

Explanation
Example case 1.
We can get from the first street to the second, from the second to the third and from the third to the fourth. The product of the numbers on these streets equals 23 * 3 * 4 = 8.
'''

def main():
    test_cases = int(input())
    for _ in range(test_cases):
        n, k = map(int, input().split())
        arr = list(map(int, input().split()))
        arr.sort()
        print(arr)


if __name__=="__main__":
    main()