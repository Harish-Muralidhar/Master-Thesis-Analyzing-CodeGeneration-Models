/*

Test Case #1

Initially the nodes store the following values:

Node 1: 0
Node 2: 0
Node 3: 0
Node 4: 0
Node 5: 0

After the first query, the values remain the same.

After the first update operation, the values at the nodes are:

Node 1: 2
Node 2: 1
Node 3: 0
Node 4: 0
Node 5: 0

After the second query, the value at node 2 is reported.

After the third query, the value at node 3 is reported.

After the fourth query, the value at node 4 is reported.

After the fifth query, the value at node 5 is reported.

After the second update operation, the values at the nodes are:

Node 1: 2
Node 2: 1
Node 3: 3
Node 4: 2
Node 5: 1

After the sixth query, the value at node 3 is reported.

After the seventh query, the value at node 4 is reported.

After the last query, the value at node 5 is reported.

Test Case #2

There is only one query of type Q which asks to report the value at node 1. The answer is 0, since initially all values are zero.
*/
import java.util.*;
public class Main {
	static long mod = 1000000007;
	static long fib[] = new long[100001];
	static void f(int k){
	    fib[0] = 0; fib[1] = 1;
	    for(int i=2; i<=k; i++){
	        fib[i] = (fib[i-1] + fib[i-2])%mod;
	    }
	}
	static void dfs(int root, int parent, int k, int level, long tree[][]){
	    tree[root][0] += fib[level];
	    tree[root][0] %= mod;
	    for(int i=0; i<tree[root].length; i++){
	        if(tree[root][i] != 0 && tree[root][i] != parent){
	            dfs(tree[root][i], root, k, level+1, tree);
	        }
	    }
	}
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int parent;
	    long tree[][] = new long[n+1][n+1];
	    for(int i=1; i<n; i++){
	        parent = sc.nextInt();
	        tree[i+1][parent] = 1;
	        tree[parent][i+1] = 1;
	    }
	    while(m-- > 0){
	        char ch = sc.next().charAt(0);
	        if(ch == 'U'){
	            int root = sc.nextInt();
	            int k = sc.nextInt();
	            f(k);
	            dfs(root, root, k, 0, tree);
	        }else{
	            int node = sc.nextInt();
	            System.out.println(tree[node][0]);
	        }
	    }
	}
}