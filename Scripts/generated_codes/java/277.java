/*

Note: Your code should be able to convert the sample input into the sample output. However, this is not enough to pass the challenge, because the code will be run on multiple test cases. Therefore, your code must solve this problem statement.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class LazyHaku {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] temp = br.readLine().split(" ");
            int N = Integer.parseInt(temp[0]);
            int M = Integer.parseInt(temp[1]);
            int[] table = new int[N];
            Arrays.fill(table, -1);
            String[] req = br.readLine().split(" ");
            int res = 0;
            boolean flag = false;
            for (int j = 0; j < M; j++) {
                int c = Integer.parseInt(req[j]);
                flag = false;
                for (int k = 0; k < N; k++) {
                    if (table[k] == -1) {
                        table[k] = c;
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    for (int k = 0; k < N; k++) {
                        table[k] = -1;
                    }
                    table[0] = c;
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}