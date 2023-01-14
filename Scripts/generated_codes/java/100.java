/*

*/

import java.util.Scanner;

public class BeautifulArray {

    public static void main(String[] args) {
        //code
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        for (int i = 0; i < testCase; i++) {

            int count = s.nextInt();
            int a[] = new int[count];
            int totalCount = (int) Math.pow(2, count);
            int b[] = new int[totalCount];
            for (int j = 0; j < totalCount; j++) {
                b[j] = s.nextInt();
            }
            getResults(a, b, totalCount, count, 0);
            for (int k = 0; k < count; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }

    private static void getResults(int[] a, int[] b, int totalCount, int count, int start) {

        if (count == 0) {
            return;
        }

        int max = -1;
        int sum = -1;
        for (int i = 0; i < totalCount; i++) {
            if (b[i] >= max) {
                max = b[i];
                sum = i + 1;
            }
        }

        a[start] = max;
        for (int j = 0; j < totalCount; j++) {
            b[j] = b[j] - max;
        }

        getResults(a, b, totalCount, count - 1, start + 1);
    }

}