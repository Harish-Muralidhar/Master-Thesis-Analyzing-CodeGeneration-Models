'''

'''
import sys

def main():
    with open('twice_subsequence.txt') as f:
        T = int(f.readline())
        for i in range(T):
            S = f.readline().strip()
            N = len(S)
            cnt = {}
            for i in range(N):
                for j in range(i+1, N+1):
                    substr = S[i:j]
                    if substr not in cnt:
                        cnt[substr] = 1
                    else:
                        cnt[substr] += 1
            found = False
            for k in cnt:
                if cnt[k] == 2:
                    print(k)
                    found = True
                    break
            if not found:
                print(-1)


if __name__ == '__main__':
    sys.exit(main())