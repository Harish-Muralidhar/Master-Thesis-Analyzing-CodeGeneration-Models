/*

************************************************************************/



/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 */

import java.io.*;
import java.util.*;

public class CandidateCode {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int t=0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            b[i] = a[i];
        }
        for(int i = 0; i < n; i++){
            for(int j = 2; j <= a[i]; j++){
                while(a[i] % j == 0){
                    a[i] /= j;
                    t++;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(t);
            t = 0;
        }
    }
}