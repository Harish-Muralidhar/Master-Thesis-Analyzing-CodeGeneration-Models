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
        for(int inc=0;inc<t;inc++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            Arrays.sort(arr);
            int count =0;
            long min=Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    long val = Math.abs(arr[i]+arr[j]-k);
                    if(val<min){
                        min=val;
                        count=1;
                    }
                    else if(val==min){
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
            System.out.println(min+" "+count);
        }
    }
}