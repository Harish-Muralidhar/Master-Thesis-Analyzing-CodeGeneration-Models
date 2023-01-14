/*

Test Case 3: The figure below shows all the 8 valid ways the Chef can place the rooks in the board. Note that the following way to place the rooks was invalid.

1 0
1 0

Test Case 4: The figure below shows all the 11 valid ways the Chef can place the rooks in the board.

1 0
1 0
1 0

0 1
0 1
0 1

1 1
0 0
0 0

1 0
1 1
0 0

0 1
0 1
1 0

1 0
1 0
0 1

0 1
0 0
1 1

1 0
0 1
1 0

0 1
1 0
0 1

1 0
0 0
1 1

We need to find the number of ways such that Sous Chef cannot win. We use a dynamic programming approach to solve this. Assume that the board has R rows and C columns. Let's denote the number of states with R rows and C columns and N rooks as P(R, C, N). We will now consider the possible cases.

Case 1: There is no rook on the last column. The number of ways in which this can happen is P(R, C - 1, N).

Case 2: There is at least one rook on the last column. Let us consider the case when there are i rooks on the last column. The number of ways in which this can happen is P(R - i, C, N - i).

Case 3: There is at least one rook on the last row. Let us consider the case when there are i rooks on the last row. The number of ways in which this can happen is P(R, C - i, N - i).

We can compute the answer by considering all possible values of i and summing up the results. However, this will take O(N) time which is not enough to pass the constraints. We will take another approach.

Let us consider Case 2. Since we have considered all possible values of i, we can express the number of ways as follows:

P(R, C, N) = P(R, C - 1, N) + SUM{ P(R - i, C, N - i) }, 1 <= i <= min(N, R)
Similarly, we can express the number of ways in Case 3 as follows:

P(R, C, N) = P(R - 1, C, N) + SUM{ P(R, C - i, N - i) }, 1 <= i <= min(N, C)
We will take the minimum of these two expressions. We can compute each SUM in constant time.

We will now consider the base cases.

If C is 1, then the Sous Chef can always win, no matter how the N rooks are placed on the board. Hence P(R, 1, N) = 0.
Similarly, if R is 1, then P(1, C, N) = 0.
If N is 0, then P(R, C, 0) = 1.
If N is 1, then we can only have this case:

*
*
*
*
*

When N is 2, we can have the following cases:

2 0
0 0

0 2
0 0

0 0
2 0

0 0
0 2

0 1
1 0

1 0
0 1

0 0
1 1

1 1
0 0

0 0
0 0
0 0
0 0
0 0

Now observe that these are all the possible cases. Hence P(R, C, 2) = 2*(R + C - 2) + 4.

Similarly, when N is 3, we can have the following cases:

3 0
0 0

0 3
0 0

0 0
3 0

0 0
0 3

0 0
0 0
3 0

0 0
0 0
0 3

0 0
0 0
0 0
3 0

0 0
0 0
0 0
0 3

0 2
1 0

0 2
0 1

0 1
2 0

2 0
0 1

1 0
0 2

0 1
0 2

2 0
1 0

1 0
2 0

2 1
0 0

0 2
1 0

0 1
2 0

0 2
0 1

1 2
0 0

0 1
0 0
0 2

0 2
0 0
0 1

0 0
0 1
0 2

0 0
0 2
0 1

0 0
1 2
0 0

0 0
1 0
0 2

0 0
2 0
0 1

0 0
2 1
0 0

1 0
0 0
2 0

0 1
0 0
0 2

0 0
1 0
2 0

2 0
0 0
1 0

0 0
2 0
1 0

1 2
0 0
0 0

0 1
2 0
0 0

0 0
1 0
0 0
0 2

0 2
0 0
0 0
0 1

0 0
2 1
0 0
0 0

1 0
0 2
0 0

1 0
0 0
0 2

0 2
1 0
0 0

0 0
0 1
2 0

0 2
0 1
0 0

2 0
1 0
0 0

0 0
0 2
1 0

2 0
0 0
0 1

0 0
1 0
2 0

0 0
0 0
1 2
0 0

0 0
0 0
1 0
0 2

0 0
0 0
2 0
0 1

0 0
0 0
2 1
0 0

1 0
0 0
0 0
2 0

0 1
0 0
0 0
0 2

0 0
1 0
0 0
2 0

2 0
0 0
0 0
1 0

0 0
2 0
0 0
1 0

0 0
0 0
0 0
1 2
0 0

0 0
0 0
0 1
2 0

0 0
0 0
0 2
1 0

0 0
0 0
1 0
0 0
0 2

0 0
0 0
2 0
0 0
0 1

0 0
0 0
2 1
0 0
0 0

1 0
0 0
0 0
0 0
2 0

0 1
0 0
0 0
0 0
0 2

0 0
1 0
0 0
0 0
2 0

2 0
0 0
0 0
0 0
1 0

0 0
2 0
0 0
0 0
1 0

0 0
0 0
0 0
2 1
0 0
0 0

0 0
0 0
0 0
1 0
0 2

0 0
0 0
0 0
2 0
0 1

0 0
0 0
0 0
0 0
1 2
0 0

0 0
0 0
0 0
0 0
1 0
0 2

0 0
0 0
0 0
0 0
2 0
0 1

0 0
0 0
0 0
0 0
2 1
0 0

Now observe that these are all the possible cases. Hence P(R, C, 3) = 3*(R + C - 2) + 5*(R*C - R - C + 1).

We can similarly compute P(R, C, N) = N*(R + C - 2) + 4*(R*C - R - C + 1). Hence we can compute P(R, C, N) in constant time.

*/

/*

SOLUTION:-

Let us denote the quantity we have to find as P(R, C, N).

If Case 1 holds, then P(R, C, N) = P(R, C - 1, N).

If Case 2 holds, then P(R, C, N) = P(R, C - 1, N) + sum from i = 1 to min(N, R) of P(R - i, C, N - i).

If Case 3 holds, then P(R, C, N) = P(R - 1, C, N) + sum from i = 1 to min(N, C) of P(R, C - i, N - i).

We will take the minimum of these three expressions.

We can compute the quantity P(R, C, N) using dynamic programming. We will use a 3D array T to store the values of P(R, C, N). Hence T[r][c][n] = P(r, c, n) for 1 <= r <= R, 1 <= c <= C, 1 <= n <= N.

We will use the following recursion relation to compute P(R, C, N):

T[r][c][n] = min(
T[r][c - 1][n] + sum from i = 1 to min(n, r) of T[r - i][c][n - i],
T[r - 1][c][n] + sum from i = 1 to min(n, c) of T[r][c - i][n - i]
)
Note that the sums can be computed in O(1) time as follows:

For the first sum, we will maintain an array S1[r]. The value of S1[r] = sum from i = 1 to r of T[r - i][c][n - i]. Hence S1[r] = P(r, c, n) - P(r - 1, c, n).

Similarly, for the second sum, we will maintain an array S2[c]. The value of S2[c] = sum from i = 1 to c of T[r][c - i][n - i]. Hence S2[c] = P(r, c, n) - P(r, c - 1, n).

The base cases are:

T[1][c][n] = 0
T[r][1][n] = 0
T[r][c][0] = 1
T[r][c][1] = r + c - 2
T[r][c][2] = 2*(r + c - 2) + 4
T[r][c][3] = 3*(r + c - 2) + 5*(r*c - r - c + 1)
T[r][c][n] = n*(r + c - 2) + 4*(r*c - r - c + 1)
NOTE: The boundary values of T do not require any special handling. We can safely assume that T[r][c][n] = 0 for all values of r, c and n that are not within the prescribed range.

The time complexity of the above solution is O(R*C*N).

*/

import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;

class Rooks {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long r = sc.nextLong();
            long c = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(solve(r, c, k));
        }
    }

    static long MOD = 10007L;

    static long solve(long r, long c, long n) {
        BigInteger[][][] T = new BigInteger[(int) r + 1][(int) c + 1][(int) n + 1];
        for (int i = 0; i <= r; i++) for (int j = 0; j <= c; j++) for (int k = 0; k <= n; k++) T[i][j][k] = BigInteger.ZERO;
        for (int i = 1; i <= r; i++) T[i][1][0] = BigInteger.ONE;
        for (int i = 1; i <= c; i++) T[1][i][0] = BigInteger.ONE;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i > 1) {
                    T[i][j][0] = T[i - 1][j][0];
                }
                if (j > 1) {
                    T[i][j][0] = T[i][j][0].add(T[i][j - 1][0]);
                }
            }
        }
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                for (int k = 1; k <= n; k++) {
                    BigInteger sum1 = BigInteger.ZERO;
                    BigInteger sum2 = BigInteger.ZERO;
                    for (int x = 1; x <= Math.min(k, i); x++) {
                        sum1 = sum1.add(T[i - x][j][k - x]);
                    }
                    for (int x = 1; x <= Math.min(k, j); x++) {
                        sum2 = sum2.add(T[i][j - x][k - x]);
                    }
                    T[i][j][k] = T[i][j - 1][k].add(sum1);
                    T[i][j][k] = T[i][j][k].min(T[i - 1][j][k].add(sum2));
                }
            }
        }
        return T[(int) r][(int) c][(int) n].mod(BigInteger.valueOf(MOD)).longValue();
    }
}