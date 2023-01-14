/*

Time Limit:	1.0 sec(s) for each input file.
Memory Limit:	256 MB
Source Limit:	1024 KB
Marking Scheme:	Marks are awarded if any testcase passes.
Allowed Languages:	Java, Java 8
*/

/*
 * IMPORTANT:
 * Read the problem carefully before starting to work on it.
 * An algorithm that uses recursive calls must contain at least one condition to terminate.
 * Use the option "Show Input/Output Code " just to make sure you are getting the input and output in the proper format.
 * For more information on Java, refer to the online resources, such as Java docs, available at https://docs.oracle.com/javase/8/docs/.
 * Do not use any compiler-specific optimizations.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

class HashFunction 
{
	public static long result;
	public static long hash(int A, int E, long V)
	{
		if(A == 0 && E == 0)
		{
			return 0;
		}
		if(A+E < V)
		{
			return 0;
		}
		if(A == 0)
		{
			return hash(0, E-1, V);
		}
		if(E == 0)
		{
			return hash(A-1, 0, V-A);
		}
		return hash(A-1, E, V-A) + hash(A, E-1, V);
	}
	
    public static void main(String args[] ) throws Exception 
    {
    	// Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++)
        {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			long V = Long.parseLong(st.nextToken());
			result = hash(A, E, V);
			System.out.println(result);
        }

        //Scanner
        /*Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i=0; i<T; i++)
        {
			int A = s.nextInt();
			int E = s.nextInt();
			long V = s.nextLong();
			result = hash(A, E, V);
			System.out.println(result);
        }*/

    }
}