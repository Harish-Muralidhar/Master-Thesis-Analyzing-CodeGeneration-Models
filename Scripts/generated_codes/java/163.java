/*

*/
import java.util.*;
public class Chef_and_the_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++)
                ar[i] = sc.nextInt();
            for(int i=0;i<m;i++)
            {
                int ar1[]=new int[2*n]; 
                for(int j=0;j<2*n;j++)
                    ar1[j]=-1;
                int l=0;
                for(int j=0;j<n;j++)
                {
                    ar1[l]=ar[j];
                    if(l+1<2*n)
                    {
                        ar1[l+1]=ar[j]+ar[j+1];
                        l=l+2;
                    }
                }
                ar=new int[2*n];
                for(int k=0;k<2*n;k++)
                    ar[k]=ar1[k];
            }
            int sum=0;
            for(int i=x-1;i<y;i++)
                sum=sum+ar[i];
            System.out.println(sum);
        }
    }
}