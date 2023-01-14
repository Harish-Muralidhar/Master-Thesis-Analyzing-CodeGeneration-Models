/*



*/
import java.util.*;
public class triangleValidity{
	
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int cases=scan.nextInt();
		int a,b,c;
		for(int i=0;i<cases;i++){
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			if((a<40 || a>180) || (b<40 || b>180) || (c<40 || c>180))
				System.out.println("NO");
			else if(a+b+c!=180)
				System.out.println("NO");
			else
				System.out.println("YES");			
		}
		
	}
}