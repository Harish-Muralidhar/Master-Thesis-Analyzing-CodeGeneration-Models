/*
*/
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();
            int[] arr = new int[k];
            for(int i = 0; i < k; i++){
                int n = sc.nextInt();
                int temp = 0;
                for(int j = 0; j < n; j++){
                    int x = sc.nextInt();
                    temp += x;
                }
                if(temp % 2 == 0){
                    arr[i] = 1;
                }
            }
            if(arr[0] == 0){
                System.out.println("DON'T PLAY");
            }
            else{
                boolean ans = false;
                for(int i = 0; i < k; i++){
                    if(arr[i] == 0){
                        ans = true;
                    }
                }
                if(!ans){
                    System.out.println("DON'T PLAY");
                }
                else{
                    System.out.println("ODD");
                }
            }
        }
    }
}