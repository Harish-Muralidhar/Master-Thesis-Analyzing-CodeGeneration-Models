/*

*/

import java.util.*;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] array = new int[N];
        
        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }
        
        //System.out.println(Arrays.toString(array));
        int sum = 1;
        
        for(int i = 0; i < N; i++){
            int count = 0;
            for(int j = i; j < N; j++){
                if(array[i] > array[j]){
                    count++;
                }
            }
            sum = (sum%1000000007*(count*count - count + 1)%1000000007)%1000000007;
        }
        
        System.out.println(sum);
    }
}