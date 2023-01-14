/*
 */

package mar16;

import java.util.Scanner;


public class ChefSegment {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t>0){
            long X = sc.nextLong();
            long K = sc.nextLong();
            long S = X;
            while(K>1){
                S = S/2;
                K--;
            } 
            double res = (double)S;
            if(K!=1) res = res + 0.5;
            System.out.println(res);
            t--;
        }
    }
}