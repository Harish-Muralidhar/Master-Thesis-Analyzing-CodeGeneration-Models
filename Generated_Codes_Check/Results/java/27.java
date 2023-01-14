/*

Explanation of Sample test case:

The first two items are purchased at 10% discount while the third item is purchased at no discount.

Total expense = 100*120 + 10*20 + 1200*20 = 12000 + 200 + 21600 = 12000 + 200 + 21600 = 12000 + 200 + 21600 = 12000 + 200 + 21600 = 12000 + 200 + 21600 = 12000 + 200 + 21600 = 12000 + 200 + 21600 = 12000 + 200 + 21600 = 12000.00 + 200.00 + 21600.00 = 12000.00 + 200.00 + 21600.00 = 12000.00 + 200.00 + 21600.00 = 12000.00 + 200.00 + 21600.00 = 12000.00 + 200.00 + 21600.00 = 12000.00 + 200.00 + 21600.00 = 12000.00 + 200.00 + 21600.00 = 12000.00 + 200.00 + 21600.00 = 12000.00 + 200.00 + 21600.00 = 12000.00 + 200.00 + 21600.00 = 12000.00 + 200.00 + 21600.00 = 12000.00 + 200.00 + 21600.00 = 12000.00 + 200.00 + 21600.00
 * @author het
 *
 */
public class Discounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		double sum=0;
		for(int i=0;i<a;i++){
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			sum+=b*c;
			if(b*c>=1000){
				sum = sum*0.9;
			}
			
		}
		
		System.out.println(sum);
	}

}