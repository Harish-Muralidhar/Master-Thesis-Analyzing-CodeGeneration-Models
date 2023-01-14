/*

Explanation

In the first test case, the Chef is at 0,1, the head server is at 0,0 and the sous-chef is at 1,0. The distance between every pair is at most 1, so they can all communicate.


In the second test case, the Chef is at 0,1, the head server is at 0,0 and the sous-chef is at 1,0. The distance between every pair is at most 2, so they can all communicate.


In the third test case, the Chef is at 0,0, the head server is at 0,2 and the sous-chef is at 2,1. Although the Chef can communicate directly with the head server, and the head server can communicate directly with the sous-chef, the Chef is too far away from the sous-chef to communicate directly. They cannot communicate indirectly either because no other transceiver is close enough to both the Chef and the sous-chef.


 */

import java.util.*;

public class ChefAndHisStaff {

    static Scanner s = new Scanner(System.in);
    static int MAX = 5000;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {1, 0, -1, 1, -1, 1, 0, -1};

    public static void main(String[] args) {
        int T = s.nextInt();
        while (T-- > 0) {
            int r = s.nextInt();
            int fx = s.nextInt();
            int fy = s.nextInt();
            int sx = s.nextInt();
            int sy = s.nextInt();
            int tx = s.nextInt();
            int ty = s.nextInt();

            double d1 = Math.sqrt(Math.pow(Math.abs(fx - sx), 2) + Math.pow(Math.abs(fy - sy), 2));
            double d2 = Math.sqrt(Math.pow(Math.abs(sx - tx), 2) + Math.pow(Math.abs(sy - ty), 2));
            double d3 = Math.sqrt(Math.pow(Math.abs(tx - fx), 2) + Math.pow(Math.abs(ty - fy), 2));

            if (d1 <= r && d2 <= r || d1 <= r && d3 <= r || d2 <= r && d3 <= r) {
                System.out.println("yes");
            } else if (d1 > r && d2 > r) {
                if (d3 <= r) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else if (d1 > r && d3 > r) {
                if (d2 <= r) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else if (d2 > r && d3 > r) {
                if (d1 <= r) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}