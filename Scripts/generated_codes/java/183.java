/*

Constraint

The first and the last k digits of n^n should not contain any leading zeroes.

Time Limit: 2 secs
Memory Limit: 256 MB


 */

import java.util.Scanner;

public class FPT_CT_001_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {

            long number = scanner.nextLong();
            int k = scanner.nextInt();

            long firstDigit = (long) Math.pow(number, number);
            String firstHalf = Long.toString(firstDigit).substring(0, k);
            String secondHalf = Long.toString(firstDigit).substring(Long.toString(firstDigit).length() - k, Long.toString(firstDigit).length());

            System.out.println(firstHalf + " " + secondHalf);

        }

    }

}