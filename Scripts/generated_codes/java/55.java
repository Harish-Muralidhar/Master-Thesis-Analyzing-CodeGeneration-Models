/*
Explanation

In the first case, 331 is not a palindrome as reverse of 331 is 133.
In the second case, 666 is a palindrome and so the player wins.

*/
import java.util.*;
public class Hello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    String n = String.valueOf(sc.nextInt());
		    String rev = "";
		    for(int j=n.length()-1;j>=0;j--){
		        rev += n.charAt(j);
		    }
		    System.out.println(n.equals(rev)?"wins":"losses");
		}
		sc.close();
	}
}