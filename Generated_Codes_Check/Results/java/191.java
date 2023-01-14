/*


*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Alethiometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String maxnum = "";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 65 && sb.charAt(i) <= 90) {
                sb.setCharAt(i, '9');
            }
        }
        maxnum = sb.toString();
        System.out.println(maxnum);
    }
}