/*

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            String[] input = br.readLine().trim().split(" ");
            int e = Integer.parseInt(input[0]);
            int o = Integer.parseInt(input[1]);

            int[] output = new int[n];

            if (e % 2 == 0) {
                int i = 0;
                while (e > 0) {
                    output[i] = 2;
                    output[i + 1] = 1;
                    e -= 2;
                    i += 2;
                }

                while (o > 0) {
                    output[i] = 1;
                    o--;
                    i++;
                }
                printArr(output);
            } else {
                if (e <= 0) {
                    if (o == n * (n + 1) / 2) {
                        int i = 0;
                        while (o > 0) {
                            output[i] = 1;
                            o--;
                            i++;
                        }
                        printArr(output);
                    } else {
                        System.out.println("-1");
                    }
                } else {
                    int i = 0;
                    output[i] = 2;
                    e--;
                    i++;
                    while (e > 0) {
                        output[i] = 2;
                        output[i + 1] = 1;
                        e -= 2;
                        i += 2;
                    }

                    while (o > 0) {
                        output[i] = 1;
                        o--;
                        i++;
                    }
                    printArr(output);
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}