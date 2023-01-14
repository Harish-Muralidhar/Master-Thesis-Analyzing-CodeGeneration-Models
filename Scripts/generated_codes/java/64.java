/*


*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimumSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if(arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println(2*min);
        }
    }
}