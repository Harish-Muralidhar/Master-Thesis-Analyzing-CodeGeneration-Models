/*

problem has been solved by using KMP algorithm.
 */
package com.solution.coding;

import java.util.Scanner;

public class Solution_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int[] prefix = prefixArray(string);
        int j = 0;
        int move = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'C' || string.charAt(i) == 'H' || string.charAt(i) == 'E' || string.charAt(i) == 'F') {
                j = prefix[j - 1];
            } else {
                j = 0;
            }
            if (string.charAt(i) == 'F') {
                j++;
            }
            if (j == 4) {
                j = prefix[j - 1];
                move++;
            }
        }
        System.out.println(move);
    }

    public static int[] prefixArray(String string) {
        int[] prefix = new int[string.length()];
        prefix[0] = 0;
        int j = 0;
        for (int i = 1; i < string.length(); i++) {
            while (j > 0 && string.charAt(i) != string.charAt(j)) {
                j = prefix[j - 1];
            }
            if (string.charAt(i) == string.charAt(j)) {
                j++;
            }
            prefix[i] = j;
        }
        return prefix;
    }
}