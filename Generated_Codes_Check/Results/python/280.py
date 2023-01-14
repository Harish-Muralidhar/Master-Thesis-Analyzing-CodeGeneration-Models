 For test case 2.
 
 Chef can choose {2} to make 2.
 Mom can choose {1,2} to make 3.
 Chef can choose {4} to make 4.
 Mom can choose {1,4} to make 5.
 Chef cannot make 6 out of the numbers on the table.
 
 So,Mom loses and Chef wins.
 
 

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        
        while(testCase > 0){
            
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] a = new int[k];
            for(int i=0;i<k;i++){
                a[i] = sc.nextInt();
            }
            
            System.out.println(win(a,n,k));
            testCase--;
            
        }
        
    }
    
    public static String win(int[] a,int n,int k){
        
        Arrays.sort(a);
        int count = 0;
        for(int i=0;i<k;i++){
            if(a[i] <= k) count++;
        }
        
        if(count%2 == 0){
            return "Mom";
        }else{
            return "Chef";
        }
    }
}