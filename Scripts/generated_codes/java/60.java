/*

/**
 *
 * @author shiva
 */
public class chefandguard {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int T=in.nextInt();
        int arr[][]=new int [T][2];
        for(int i=0;i<T;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<T;i++)
        {
            int min, max;
            if(arr[i][0]<arr[i][1])
            {
                 min=arr[i][0];
                 max=arr[i][1];
            }
            else
            {
                min=arr[i][1];
                max=arr[i][0];
            }
            if(min==0)
            {
                min=0;
                max=max*2;
            }
            else
            {
                min=min+1;
                max=max*2;
            }
            System.out.println(min+" "+max);
        }
    }
}