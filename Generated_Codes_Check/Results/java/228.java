/*

 */

import java.util.Scanner;

public class GameWithBalls {

    private static int[] gcd(int a, int b) {
        if (b == 0) {
            int[] ret = {1, 0, a};
            return ret;
        }
        int[] vals = gcd(b, a % b);
        int[] ret = {vals[1], vals[0] - vals[1] * (a / b), vals[2]};
        return ret;
    }

    private static int getSum(int[] arr, int n) {
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int t=0; t<testCases; t++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }

            int min = arr[0];
            int max = arr[0];
            for(int i=1; i<n; i++) {
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
            }

            int sum = getSum(arr, n);
            int[] vals = gcd(max, min);
            int gcd = vals[2];
            int x = vals[0];
            int y = vals[1];

            int ans = 0;
            if(min == max && gcd == 1) {
                ans = min + 1;
            } else if(gcd > 1) {
                if(min == max) {
                    ans = min - gcd;
                } else {
                    ans = sum - (min + max);
                }
            } else {
                ans = sum - (min + max);
            }
            System.out.println(ans);
        }
    }
}