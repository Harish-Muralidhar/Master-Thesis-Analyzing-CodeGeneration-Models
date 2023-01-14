/*
*/
import java.util.*;
public class AbhijeetGame {
    private static final int MAX = 1000000;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] len = new int[n];
            int[] bre = new int[n];
            for(int i=0; i<n; i++) {
                len[i] = scan.nextInt();
                bre[i] = scan.nextInt();
            }

            int[] tlen = new int[n];
            int[] tbre = new int[n];
            for(int i=0; i<n; i++) {
                tlen[i] = len[i];
                tbre[i] = bre[i];
            }
            Arrays.sort(tlen);
            Arrays.sort(tbre);

            int maxL = tlen[n-1];
            int maxB = tbre[n-1];
            int[][] dp = new int[maxL+1][maxB+1];

            dp[0][0] = 1;
            for(int i=0; i<n; i++) {
                for(int j=maxL; j >= len[i]; j--) {
                    for(int k=maxB; k >= bre[i]; k--) {
                        dp[j][k] = Math.max(dp[j][k], dp[j-len[i]][k-bre[i]] + 1);
                    }
                }
            }
            int ans = 0;
            for(int i=0; i<=maxL; i++) {
                for(int j=0; j<=maxB; j++) {
                    if(dp[i][j] == n-m) {
                        ans = Math.max(ans, i*j);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}