/*


*/



import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		int[]a = new int[n];
		
		for(int i = 0; i < n; i++)
		    a[i] = sc.nextInt();
		
		while(q-- != 0)
		{
		    int qt = sc.nextInt();
		    
		    if(qt == 1)
		    {
		        int x = sc.nextInt() - 1;
		        int y = sc.nextInt() - 1;
		        int v = sc.nextInt();
		        
		        for (int i = x; i <= y; i++)
		        {
		            a[i] += v;
		            a[i] %= 1000000007;
		        }
		    }
		    else if(qt == 2)
		    {
		        int x = sc.nextInt() - 1;
		        int y = sc.nextInt() - 1;
		        int v = sc.nextInt();
		        
		        for (int i = x; i <= y; i++)
		        {
		            a[i] *= v;
		            a[i] %= 1000000007;
		        }
		    }
		    else if(qt == 3)
		    {
		        int x = sc.nextInt() - 1;
		        int y = sc.nextInt() - 1;
		        int v = sc.nextInt();
		        
		        for (int i = x; i <= y; i++)
		            a[i] = v;
		    }
		    else if(qt == 4)
		    {
		        int x = sc.nextInt() - 1;
		        int y = sc.nextInt() - 1;
		        
		        long sum = 0;
		        
		        for (int i = x; i <= y; i++)
		            sum += a[i];
		            
		        sum %= 1000000007;
		        
		        System.out.println(sum);
		    }
		}
		
	}
}