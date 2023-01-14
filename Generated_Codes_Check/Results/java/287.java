/*


*/

import java.util.*;
import java.lang.*;

class Coin_Flip
{
    public static void main (String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0; i<t; i++)
    {
        int g = sc.nextInt();
        for(int j=0; j<g; j++)
        {
            int I = sc.nextInt();
            int N = sc.nextInt();
            int Q = sc.nextInt();
            
            if(N%2 == 0)
            {
                System.out.println(N/2);
            }
            else
            {
                System.out.println((N/2)+1);
            }
        }
    }
    }
}