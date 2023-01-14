/*

Scoring

Subtask #1 (30 points)

1 ≤ T ≤ 100
0 ≤ L ≤ R ≤  100
1 ≤ N ≤  10


Subtask #2 (70 points)

Original Constraints

Time Limit: 1.0 sec(s) for each input file.
Memory Limit: 256 MB
Source Limit: 1024 KB
Marking Scheme: Marks are awarded if any testcase passes
Allowed Languages: Java


*/

/*
import java.util.*;

class Bob{
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int p=0;p<t;p++){
		    int l = sc.nextInt();
		    int r= sc.nextInt();
		    int n= sc.nextInt();
		    int c=0;
		    for(int i=l;i<=r;i++){
		        if(isGood(i)){
		            c++;
		        }
		        if(c==n){
		            System.out.print(i+" ");
		            for(int j=0;j<i;j++){
		                System.out.print(".");
		            }
		            System.out.println();
		            break;
		        }
		        
		    }
		    if(c!=n){
		        System.out.println(-1);
		    }
		}

	}
	
	public static boolean isGood(int x){
	    int[] d = new int[Integer.toString(x).length()];
	    for(int i=0;i<d.length;i++){
	        d[i]=x%10;
	        x=x/10;
	    }
	    for(int i=0;i<d.length;i++){
	        if(d[i]==4){
	            return false;
	        }
	        if(i<d.length-1 && d[i]==2 && d[i+1]==3){
	            return false;
	        }
	    }
	    return true;
	}
}
*/