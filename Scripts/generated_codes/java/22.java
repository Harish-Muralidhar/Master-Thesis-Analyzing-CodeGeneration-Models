"""
"""

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstDigit, lastDigit;
        while (n-->0){
            int num = sc.nextInt();
            firstDigit=num%10;
            while(num>9)
            {
                num=num/10;
            }
            lastDigit=num;
            System.out.println(firstDigit+lastDigit);
        }
    }
}