/*


*/

import java.util.Scanner;

class TcsCodevita
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int j=sc.nextInt();
		int s=sc.nextInt();
		int m=sc.nextInt();
		
		if((m-j)<s)
		{
			System.out.println("Unlucky Chef");
		}
		else
		{
			System.out.println("Lucky Chef");
		}
	}
}