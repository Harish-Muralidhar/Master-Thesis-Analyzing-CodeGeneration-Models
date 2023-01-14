/*
For second query, 2 is connected to 3 by an edge. Hence distance 1.
For third query, 4 is connected to 3 by a path of length 3 (4-2-3). Hence distance 3.

*/

import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException{
		// Write your code here
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        while(n-->0)
        {
            st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int count=0;
            while(a!=b)
            {
                if(a>b)
                    a/=2;
                else
                    b/=2;
                count++;
            }
            System.out.println(count);
        }
		
	}

}