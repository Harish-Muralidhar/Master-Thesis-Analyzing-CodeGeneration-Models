/*

*/

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;

public class dayofweek {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int year = sc.nextInt();
            GregorianCalendar cal = new GregorianCalendar(year, Calendar.JANUARY, 1);
            switch (cal.get(Calendar.DAY_OF_WEEK)) {
                case 1:
                    System.out.println("sunday");
                    break;
                case 2:
                    System.out.println("monday");
                    break;
                case 3:
                    System.out.println("tuesday");
                    break;
                case 4:
                    System.out.println("wednesday");
                    break;
                case 5:
                    System.out.println("thursday");
                    break;
                case 6:
                    System.out.println("friday");
                    break;
                case 7:
                    System.out.println("saturday");
                    break;
            }
        }
    }
}