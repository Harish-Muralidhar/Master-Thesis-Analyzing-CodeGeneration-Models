
A:

<code>import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 0; t &lt; test; t++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            String a[] = new String[r];
            int monster[][] = new int[r][c];
            for (int i = 0; i &lt; r; i++) {
                a[i] = sc.next();
                for (int j = 0; j &lt; c; j++) {
                    if (a[i].charAt(j) == '^') {
                        monster[i][j] = 1;
                    } else if (a[i].charAt(j) == '#') {
                        monster[i][j] = -1;
                    } else {
                        monster[i][j] = 0;
                    }
                }
            }
            int k = 0;
            for (int i = 0; i &lt; r; i++) {
                for (int j = 0; j &lt; c; j++) {
                    if (monster[i][j] == 1) {
                        k++;
                    }
                }
            }
            if (k % 2 == 0) {
                System.out.println("Kirito");
            } else {
                System.out.println("Asuna");
            }
        }
    }
}
</code>
