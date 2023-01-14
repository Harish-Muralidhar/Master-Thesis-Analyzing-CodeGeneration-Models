/*

https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/bhallaladeva-and-gold-plates/
 */

package com.hackerearth.practice.algorithms.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class BhallaladevaAndGoldPlates {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int N = Integer.parseInt(br.readLine());
        int[] houses = new int[N];
        int Q;
        int K;
        str = br.readLine();
        String[] strArr = str.split(" ");
        for (int i = 0; i < N; i++) {
            houses[i] = Integer.parseInt(strArr[i]);
        }
        Q = Integer.parseInt(br.readLine());
        for (int k = 0; k < Q; k++) {
            K = Integer.parseInt(br.readLine());
            printCost(houses, K);
        }
    }

    private static void printCost(int[] houses, int K) {
        int cost = 0;
        int n = houses.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = houses[i];
        }
        Arrays.sort(temp);
        int sum = 0;
        int count = 0;
        int i;
        for (i = n - 1; i >= 0; i--) {
            if (count <= K) {
                sum += temp[i];
                count++;
            } else {
                cost += sum;
                sum = 0;
                count = 0;
                i++;
            }
        }

        if (sum > 0) {
            cost += sum;
        }
        System.out.println(cost);
    }
}