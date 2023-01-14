/*

*********************************************
**/

import java.util.*;
class CodechefOrGroups{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            int[][] dp=new int[n+1][n+1];
            for(int i=2;i<=n;i++){
                for(int j=i-1;j>=1;j--){
                    int x=Integer.MIN_VALUE;
                    for(int k=j;k<i;k++){
                        x=Math.max(x,a[k]);
                    }
                    dp[j][i]=x;
                }
            }

            int[] temp=new int[n+1];
            for(int i=1;i<=n;i++){
                temp[i]=Integer.MAX_VALUE;
            }

            temp[1]=dp[1][1];
            for(int i=2;i<=k;i++){
                int[] temp1=new int[n+1];
                for(int j=1;j<=n;j++){
                    temp1[j]=Integer.MAX_VALUE;
                }
                for(int j=i;j<=n;j++){
                    for(int l=i-1;l<=j-1;l++){
                        temp1[j]=Math.min(temp1[j],temp[l]+dp[l+1][j]);
                    }
                }
                temp=temp1;
            }
            System.out.println(temp[n]);
        }
    }
}