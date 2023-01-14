
*/

import java.util.Scanner;
class Palindrome {
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
	  int test = in.nextInt();
	  while(test-->0){
		  int num = in.nextInt();
		  int temp = num;
		  int sum=0;
		  while(temp > 0){
			  int rem = temp % 10;
			  sum = sum*10 + rem;
			  temp = temp/10;
		  }
		  if(sum==num){
			  System.out.println("wins");
		  }
		  else{
			  System.out.println("losses");
		  }
	  }
	}
}