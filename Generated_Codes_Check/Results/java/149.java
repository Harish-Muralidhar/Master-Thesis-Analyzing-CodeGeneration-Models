Explanation
Example case 1. Chef can swap the tags 1 and 4 and buy the ingredients 1 and 2 at the cost of 2+3=5.

Solution:
import java.io.*;
import java.util.*;
 
public class Main{
	
	BufferedReader br;
	PrintWriter pw;
	StringTokenizer st;
	
	public static void main(String[] args) throws Exception{
		new Main().run();
	}
	
	void run() throws Exception{
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(System.out);
		//br = new BufferedReader(new FileReader("input.txt"));
		//pw = new PrintWriter("output.txt");
		solve();
		br.close();
		pw.close();
	}
 
	void solve() throws Exception{
		int t = nextInt();
		while(t-->0){
			int n = nextInt();
			int[] a = new int[n];
			for(int i=0; i<n; i++) a[i] = nextInt();
			int m = nextInt();
			int[] arr = new int[m];
			for(int i=0; i<m; i++){
				int k = nextInt();
				int min = 1000000;
				for(int j=0; j<k; j++){
					int id = nextInt()-1;
					if(min>a[id]) min=a[id];
				}
				arr[i] = min;
			}
			Arrays.sort(arr);
			int ans=0;
			for(int i=0; i<n; i++){
				ans+=a[i];
			}
			for(int i=arr.length-1; i>=0 && n>0; i--){
				ans-=arr[i];
				n--;
			}
			pw.println(ans);
		}
	}
 
	String next() throws Exception{
		while(st==null||!st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
 
	int nextInt() throws Exception{
		return Integer.parseInt(next());
	}
}