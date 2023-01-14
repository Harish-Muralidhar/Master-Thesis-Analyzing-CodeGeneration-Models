/*

Explanation:
bobseesanna = bob + sees + anna

bobseesanna = bob + s + ee + s + anna

bobseesanna = bob + s + es + e + anna

bobseesanna = b + o + b + sees + a + n + n + a

bobseesanna = b + o + b + s + ee + s + a + n + n + a

bobseesanna = b + o + b + s + es + e + s + a + n + n + a

bobseesanna = b + o + b + se + es + a + n + n + a

bobseesanna = b + o + b + se + e + s + a + n + n + a

bobseesanna = b + o + bsees + a + n + n + a

bobseesanna = b + o + bse + e + s + a + n + n + a

bobseesanna = b + o + bsee + s + anna

bobseesanna = b + o + bsee + s + a + n + n + a

bobseesanna = b + o + bsees + anna

bobseesanna = b + o + bsees + a + n + n + a

bobseesanna = b + o + bse + es + a + n + n + a

bobseesanna = b + o + bse + e + s + a + n + n + a

bobseesanna = b + o + b + sees + anna

bobseesanna = b + o + b + sees + a + n + n + a

bobseesanna = b + o + b + se + es + a + n + n + a

bobseesanna = b + o + b + se + e + s + a + n + n + a
 */
public class CountPalindromes {
    public static void main(String[] args) {
        String str = "bobseesanna";
        System.out.println(countPalindromes(str));
    }

    private static int countPalindromes(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i + 1][j] - dp[i + 1][j - 1];

                if (str.charAt(i) == str.charAt(j)) {
                    if (j == i + 1) {
                        dp[i][j] += 1;
                    } else if (str.charAt(i + 1) == str.charAt(j - 1)) {
                        dp[i][j] += 1;
                    }
                }
            }
        }
        return dp[0][n - 1];
    }
}