/*

Example 3


Input:
12 12
....$........
............D
............D
............D
............D
............D
...........D.
...........D.
.......D.....
.......D.....
.......D.....
@............

Output:
5
 */
/**
 *
 * @author shivam
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int chef = 0, spoon = 0, monster = 0, min = 0;
        int[] ch = new int[2];
        int[] sp = new int[2];
        int[] mon = new int[2];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                char chr = str.charAt(j);
                if (chr == '@') {
                    chef++;
                    ch[0] = i;
                    ch[1] = j;
                } else if (chr == '$') {
                    spoon++;
                    sp[0] = i;
                    sp[1] = j;
                } else if (chr == 'D') {
                    monster++;
                    mon[0] = i;
                    mon[1] = j;
                }
            }
        }
        if (chef == 1 && spoon == 1 && monster == 1) {
            min = Math.abs(mon[0] - ch[0]) + Math.abs(mon[1] - ch[1]);
            System.out.println(min);
        }
    }
}