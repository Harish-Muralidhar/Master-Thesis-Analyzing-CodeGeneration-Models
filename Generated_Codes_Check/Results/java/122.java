/*

*/
import java.io.*;
import java.util.*;
import java.lang.*;

public class EmilyAndThePresents {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] i1 = br.readLine().split("\\s+");
            int n = Integer.parseInt(i1[0]);
            int m = Integer.parseInt(i1[1]);
            int k = Integer.parseInt(i1[2]);
            int[] arr = new int[n];
            String[] i2 = br.readLine().split("\\s+");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(i2[i]);
            }
            Arrays.sort(arr);
            int ans = -1;
            for (int i = 0; i < m; i++) {
                k -= arr[i] % k;
            }
            if (k == 0) {
                ans = 0;
                for (int i = 0; i < m; i++) {
                    ans += arr[i];
                }
            }
            out.println(ans);
        }
        out.close();
    }
}