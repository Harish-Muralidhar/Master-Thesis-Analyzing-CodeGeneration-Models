/*
Subtask 2 (40 points): See the constraints

Solution:
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChefAndOranges {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T>0){
            int N = scan.nextInt();
            int K = scan.nextInt();
            int[] cost = new int[N];
            int[] weight = new int[N];
            for(int i=0;i<N;i++){
                cost[i] = scan.nextInt();
            }
            for(int i=0;i<N;i++){
                weight[i] = scan.nextInt();
            }
            int total=0;
            int temp_cost=0;
            int max=0;
            int index=0;
            while(temp_cost<=K && total<N){
                max=0;
                for(int i=0;i<N;i++){
                    if(max<weight[i]){
                        max = weight[i];
                        index = i;
                    }
                }
                if((temp_cost+cost[index])<=K){
                    temp_cost+=cost[index];
                    weight[index]=0;
                }
                total++;
            }
            System.out.println(max);
            T--;
        }
    }
}