"""
"""

"""
Author: Kanishk Gupta
Date Created: 25/01/2019
"""

def is_prime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True


def get_primes(n):
    i = 2
    primes = []
    while i < n:
        if is_prime(i):
            primes.append(i)
        i += 1
    return primes


def get_count(n):
    if is_prime(n):
        primes = get_primes(n)
        count = 0
        for prime in primes:
            if prime < n:
                count += 1
            else:
                break
        return count
    else:
        count = 0
        if n % 2 == 0:
            i = 0
        else:
            i = 1
        while i < n:
            count += 1
            i += 2
        return count


def get_count2(n):
    if is_prime(n):
        primes = get_primes(n)
        count = 0
        for prime in primes:
            if prime < n:
                count += 1
            else:
                break
        return count
    else:
        count = 0
        if n % 2 == 0:
            i = 0
        else:
            i = 1
        while i < n:
            count += 1
            i += 2
        return count


T = int(input())
for _ in range(T):
    N = int(input())
    m = []
    for i in range(N):
        m.append(list(map(int, input().split())))

    count = 0
    even = set()
    odd = set()
    for i in range(N):
        for j in range(N):
            if (i, j) in even or (i, j) in odd:
                continue
            else:
                if m[i][j] % 2 == 0:
                    k = j - 1
                    while k >= 0:
                        if m[i][k] % 2 == 0:
                            even.add((i, k))
                            k -= 1
                        else:
                            break
                    even.add((i, j))

                    k = j + 1
                    while k < N:
                        if m[i][k] % 2 == 0:
                            even.add((i, k))
                            k += 1
                        else:
                            break

                    k = i - 1
                    while k >= 0:
                        if m[k][j] % 2 == 0:
                            even.add((k, j))
                            k -= 1
                        else:
                            break

                    k = i + 1
                    while k < N:
                        if m[k][j] % 2 == 0:
                            even.add((k, j))
                            k += 1
                        else:
                            break

                    count += get_count(m[i][j])

                else:
                    k = j - 1
                    while k >= 0:
                        if m[i][k] % 2 != 0:
                            odd.add((i, k))
                            k -= 1
                        else:
                            break
                    odd.add((i, j))

                    k = j + 1
                    while k < N:
                        if m[i][k] % 2 != 0:
                            odd.add((i, k))
                            k += 1
                        else:
                            break

                    k = i - 1
                    while k >= 0:
                        if m[k][j] % 2 != 0:
                            odd.add((k, j))
                            k -= 1
                        else:
                            break

                    k = i + 1
                    while k < N:
                        if m[k][j] % 2 != 0:
                            odd.add((k, j))
                            k += 1
                        else:
                            break

                    count += get_count(m[i][j])

    print(count)