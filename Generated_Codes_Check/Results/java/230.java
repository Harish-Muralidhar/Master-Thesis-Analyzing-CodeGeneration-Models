/*
*/
import java.io.*;
import java.util.*;
class bagofballoons
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split("\\s+");
            int R = Integer.parseInt(st[0]);
            int G = Integer.parseInt(st[1]);
            int B = Integer.parseInt(st[2]);
            int K = Integer.parseInt(read.readLine());
            int count = 0;
            if(R >= K)
            {
                count++;
            }
            if(G >= K)
            {
                count++;
            }
            if(B >= K)
            {
                count++;
            }
            if(count == 3)
            {
                System.out.println(K*3);
            }
            else if(count == 2)
            {
                System.out.println(K*2);
            }
            else if(count == 1)
            {
                System.out.println(K);
            }
            else if(count == 0)
            {
                System.out.println(0);
            }
        }
    }
}