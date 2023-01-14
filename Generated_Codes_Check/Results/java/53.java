/*

 */


public class LehaAndTheGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer T = sc.nextInt();
        for (int j = 0; j < T; j++) {
            Integer N = sc.nextInt();
            Integer M = sc.nextInt();
            Integer[][] arr = new Integer[N][M];
            for (int i = 0; i < N; i++) {
                for (int k = 0; k < M; k++) {
                    arr[i][k] = 0;
                }
            }
        }

    }
}