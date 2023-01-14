/*
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindLongestAlternatingSubarray{
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Integer> resultList = new ArrayList<Integer>();
        
        for(int i = 0; i<t; i++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j<n; j++){
                arr[j] = in.nextInt();
            }
            int[] result = findLongestAlternatingSubarray(arr);
            for(int j = 0; j<result.length; j++){
                System.out.print(result[j]+" ");
            }
            System.out.println();
        }
    }
    
    public static int[] findLongestAlternatingSubarray(int[] nums){
        int len = nums.length;
        if(len == 0) return new int[]{};
        int[] result = new int[len];
        result[0] = 1;
        
        for(int i = 1; i<len; i++){
            if(nums[i]*nums[i-1]<0) result[i] = result[i-1]+1;
            else result[i] = 1;
        }
        
        return result;
    }
}