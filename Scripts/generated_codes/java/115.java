/*
 */

import java.util.Scanner;

public class BinaryTreePaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt();

        for (int i = 0; i < Q; i++) {
            int n = sc.nextInt();
            int u = sc.nextInt();
            int v = sc.nextInt();

            System.out.println(countPairs(n, u, v));
        }
    }

    static long countPairs(int n, int u, int v) {
        if (u == 1 || v == 1) {
            return n;
        }

        long max = Math.max(u, v);
        long min = Math.min(u, v);

        long count = 0;

        while (max != min) {
            count++;
            max = max / 2;
            min = min / 2;
        }

        return (long) Math.pow(2, count);
    }
}