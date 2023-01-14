/*

*/

import java.util.Scanner;

public class ChefzaAndTheSweetRolls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		while(test>0) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int count = 0;
			
			while(A!=B) {
				
				if(A < B) {
					
					A = 2*A;
					count += 1;
				}
				else if(A > B) {
					
					int temp = A;
					
					if(A%2==0) {
						
						A = A/2;
						count += 1;
					}
					else {
						
						A = (temp-1)/2;
						count += 1;
					}
				}
				
			}
			
			System.out.println(count);
			
			test -= 1;
		}

	}

}