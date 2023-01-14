/*


*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class ChefAndBinaryString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] input = br.readLine().split("\\s+");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);
            int m = Integer.parseInt(input[2]);
            StringBuilder result = new StringBuilder();
            if (!(n < k) && !(k == 1 && n > 1)) {
                int i = 1, j = n - k;
                while (i <= k && j >= 0) {
                    if (i > j) {
                        while (j >= 0) {
                            result.append("0");
                            j--;
                        }
                        while (i <= k) {
                            result.append("1");
                            i++;
                        }

                    } else {
                        int p = 1, q = 1;
                        while (i > 1) {
                            p = p * i;
                            i--;
                        }
                        while (j > 1) {
                            q = q * j;
                            j--;
                        }
                        if (p > q) {
                            result.append("1");
                            k--;
                        } else {
                            result.append("0");
                            n--;
                        }
                    }
                }
                System.out.println(result);
            } else {
                System.out.println("-1");
            }
        }
    }
}