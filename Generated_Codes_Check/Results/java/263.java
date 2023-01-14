/*
 */
public class Main_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x - 1][y - 1] = 1;
                arr[y - 1][x - 1] = 1;
            }
            int[] res = new int[n];
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 1) {
                        res[i] += 1;
                    }
                }
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (res[i] == 1) {
                    sum += 1;
                    for (int k = 0; k < n; k++) {
                        if (arr[i][k] == 1) {
                            result[k] = 1;
                        }
                    }
                }
            }
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (result[i] != arr[i][i]) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(sum);
            }
            else {
                System.out.println(-1);
            }
        }
    }
}