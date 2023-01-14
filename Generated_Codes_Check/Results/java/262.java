/*
Test Case 3: Chef may choose the paths


(1,1)->(1,2)->(1,3)->(1,4)->(1,5)
(1,1)->(2,1)->(3,1)->(4,1)->(5,1)

In this case, the value of S will be equal to 12.

*/

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++) {
            String[] inp = br.readLine().split("\\s+");
            int N = Integer.parseInt(inp[0]);
            int M = Integer.parseInt(inp[1]);
            int K = Integer.parseInt(inp[2]);

            int[][] grid = new int[N][M];
            for(int[] arr : grid)
                Arrays.fill(arr, -1);
            
            int i = 0, j = 0;
            while(i < N && j < M && K > 0) {
                if(i == 0) {
                    while(j < M && K > 0) {
                        grid[i][j]++;
                        K--;
                        j++;
                    }
                    i++;
                    j--;
                }

                else if(j == 0) {
                    while(i < N && K > 0) {
                        grid[i][j]++;
                        K--;
                        i++;
                    }
                    i--;
                    j++;
                }

                else if(i == N - 1) {
                    while(j < M && K > 0) {
                        grid[i][j]++;
                        K--;
                        j++;
                    }
                    i--;
                    j--;
                }

                else if(j == M - 1) {
                    while(i < N && K > 0) {
                        grid[i][j]++;
                        K--;
                        i++;
                    }
                    i--;
                    j--;
                }
            }
            int max = 0;
            for(int x = 0; x < N; x++) {
                for(int y = 0; y < M; y++) {
                    max = Math.max(max, grid[x][y]);
                }
            }
            out.println(max+1);
        }
        out.close();
    }
}