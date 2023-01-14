/*

EXPLANATION:

Let us consider the following set of sequences of streets:

S1 = {1}
S2 = {1, 2}, {1, 3}, {1, 4},
S3 = {1, 2, 3}, {1, 2, 4}, {1, 3, 4},
S4 = {1, 2, 3, 4}

There are 4 elements of set S1, 6 elements of set S2, 3 elements of set S3 and 1 element of set S4.
Let us calculate the product of all the elements of these sets:

S1 = {1} => 1
S2 = {1, 2}, {1, 3}, {1, 4}, => 1 * 2 = 2, 1 * 3 = 3, 1 * 4 = 4
S3 = {1, 2, 3}, {1, 2, 4}, {1, 3, 4}, => 1 * 2 * 3 = 6, 1 * 2 * 4 = 8, 1 * 3 * 4 = 12
S4 = {1, 2, 3, 4} => 1 * 2 * 3 * 4 = 24

If we sum up the products of these sets, we will get the minimal possible product.

Sum = 1 + 2 + 3 + 4 + 6 + 8 + 12 + 24 = 60

*/
import java.util.*;
import java.lang.*;

class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long result = 1;
        long[] dp = new long[n];

        for (int i = 0; i < n; i++) {
            dp[i] = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (i - j <= k) {
                    dp[i] = Math.min(dp[i], dp[j] * arr[i]);
                }
            }
            result = result * dp[i] % 1000000007;
        }
        System.out.println(result);
    }
}