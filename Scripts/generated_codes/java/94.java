/*
 */

import java.io.*;
import java.util.*;

class Triplet {
    long x, y, z;
    Triplet(long x, long y, long z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int mod = 1000000009;
        long[][] dp = new long[200][200];
        long[][][] dp1 = new long[200][200][200];
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                dp[i][j] = 0;
                for (int k = 0; k < 200; k++) dp1[i][j][k] = 0;
            }
        }
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                dp[i][j] = 1;
            }
        }
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                dp1[i][j][0] = 1;
            }
        }
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                for (int k = 1; k <= 100; k++) {
                    dp1[i][j][k] = dp[i][j] - dp1[i][j][k-1];
                    if (dp1[i][j][k] < 0) dp1[i][j][k] += mod;
                }
            }
        }
        while (T-- > 0) {
            String[] input = br.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input[0]), K = Integer.parseInt(input[1]);
            long sum = 0;
            for (int i = 1; i <= 100; i++) {
                for (int j = i; j <= 100; j++) {
                    for (int k = j; k <= 100; k++) {
                        int prev = Math.max(0, k - i);
                        sum = (sum + (dp1[i][j][prev]*dp[j][k])%mod)%mod;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}