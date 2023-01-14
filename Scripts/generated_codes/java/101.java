
------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int b[]=new int[n];
		    int i,j;
		    int a[][]=new int[n][n];
		    int c[]=new int[n];
		    int d[]=new int[n];
		    for(i=0;i<n;i++){
		        b[i]=sc.nextInt();
		        c[i]=i+1;
		        d[i]=i+1;
		    }
		    for(i=0;i<n;i++)
		    {
		        for(j=0;j<n;j++){
		            if(c[i]<=d[j])
		            a[i][j]=1;
		        }
		    }
		   
		    int dp[][]=new int[n][n];
		    for(i=0;i<n;i++)
		    {
		        for(j=0;j<n;j++)
		        {
		            if(a[i][j]==1){
		                dp[i][j]=1;
		            }
		        }
		    }
		   
		    int m=1000000007;
		    BigInteger num=new BigInteger("1");
		    BigInteger pow=new BigInteger("1");
		    int flag=0;
		    for(i=0;i<n;i++){
		        for(j=0;j<n;j++){
		            if(dp[i][j]==1){
		                if(b[i]>0)
		                {
		                b[i]-=1;
		                num=num.multiply(pow);
		                num=num.mod(BigInteger.valueOf(m));
		                }
		                else
		                {
		                    flag=1;
		                }
		            }
		        }
		    }
		    if(flag==1)
		    System.out.println("0");
		    else
		    System.out.println(num);
		}
	}
}