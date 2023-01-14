/*


Explanation

In the beginning, the number of berries on the bushes is (2, 1, 1, 2, 1, 2, 2, 2).
Then the amount of berries on the second bush changes to 2.
Then the amount of berries on the bushes (at the end of the first request) is (2, 2, 1, 2, 1, 2, 2, 2).
Then the number of ways to divide all the berries from the first to the eighth bush is the answer to the first request.
Then the number of ways to divide all the berries from the fifth to the seventh bush is the answer to the second request.
In the third request, only the third bush is asked. As you can't divide any amount of berries fairly between zero people, the answer is zero.
In the fourth request, you also can't divide any amount of berries fairly between zero people, so the answer is zero.

*/

import java.util.*;
import java.io.*;
import java.math.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] fruit = new int[n];
        for(int i=0;i<n;i++){
            fruit[i] = Integer.parseInt(input[i]);
        }
        int q = Integer.parseInt(br.readLine());
        while(q-->0){
            String[] input1 = br.readLine().split(" ");
            int choice = Integer.parseInt(input1[0]);
            int a = Integer.parseInt(input1[1]);
            int b = Integer.parseInt(input1[2]);
            if(choice == 1){
                System.out.println(calculate(fruit,a-1,b-1));
            }
            else{
                fruit[a-1] = b;
            }
        }
    }
    
    private static int calculate(int[] fruit,int left,int right){
        int[] dp = new int[right-left+1];
        int[] tree = new int[right-left+1];
        dp[0] = 1;
        tree[0] = fruit[left];
        for(int i=1;i<dp.length;i++){
            dp[i] = dp[i] + dp[i-1];
            if(fruit[i+left] - fruit[i+left-1] == 1){
                dp[i] = dp[i] + tree[i-1];
            }
            dp[i] = dp[i]%3046201;
            tree[i] = tree[i-1] + dp[i];
        }
        return dp[right-left];
    }
}