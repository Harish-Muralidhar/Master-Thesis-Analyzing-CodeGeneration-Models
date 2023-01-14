/*

You can safely assume that there will be no leading spaces in the name of the menu.

*/

import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// N is the number of menus
		int numOfMenus = Integer.parseInt(scanner.nextLine());
		
		String[] menus = new String[numOfMenus];
		
		// Fill the array with menus
		for (int i = 0; i < numOfMenus; i++) {
			menus[i] = scanner.nextLine();
		}
		
		int count = 0;
		
		for (int i = 0; i < menus.length; i++) {
			int price = getPrice(menus[i]);
			int[] digits = countDigits(price);
			
			if (digits[8] < digits[5] || digits[5] < digits[3]) continue;
			
			for (int j = 0; j < digits.length; j++) {
				if (j != 8 && j != 5 && j != 3 && digits[j] > 0) continue;
			}
			
			count++;
		}
		
		System.out.println(count);
	}
	
	// Counts the number of all digits in a number and returns an array,
	// where the digit is the index and the number is the value.
	// E.g. if the number is 858, the array will be [0, 0, 0, 0, 0, 0, 0, 1, 2, 0, ...]
	private static int[] countDigits(int number) {
		int[] digits = new int[10];
		
		while (number > 0) {
			int digit = number % 10;
			digits[digit]++;
			number /= 10;
		}
		
		return digits;
	}
	
	// Gets the price from a menu string
	private static int getPrice(String menu) {
		int space = menu.lastIndexOf(" ");
		int price = Integer.parseInt(menu.substring(space + 1));
		
		return price;
	}
}