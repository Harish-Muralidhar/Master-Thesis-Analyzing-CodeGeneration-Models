/*
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int sum = 0;
            for(int i=k;i<n-k;i++){
                sum+=arr[i];
            }
            double ans = (double)(sum)/(n-2*k);
            System.out.printf("%.6f",ans);
            System.out.println();
            t--;
        }
        sc.close();
	}
}