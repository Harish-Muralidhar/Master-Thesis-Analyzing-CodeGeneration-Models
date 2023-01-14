/*

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Probs {

    private static Scanner scanner = new Scanner(System.in);
    private static int totalCases;
    private static int n;
    private static int k;
    private static int[] p;
    private static double max;
    private static HashMap<Integer, Double> hmap = new HashMap<Integer, Double>();
    private static ArrayList<Integer> maxList = new ArrayList<Integer>();

    public static void main(String[] args) {
        totalCases = scanner.nextInt();
        for (int i = 0; i < totalCases; i++) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            p = new int[n];
            max = 0;
            for (int j = 0; j < n; j++) {
                p[j] = scanner.nextInt();
            }
            for (int j = 1; j <= n; j++) {
                int[] array = new int[j];
                for (int m = 0; m < j; m++) {
                    array[m] = m + 1;
                }
                permute(array, 0, j);
                Iterator it = hmap.entrySet().iterator();
                while (it.hasNext()) {
                    HashMap.Entry pair = (HashMap.Entry) it.next();
                    if ((double) pair.getValue() == max) {
                        maxList.add((int) pair.getKey());
                    }
                }
                hmap.clear();
            }

            for (int j = 0; j < maxList.size(); j++) {
                System.out.print(maxList.get(j) + " ");
            }
            System.out.println();
            maxList.clear();
        }
    }

    public static void permute(int[] a, int k, int n) {
        if (k == n) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += p[a[i] - 1] / 100.00;
            }
            double probability = sum * k;
            for (int i = 0; i < n; i++) {
                probability += (1 - p[a[i] - 1] / 100.00) * (k - 1);
                probability = probability / k;
            }
            hmap.put(k, probability);
            if (probability > max) {
                max = probability;
            }
        } else {
            for (int i = k; i < n; i++) {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;

                permute(a, k + 1, n);

                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }

}