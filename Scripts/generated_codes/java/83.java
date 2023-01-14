/*
*/

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s;
        String[] str;
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            str = new String[n];
            for(int i = 0; i < n; i++)
            {
                str[i] = sc.next();
            }
            s = concat(str);
            System.out.println(s.length()-lps(s));
            t--;
        }
    }
    static int lps(String s)
    {
        int n = s.length();
        int i, j, cl;
        int L[][] = new int[n][n];
        for (i = 0; i < n; i++)
            L[i][i] = 1;
        for (cl=2; cl<=n; cl++)
        {
            for (i=0; i<n-cl+1; i++)
            {
                j = i+cl-1;
                if (s.charAt(i) == s.charAt(j) && cl == 2)
                    L[i][j] = 2;
                else if (s.charAt(i) == s.charAt(j))
                    L[i][j] = L[i+1][j-1] + 2;
                else
                    L[i][j] = max(L[i][j-1], L[i+1][j]);
            }
        }
        return L[0][n-1];
    }
    static int max (int x, int y)
    {
        return (x > y)? x : y;
    }
    static String concat(String[] str)
    {
        String s = "";
        for(int i = 0; i < str.length; i++)
        {
            s = s + str[i];
        }
        return s;
    }
}