/*


*/
import java.util.*;
class ChefAndColorfulHouse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			String str = sc.next();
			System.out.println(minPaint(str,n));
		}
	}
	static int minPaint(String str, int n){
		int count=0,r=0,g=0,b=0;
		for(int i=0;i<n;i++){
			if(str.charAt(i)=='R'){
				r++;
			}else if(str.charAt(i)=='G'){
				g++;
			}else{
				b++;
			}
		}
		if(r>0 && g>0 && b>0){
			return n-Math.max(r,Math.max(g,b));
		}else{
			return n-Math.max(r,Math.max(g,b));
		}
	}
}