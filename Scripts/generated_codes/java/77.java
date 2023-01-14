/*

*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String x = sc.next();
            String y = sc.next();
            boolean b = true;
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == '?' || y.charAt(i) == '?' || x.charAt(i) == y.charAt(i)) continue;
                else {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}