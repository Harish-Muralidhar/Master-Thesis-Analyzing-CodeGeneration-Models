/*

Example case 2.
In second case, we can choose

(0,1) (1,2) (2,3) (3,4) (4,4) (3,4) (2,4) (1,4) (0,2) (2,2)
(0,3) (3,3) (2,3) (1,3) (0,2) (2,2) (1,2) (0,3) (3,3) (2,3)
(0,4) (4,4) (3,4) (2,4) (1,4) (0,2) (2,2) (1,2) (0,1) (1,1)
 
 */
package com.Geeksforgeeks.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualizeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {
            int num = sc.nextInt();
            int arr[] = new int[num];

            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(minMoves(arr, num));
        }
    }

    private static long minMoves(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            max = Math.max(max, map.get(arr[i]));
        }

        return n - max;
    }
}