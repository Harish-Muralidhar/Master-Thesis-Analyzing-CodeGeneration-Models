'''

'''

# Time:  O(N * M)
# Space: O(M)

import itertools


class Solution(object):
    def calculate_answer(self, N, M, A, modulo):
        result = 0
        for i in xrange(1 << M):
            if not i & (i >> 1):
                for j in xrange(1, N + 1):
                    if j * i > A[-1]:
                        break
                    if not (j * i & A[-j]):
                        continue
                    result = (result + (self.f[N] - self.f[N - j] + modulo) *
                              self.f[j - 1]) % modulo
        return result

    def solve(self, N, M, A, modulo):

        self.f = [1]
        for i in xrange(1, N + 1):
            self.f.append(self.f[-1] * i % modulo)

        result = self.calculate_answer(N, M, A, modulo)

        for i in xrange(M):
            A = [A[j] ^ (1 << i) for j in xrange(N)]
            result = (result + self.calculate_answer(N, M, A, modulo)) % modulo
        return result


if __name__ == '__main__':
    T = int(raw_input())
    for _ in xrange(T):
        N, M = map(int, raw_input().strip().split())
        A = map(int, raw_input().strip().split())
        print Solution().solve(N, M, A, 10 ** 9 + 9)