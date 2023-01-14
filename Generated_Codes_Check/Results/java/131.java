/*

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int M = sc.nextInt();
            int K = sc.nextInt();
            int N = sc.nextInt();
            ArrayList<Integer>[] graph = new ArrayList[M + 1];
            for(int i = 1; i <= M; i++) {
                graph[i] = new ArrayList<>();
            }
            for(int i = 0; i < K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                graph[x].add(y);
            }
            int[] arr = new int[N];
            boolean[] visited = new boolean[M + 1];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                visited[arr[i]] = true;
            }
            int count = 0;
            for(int i = 1; i <= M; i++) {
                if(!visited[i]) {
                    count++;
                }
            }
            int[] dp = new int[M + 1];
            boolean[] good = new boolean[M + 1];
            dp[M] = 1;
            for(int i = M - 1; i >= 1; i--) {
                if(visited[i]) {
                    if(good[i]) {
                        dp[i] = 1;
                    } else {
                        dp[i] = dp[i + 1] + 1;
                    }
                } else {
                    dp[i] = dp[i + 1] + 1;
                }
                for(int j = 0; j < graph[i].size(); j++) {
                    int next = graph[i].get(j);
                    if(dp[i] == dp[next]) {
                        good[i] = true;
                    }
                }
            }
            if(dp[1] == 1) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
        }
    }
}