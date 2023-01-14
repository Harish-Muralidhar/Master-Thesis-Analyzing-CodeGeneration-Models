/*
*/
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int[][]arr = new int[N][2];
            for(int i=0;i<N;i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            int ans = 0;
            for(int i=0;i<N;i++){
                int min = arr[i][0];
                int minI = i;
                for(int j=i+1;j<N;j++){
                    if(arr[j][0]<min){
                        min = arr[j][0];
                        minI = j;
                    }
                }
                if(i!=minI){
                    int x = arr[i][0];
                    int y = arr[i][1];
                    arr[i][0] = arr[minI][0];
                    arr[i][1] = arr[minI][1];
                    arr[minI][0] = x;
                    arr[minI][1] = y;
                }
            }
            int[]nums = new int[N];
            for(int i=0;i<N;i++){
                nums[i] = i+1;
            }
            for(int i=0;i<N;i++){
                for(int j=i+1;j<N;j++){
                    int x = arr[i][1];
                    int y = arr[j][1];
                    if(y<x){
                        int temp = arr[i][0];
                        arr[i][0] = arr[j][0];
                        arr[j][0] = temp;
                        
                        temp = arr[i][1];
                        arr[i][1] = arr[j][1];
                        arr[j][1] = temp;
                        
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
            for(int i=0;i<N;i++){
                ans = ans ^ nums[i];
            }
            System.out.println(ans);
        }
    }
}