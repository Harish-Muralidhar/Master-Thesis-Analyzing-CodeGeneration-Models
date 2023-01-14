/*
*/
import java.util.Scanner;
public class Q9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            if(n<10)
            {
                System.out.println("What an obedient servant you are!");
            }
            else
            {
                System.out.println("-1");
            }
        }
        sc.close();
    }
}