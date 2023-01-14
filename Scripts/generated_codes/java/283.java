/*

Input:
2
2 3 2
2 3 1
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
0 0 0
3 2 3
2 1 1
0 0
1 0
1 0
1 0
0 0
0 0
0 0
0 0
0 0
0 0
0 0
0 0

Output:
3
5

Explanation:
For the first test case we will repaint 1^st cell with color 2, and 2^nd cell with color 3.
We will pay 0 for the first repainting and 1 for the second. We receive:
0 (1^st cell - 2^nd color) +
1 (2^nd cell - 3^rd color) = 1 points.
For the second test case we will repaint 1^st cell with color 1, and 2^nd cell with color 2.
We will pay 0 for the first repainting and 0 for the second. We receive:
2 (1^st cell - 1^st color) +
1 (2^nd cell - 2^nd color) = 3 points.
*/

/*
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0)
        {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            int k = Integer.parseInt(line[2]);
            
            line = br.readLine().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = Integer.parseInt(line[i]);
            }
            
            int[][] b = new int[n][m];
            for (int i = 0; i < n; i++)
            {
                line = br.readLine().split(" ");
                for (int j = 0; j < m; j++)
                {
                    b[i][j] = Integer.parseInt(line[j]);
                }
            }
            
            int[][] c = new int[n][m];
            for (int i = 0; i < n; i++)
            {
                line = br.readLine().split(" ");
                for (int j = 0; j < m; j++)
                {
                    c[i][j] = Integer.parseInt(line[j]);
                }
            }
            
            System.out.println(solve(n, m, k, a, b, c));
        }
    }
    
    private static int solve(int n, int m, int k, int[] a, int[][] b, int[][] c)
    {
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                dp[i][j] = b[i][j] - c[i][j];
            }
        }
        
        for (int i = 0; i < k; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int l = 0; l < m; l++)
                {
                    if (a[j] != l)
                    {
                        dp[j][l] = Math.max(dp[j][l], b[j][l] - c[j][l]);
                        for (int p = 0; p < n; p++)
                        {
                            for (int q = 0; q < m; q++)
                            {
                                dp[j][l] = Math.max(dp[j][l], dp[p][q] + b[j][l] - c[p][q] - c[j][l]);
                            }
                        }
                    }
                }
            }
        }
        
        int max = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                max = Math.max(max, dp[i][j]);
            }
        }
        
        return max;
    }
}
*/

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0)
        {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            int k = Integer.parseInt(line[2]);
            
            line = br.readLine().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = Integer.parseInt(line[i]);
            }
            
            int[][] b = new int[n][m];
            for (int i = 0; i < n; i++)
            {
                line = br.readLine().split(" ");
                for (int j = 0; j < m; j++)
                {
                    b[i][j] = Integer.parseInt(line[j]);
                }
            }
            
            int[][] c = new int[n][m];
            for (int i = 0; i < n; i++)
            {
                line = br.readLine().split(" ");
                for (int j = 0; j < m; j++)
                {
                    c[i][j] = Integer.parseInt(line[j]);
                }
            }
            
            System.out.println(solve(n, m, k, a, b, c));
        }
    }
    
    private static int solve(int n, int m, int k, int[] a, int[][] b, int[][] c)
    {
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                dp[i][j] = b[i][j] - c[i][j];
            }
        }
        
        for (int i = 0; i < k; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int l = 0; l < m; l++)
                {
                    if (a[j] != l)
                    {
                        int max = b[j][l] - c[j][l];
                        for (int p = 0; p < n; p++)
                        {
                            for (int q = 0; q < m; q++)
                            {
                                max = Math.max(max, dp[p][q] + b[j][l] - c[p][q] - c[j][l]);
                            }
                        }
                        dp[j][l] = max;
                    }
                }
            }
        }
        
        int max = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                max = Math.max(max, dp[i][j]);
            }
        }
        
        return max;
    }
}