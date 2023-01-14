"""

"""

from sympy import sieve
import numpy as np
from math import sqrt


def primes(n):
    #  0 and 1 are not primes.
    sieve[0] = False
    sieve[1] = False
    for i in range(2, n + 1):
        if sieve[i]:
            for j in range(i * i, n + 1, i):
                sieve[j] = False
    return sieve

def get_prime_factor(n):
    prime = primes(int(sqrt(n)) + 1)
    factors = []
    for i in range(0, len(prime)):
        if prime[i] == True and n % i == 0:
            factors.append(i)
    return factors


def get_prime_factor_square(n):
    prime = primes(n + 1)
    factors = []
    for i in range(0, len(prime)):
        if prime[i] == True and n % i == 0:
            factors.append(i)
    return factors


def count_divisors(n):
    prime_factor = get_prime_factor(n)
    for i in range(len(prime_factor)):
        count = 0
        while n % prime_factor[i] == 0:
            count += 1
            n = n // prime_factor[i]
        prime_factor[i] = count
    return np.prod(prime_factor)


def count_divisors_square(n):
    prime_factor = get_prime_factor_square(n)
    for i in range(len(prime_factor)):
        count = 0
        while n % prime_factor[i] == 0:
            count += 1
            n = n // prime_factor[i]
        prime_factor[i] = count + 1
    return np.prod(prime_factor)


def count_divisors_square_sum(n):
    prime_factor = get_prime_factor_square(n)
    for i in range(len(prime_factor)):
        count = 0
        while n % prime_factor[i] == 0:
            count += 1
            n = n // prime_factor[i]
        prime_factor[i] = (prime_factor[i] ** (count + 1) - 1) // (prime_factor[i] - 1)
    return np.prod(prime_factor)


def is_prime(n):
    if count_divisors(n) == 2:
        return True
    else:
        return False


def prime_factor_sum(n):
    prime_factor = get_prime_factor(n)
    for i in range(len(prime_factor)):
        count = 0
        while n % prime_factor[i] == 0:
            count += 1
            n = n // prime_factor[i]
        prime_factor[i] = (prime_factor[i] ** (count + 1) - 1) // (prime_factor[i] - 1)
    return np.sum(prime_factor)


def count_primes(n):
    count = 0
    for i in range(n + 1):
        if is_prime(i):
            count += 1
    return count


def sum_of_divisors(n):
    prime_factor = get_prime_factor(n)
    for i in range(len(prime_factor)):
        count = 0
        while n % prime_factor[i] == 0:
            count += 1
            n = n // prime_factor[i]
        prime_factor[i] = (prime_factor[i] ** (count + 1) - 1) // (prime_factor[i] - 1)
    return np.sum(prime_factor) - n


def sum_of_proper_divisors(n):
    return sum_of_divisors(n) - n


def is_perfect_number(n):
    if n == sum_of_divisors(n):
        return True
    else:
        return False


def is_abundant_number(n):
    if n < sum_of_divisors(n):
        return True
    else:
        return False


def is_deficient_number(n):
    if n > sum_of_divisors(n):
        return True
    else:
        return False


def amicable_numbers(n):
    result = []
    for i in range(n + 1):
        if i != sum_of_divisors(i) and sum_of_divisors(i) <= n and i == sum_of_divisors(sum_of_divisors(i)):
            result.append(i)
    return result


def sum_amicable_numbers(n):
    result = 0
    for i in range(n + 1):
        if i != sum_of_divisors(i) and sum_of_divisors(i) <= n and i == sum_of_divisors(sum_of_divisors(i)):
            result += i
    return result


def get_perfect_numbers(n):
    result = []
    for i in range(n + 1):
        if is_perfect_number(i):
            result.append(i)
    return result


def get_abundant_numbers(n):
    result = []
    for i in range(n + 1):
        if is_abundant_number(i):
            result.append(i)
    return result


def get_deficient_numbers(n):
    result = []
    for i in range(n + 1):
        if is_deficient_number(i):
            result.append(i)
    return result


def get_amicable_numbers(n):
    result = []
    for i in range(n + 1):
        if i != sum_of_divisors(i) and sum_of_divisors(i) <= n and i == sum_of_divisors(sum_of_divisors(i)):
            result.append(i)
    return result


def is_even(n):
    if n % 2 == 0:
        return True
    else:
        return False


def is_odd(n):
    if n % 2 == 0:
        return False
    else:
        return True


def least_common_multiple(a, b):
    return a * b // np.gcd(a, b)


def least_common_multiple_multiple_input(*arg):
    lcm = arg[0]
    for i in range(1, len(arg)):
        lcm = least_common_multiple(lcm, arg[i])
    return lcm


def greatest_common_divisor(a, b):
    return np.gcd(a, b)


def greatest_common_divisor_multiple_input(*arg):
    gcd = arg[0]
    for i in range(1, len(arg)):
        gcd = greatest_common_divisor(gcd, arg[i])
    return gcd


def is_pandigital(n):
    pandigital_list = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    n_list = []
    n_list.extend(str(n))
    n_list.sort()
    if pandigital_list == n_list:
        return True
    else:
        return False


def is_pandigital_with_zero(n):
    pandigital_list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    n_list = []
    n_list.extend(str(n))
    n_list.sort()
    if pandigital_list == n_list:
        return True
    else:
        return False


def is_n_pandigital(n, m):
    pandigital_list = []
    for i in range(1, n + 1):
        pandigital_list.append(i)
    m_list = []
    m_list.extend(str(m))
    m_list.sort()
    if pandigital_list == m_list:
        return True
    else:
        return False


def is_n_pandigital_with_zero(n, m):
    pandigital_list = []
    for i in range(0, n + 1):
        pandigital_list.append(i)
    m_list = []
    m_list.extend(str(m))
    m_list.sort()
    if pandigital_list == m_list:
        return True
    else:
        return False


def is_n_pandigital_from_list(n, m_list):
    m_list = m_list.copy()
    pandigital_list = []
    for i in range(1, n + 1):
        pandigital_list.append(i)
    m_list.sort()
    if pandigital_list == m_list:
        return True
    else:
        return False


def is_n_pandigital_with_zero_from_list(n, m_list):
    m_list = m_list.copy()
    pandigital_list = []
    for i in range(0, n + 1):
        pandigital_list.append(i)
    m_list.sort()
    if pandigital_list == m_list:
        return True
    else:
        return False


def is_prime_of_form_n2_plus_1(n):
    if is_prime(n ** 2 + 1):
        return True
    else:
        return False


def is_prime_of_form_n2_minus_1(n):
    if is_prime(n ** 2 - 1):
        return True
    else:
        return False


def is_prime_of_form_6n_plus_1(n):
    if is_prime(6 * n + 1):
        return True
    else:
        return False


def is_prime_of_form_6n_minus_1(n):
    if is_prime(6 * n - 1):
        return True
    else:
        return False


def is_prime_of_form_6n_plus_2(n):
    if is_prime(6 * n + 2):
        return True
    else:
        return False


def is_prime_of_form_6n_minus_2(n):
    if is_prime(6 * n - 2):
        return True
    else:
        return False


def is_prime_of_form_4n_plus_1(n):
    if is_prime(4 * n + 1):
        return True
    else:
        return False


def is_prime_of_form_4n_minus_1(n):
    if is_prime(4 * n - 1):
        return True
    else:
        return False


def is_prime_of_form_4n_plus_3(n):
    if is_prime(4 * n + 3):
        return True
    else:
        return False


def is_prime_of_form_4n_minus_3(n):
    if is_prime(4 * n - 3):
        return True
    else:
        return False


def is_polygonal(s, n):
    if (s - 2) * (s - 1) / 2 == n:
        return True
    else:
        return False


def is_triangular(n):
    if is_polygonal(3, n):
        return True
    else:
        return False


def is_square(n):
    if is_polygonal(4, n):
        return True
    else:
        return False


def is_pentagonal(n):
    if is_polygonal(5, n):
        return True
    else:
        return False


def is_hexagonal(n):
    if is_polygonal(6, n):
        return True
    else:
        return False


def is_heptagonal(n):
    if is_polygonal(7, n):
        return True
    else:
        return False


def is_octagonal(n):
    if is_polygonal(8, n):
        return True
    else:
        return False


def is_square_with_odd_period(n):
    a = np.sqrt(n)
    if a % 1 == 0:
        return True
    else:
        return False


def is_square_with_even_period(n):
    a = np.sqrt(n)
    if a % 1 != 0:
        return True
    else:
        return False


def is_square_with_period(n):
    a = np.sqrt(n)
    if a % 1 != 0:
        return True
    else:
        return False


def is_square_with_period_2(n):
    a = np.sqrt(n)
    if a % 1 != 0:
        b = str(a).split('.')[1]
        if b[0] == '4' or b[0] == '9':
            return True
        else:
            return False
    else:
        return False


def is_square_with_period_4(n):
    a = np.sqrt(n)
    if a % 1 != 0:
        b = str(a).split('.')[1]
        if b[:2] == '24' or b[:2] == '49':
            return True
        else:
            return False
    else:
        return False


def is_square_with_period_6(n):
    a = np.sqrt(n)
    if a % 1 != 0:
        b = str(a).split('.')[1]
        if b[:3] == '288':
            return True
        else:
            return False
    else:
        return False


def is_square_with_period_12(n):
    a = np.sqrt(n)
    if a % 1 != 0:
        b = str(a).split('.')[1]
        if b[:5] == '282475249' or b[:5] == '9900249':
            return True
        else:
            return False
    else:
        return False


def is_square_with_period_18(n):
    a = np.sqrt(n)
    if a % 1 != 0:
        b = str(a).split('.')[1]
        if b[:8] == '34587645138205409' or b[:8] == '90909090909090909':
            return True
        else:
            return False
    else:
        return False


def is_surd(n):
    a = np.sqrt(n)
    if a % 1 != 0:
        return True
    else:
        return False


def is_square_free(n):
    for i in range(2, int(np.sqrt(n)) + 1):
        if n % (i ** 2) == 0:
            return False
    return True


def is_powerful_number(n):
    if is_prime(n):
        return False
    for i in range(2, int(np.sqrt(n)) + 1):
        if n % (i ** 2) == 0:
            return True
    return False


def is_perfect_power(n):
    for i in range(2, int(np.sqrt(n)) + 1):
        for j in range(2, int(np.log(n)) + 1):
            if i ** j == n:
                return True
    return False


def is_happy_number(n):
    while n != 1:
        n = sum([int(i) ** 2 for i in str(n)])
        if n == 4:
            return False
    return True


def is_fortunate_number(n):
    for i in range(n):
        if sum([int(j) for j in str(i)]) == n:
            return True
    return False


def is_abundant_number_2(n):
    if n < sum([int(i)