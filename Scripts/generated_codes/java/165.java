/*
69

Sample Input 4
10 10 3 3 2

Sample Output 4
0.75270854727450

Sample Input 5
5 5 3 3 4

Sample Output 5
0.99978860954727

Sample Input 6
50 50 3 3 4

Sample Output 6
0.97724790156853

Sample Input 7
5 5 3 3 5

Sample Output 7
0.99978860954727

Sample Input 8
58 58 8 8 5

Sample Output 8
0.99963901997948

 */

package CodeForces;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class CodeForces_Shindanin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int VA = input.nextInt();
        int VB = input.nextInt();
        int SA = input.nextInt();
        int SB = input.nextInt();
        int MA = input.nextInt();
        int N = 1000;
        //double[][][] dp = new double[VA + 1][VB + 1][MA + 1];
        //int result = 0;
        //int total = 0;
        //for (int i = 0; i < N; i++) {
        //    result += getResult(VA, VB, SA, SB, MA, dp);
        //    total++;
        //}
        //double ans = (double) result / (double) total;
        //System.out.println(ans);
        double ans = getResult(VA, VB, SA, SB, MA);
        BigDecimal bd = new BigDecimal(ans);
        bd = bd.round(new MathContext(6));
        System.out.println(bd.toString());
    }

    public static double getResult(int VA, int VB, int SA, int SB, int MA) {
        double result = 0;
        if (MA == 0) {
            result = getResult2(VA, VB, SA, SB);
        } else {
            double ans = 0;
            for (int i = 0; i <= MA; i++) {
                ans += getResult2(VA, VB, SA, SB) * (i + 1) / (double) (MA + 1);
            }
            result = ans;
        }
        return result;
    }

    public static double getResult2(int VA, int VB, int SA, int SB) {
        double result = 0;
        if(VA <= 0) {
            result = 0;
        } else if(VB <= 0) {
            result = 1;
        } else if(VA <= SB && VB <= SA) {
            result = 0.5;
        } else if(VA <= SB) {
            result = 1;
        } else if(VB <= SA) {
            result = 0;
        } else {
            result = (getResult2(VA - 1, VB - 1, SA, SB) * 0.5);
        }
        return result;
    }
}