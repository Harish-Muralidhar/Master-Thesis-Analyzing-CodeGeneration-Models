/*

 */

package com.Geeksforgeeks.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PartyCollisions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0){
            String[] arr = br.readLine().split(" ");
            int size1 = Integer.parseInt(arr[0]);
            int size2 = Integer.parseInt(arr[1]);

            int[][] mat = new int[size1][size2];

            for (int i = 0; i < size1; i++) {
                char[] chars = br.readLine().toCharArray();
                for (int j = 0; j < size2; j++) {
                    mat[i][j] = Integer.parseInt(String.valueOf(chars[j]));
                }
            }

            System.out.println(findCollision(mat,size1,size2));
        }
    }

    private static int findCollision(int[][] mat, int size1, int size2) {
        int count = 0;
        for (int i = 0; i < size1; i++) {
            for (int j = i+1; j < size1; j++) {
                for (int k = 0; k < size2; k++) {
                    if (mat[i][k]==1 && mat[j][k]==1)
                        count++;
                }
            }
        }
        return count;
    }
}