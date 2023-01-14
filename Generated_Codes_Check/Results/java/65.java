/*

Explanation

Test Case #1
For LS = 5, B = 4.0, if LS is vertical then RS is also vertical and the distance between both sides is 4.
So RS = 4.0.

Test Case #2
For LS = 12, B = 10.0, if LS is vertical then RS = 10.0.

Test Case #3
For LS = 20, B = 10.0, if RS is vertical then LS = 10.0.
 */

//code

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		
		Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++){
            int B = sc.nextInt();
            int LS = sc.nextInt();
            
            //where LS is the hypotenuse
            double RSmin = Math.sqrt((LS*LS)-(B*B));
            double RSmax = Math.sqrt((LS*LS)+(B*B));
            
            System.out.println(RSmin+" "+RSmax);
            
            
        }
	}
}