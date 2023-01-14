/*
 */

import java.util.Scanner;

public class ChefAndCielRestaurant {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[][] points = new int[n][2];
            for (int j = 0; j < n; j++) {
                points[j][0] = sc.nextInt();
                points[j][1] = sc.nextInt();
            }
            System.out.println(findMax(points));
        }
    }

    static double findMax(int[][] points) {
        double max = 0, temp;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                temp = findDist(points[i], points[j]);
                if (temp > max) {
                    max = temp;
                }
            }
        }
        return max;
    }

    static double findDist(int[] a, int[] b) {
        int x = a[0] - b[0];
        int y = a[1] - b[1];
        return Math.sqrt(x * x + y * y);
    }
}