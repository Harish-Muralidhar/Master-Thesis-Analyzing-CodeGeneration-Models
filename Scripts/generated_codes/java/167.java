/*


Explanation
In the first case, we create a road at y = 0, so d1 = d3 = d5 = d7 = 14.1421356237310, d2 = d4 = d6 = d8 = 14.1421356237310, and max(d1, d2, ..., dN) = 14.1421356237310.
In the second case, we create a road at y = 0 and another road at x = 0, so d1 = d2 = d3 = d4 = d5 = d6 = d7 = d8 = 0.707106781186547, and max(d1, d2, ..., dN) = 0.707106781186547.

In the first case, the K roads are created at y = 0, x = 0.
In the second case, the K roads are created at y = 0, x = 0 and y = 0, x = 0.

In the first case, the coordinates of the restaurants are (20, 1), (-20, 1), (20, -1), (-20, -1), (1, 20), (-1, 20), (1, -20), (-1, -20).
In the second case, the coordinates of the restaurants are (20, 1), (-20, 1), (20, -1), (-20, -1), (1, 20), (-1, 20), (1, -20), (-1, -20).
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; ++i) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] x = new int[N];
            int[] y = new int[N];
            for (int j = 0; j < N; ++j) {
                x[j] = sc.nextInt();
                y[j] = sc.nextInt();
            }
            System.out.println(solve(x, y, K));
        }

        sc.close();
    }

    static double solve(int[] x, int[] y, int K) {
        double result = Double.MAX_VALUE;
        for (int i = 0; i < x.length - 1; ++i) {
            for (int j = i + 1; j < x.length; ++j) {
                double slope = ((double) y[j] - y[i]) / (x[j] - x[i]);
                double yIntercept = y[i] - slope * x[i];

                double[] distances = new double[x.length];
                for (int k = 0; k < distances.length; ++k) {
                    if (slope == 0) {
                        distances[k] = Math.abs(yIntercept - y[k]);
                    } else {
                        distances[k] = Math.abs(y[k] - (slope * x[k] + yIntercept)) / Math.sqrt(1 + slope * slope);
                    }
                }

                if (K == 1) {
                    result = Math.min(result, Arrays.stream(distances).max().getAsDouble());
                } else {
                    Arrays.sort(distances);

                    double[] maxDistances = new double[K - 1];
                    for (int k = 0; k < maxDistances.length; ++k) {
                        maxDistances[k] = distances[distances.length - 1 - k];
                    }
                    result = Math.min(result, Arrays.stream(maxDistances).max().getAsDouble());
                }
            }
        }

        return result;
    }
}