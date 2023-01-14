'''


Solution:

'''


def subset_sum(numbers, target, partial=[]):
    s = sum(partial)

    # check if the partial sum is equals to target
    if s == target: 
        print "Yes"
    if s >= target:
        return  # if we reach the number why bother to continue

    for i in range(len(numbers)):
        n = numbers[i]
        remaining = numbers[i+1:]
        subset_sum(remaining, target, partial + [n]) 


def main():
    num_tests = int(raw_input())

    for test in range(num_tests):
        n, m = map(int, raw_input().split())
        numbers = map(int, raw_input().split())
        subset_sum(numbers, m)


if __name__ == "__main__":
    main()