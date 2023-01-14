/*
*/
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        int k=sc.nextInt();
	        int[] a=new int[n];
	        int count=0;
	       
	        for(int j=0;j<n;j++){
	            a[j]=sc.nextInt();
	            if(a[j]%2==0)
	            count++;
	        }
	        if(count==n)
	        System.out.println("NO");
	        else
	        System.out.println("YES");
	    }
	}
}