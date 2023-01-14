/*

 */

import java.util.Scanner;

public class MinimumPartialSumModuloP {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int N = sc.nextInt ();
        int K = sc.nextInt ();
        int P = sc.nextInt ();
        int[] arr = new int[ N ];
        for ( int i = 0; i < N; i++ ) {
            arr[i] = sc.nextInt ();
        }
        sc.close ();
        System.out.println ( minPartialSum ( arr, K, P ) );
    }

    private static int minPartialSum(int[] arr, int k, int p) {
        int n = arr.length;
        int[] sm = new int[ n ];
        sm[0] = arr[0] % p;
        for ( int i = 1; i < n; i++ ) {
            sm[i] = ( sm[i - 1] + arr[i] ) % p;
        }
        int min = Integer.MAX_VALUE;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = i; j < n; j++ ) {
                int sum = sm[j] - sm[i];
                if ( sum < 0 ) {
                    sum += p;
                }
                if ( sum >= k ) {
                    if ( sum < min ) {
                        min = sum;
                    }
                }
            }
        }
        return min;
    }
}