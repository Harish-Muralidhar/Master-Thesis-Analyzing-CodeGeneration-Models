/*
 However, there are two ways to place the objects such that this difference is at most 1. It is possible to place the objects as BBAA or as AAAA. In the first case, following permutation 0 2 1 3 results in the sequence being BBAA wherease following permutation 1 2 3 0 results in the sequence being ABBA. In the second case, following permutation 0 2 1 3 results in the sequence being BBAA wherease following permutation 1 2 3 0 results in the sequence being ABBA. Either way, the maximum difference is again at most 1. However, the string AAAB is lexicographically least of these two strings and therefore should be the output.


 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t != 0) {
            t--;
            int n = s.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                y[i] = s.nextInt();
            }

            int[] output = new int[n];
            int j = n - 1;
            int k = n - 1;
            for (int i = n - 1; i >= 0; i--) {
                if (x[j] == i) {
                    output[i] = 1;
                    j--;
                } else {
                    output[i] = 2;
                    k--;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(output[i] == 1 ? "A" : "B");
            }
            System.out.println("");
        }
    }
}