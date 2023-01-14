/*
 */

//import java.util.Scanner;

/*
public class ChefLandGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int d = in.nextInt();
            int[][] points = new int[n][d];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < d; j++) {
                    points[i][j] = in.nextInt();
                }
            }
            double max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    double sum = 0;
                    if (i != j) {
                        for (int k = 0; k < d; k++) {
                            sum += Math.pow((points[i][k] - points[j][k]), 2);
                        }
                        if (sum > max) {
                            max = sum;
                        }
                    }
                }
            }
            System.out.println((long) (max % 747474747));
        }
    }
}
*/