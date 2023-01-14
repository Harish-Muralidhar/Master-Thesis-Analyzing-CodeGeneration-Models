/*
**/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] arr = new int[n][m];
            for(int i = 0; i < n; i++){
                s = br.readLine().split(" ");
                for(int j = 0; j < m; j++){
                    arr[i][j] = Integer.parseInt(s[j]);
                }
            }
            int answer = arr[0][0];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    answer ^= arr[i][j];
                }
            }
            System.out.println(answer);
        }
    }
}