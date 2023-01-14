/*
*/

import java.util.Scanner;

public class board_game {

    public static final int MODULO = 1000000007;
    public static final int MAX_N = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            long n = sc.nextLong();
            long m = sc.nextLong();

            long total = (((n + 1) * (m + 1)) % MODULO + ((n + 1) * (m + 1) - 2) % MODULO) % MODULO;
            System.out.println(total);

        }
    }
}