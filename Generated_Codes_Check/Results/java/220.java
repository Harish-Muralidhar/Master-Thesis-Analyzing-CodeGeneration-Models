/*

 */
import java.util.Scanner;
public class Johny_and_the_Wall {

    static long mod = 1000000007;

    static long power(long a, long b) {
        if (b == 0)
            return 1;
        else if (b == 1)
            return a;
        else {
            long val;
            if (b % 2 == 0) {
                val = power(a, b / 2);
                return (val * val) % mod;
            } else {
                val = power(a, b / 2);
                return (val * val * a) % mod;
            }
        }
    }

    static long solve(int n) {
        int m = n / 2;
        long val = power(2, m);
        if (n % 2 == 1)
            return (val * (val - 1)) % mod;
        else
            return ((val * (val - 1)) / 2) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
}