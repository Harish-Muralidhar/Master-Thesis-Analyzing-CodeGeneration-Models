/*


Test 2 : Chef will make 2 moves : pick up both 4 and 2, remove the larger one (4), incurring a cost of 2; pick up both the remaining elements (2 and 5), remove the larger one (5), incurring a cost equal to the smaller one (2). Hence the total cost incurred = 2 + 2 = 4.

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i = 0; i < n; i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    int ans = a[0];
		    for(int i = 1; i < n; i++)
		    {
		        ans = ans ^ a[i];
		    }
		    System.out.println(ans);
		}
	}
}