/*

*/

public class CodeArtOnline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int t = 0; t < testCases; t++) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            sc.nextLine();

            char[][] grid = new char[rows][cols];

            for (int i = 0; i < rows; i++) {
                grid[i] = sc.nextLine().toCharArray();
            }

            int[][] left = new int[rows][cols];
            int[][] right = new int[rows][cols];
            int[][] top = new int[rows][cols];
            int[][] bottom = new int[rows][cols];
            int[][] min = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == '#') continue;
                    int l = j, r = j, t = i, b = i;
                    while (l > 0 && grid[i][l - 1] == '^') {
                        l--;
                    }
                    while (r < cols - 1 && grid[i][r + 1] == '^') {
                        r++;
                    }
                    while (t > 0 && grid[t - 1][j] == '^') {
                        t--;
                    }
                    while (b < rows - 1 && grid[b + 1][j] == '^') {
                        b++;
                    }
                    left[i][j] = j - l;
                    right[i][j] = r - j;
                    top[i][j] = i - t;
                    bottom[i][j] = b - i;
                    int minVal = Math.min(left[i][j], right[i][j]);
                    minVal = Math.min(minVal, top[i][j]);
                    minVal = Math.min(minVal, bottom[i][j]);
                    min[i][j] = minVal;
                }
            }

            int[] primes = getPrimesTill(51);
            int count = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == '#' || min[i][j] == 0) continue;
                    for (int p : primes) {
                        if (p <= min[i][j]) {
                            count++;
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static int[] getPrimesTill(int n) {
        int[] primes = new int[n + 1];
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes[count++] = i;
                for (int j = i * 2; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return Arrays.copyOfRange(primes, 0, count);
    }
}