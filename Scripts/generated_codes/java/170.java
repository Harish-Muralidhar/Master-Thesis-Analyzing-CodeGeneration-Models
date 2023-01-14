/*

TIME LIMIT:
1s

MEMORY LIMIT PER TEST CASE:
64 MB

*/

import java.util.Scanner;

public class GruSavesTheMinions {
    public static void main(String[] args) {
        // Write your code here

        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < t; i++) {
            String[] inputs = scan.nextLine().split(" ");
            int n = Integer.parseInt(inputs[0]);
            int m = Integer.parseInt(inputs[1]);
            String[][] matrix = new String[n][m];
            for (int j = 0; j < n; j++) {
                String[] row = scan.nextLine().split("");
                for (int k = 0; k < m; k++) {
                    matrix[j][k] = row[k];
                }
            }
            boolean ans = checkMatrix(matrix, n, m);
            if (ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean checkMatrix(String[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            if (matrix[i][0].equals("W") || matrix[i][m - 1].equals("W"))
                continue;
            else
                return false;
        }
        for (int i = 0; i < m; i++) {
            if (matrix[0][i].equals("W") || matrix[n - 1][i].equals("W"))
                continue;
            else
                return false;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!matrix[i][j].equals("W"))
                    continue;
                else {
                    if (i == 0 || i == n - 1 || j == 0 || j == m - 1)
                        continue;
                    else {
                        if (matrix[i - 1][j].equals("W") || matrix[i + 1][j].equals("W") || matrix[i][j - 1].equals("W")
                                || matrix[i][j + 1].equals("W"))
                            continue;
                        else
                            return false;
                    }
                }
            }
        }
        return true;
    }
}