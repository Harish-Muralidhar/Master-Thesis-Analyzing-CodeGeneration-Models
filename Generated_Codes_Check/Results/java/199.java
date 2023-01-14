/*


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    if(n==2){
		        System.out.println("y y n");
		    }
		    else if(n==1){
		        System.out.println("y y y");
		    }
		    else{
		        System.out.println("n y y");
		    }
		}
	}
}