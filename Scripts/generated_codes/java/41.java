/*


*/
import java.util.Scanner;
class ATMProblem
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int withdrawAmount = sc.nextInt();
		double availableBalance = sc.nextDouble();
		double balance = availableBalance;
		if(withdrawAmount % 5 == 0)
		{
			if(withdrawAmount + 0.50 <= availableBalance)
			{
				balance = availableBalance - withdrawAmount - 0.50; 
			}
		}
		System.out.println(balance);
	}
}