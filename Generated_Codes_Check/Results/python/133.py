
The first query asks you to print the value stored at node 3. Since, the tree has just been constructed, all nodes have zero value stored at them. Hence, the answer is 0.

The second query asks you to update the subtree rooted at 1. The value of node 1 is updated to F2 = 1. The value at node 2 is updated to F3 = 2. The value of node 3 remains unchanged. The value at node 4 is updated to F4 = 3. The value at node 5 is updated to F5 = 5.

The next three queries ask for the value stored at node 2, node 3, node 4 and node 5. These values are 2, 0, 3 and 5 respectively.

The fifth query asks you to update the subtree rooted at 3. The value of node 3 is updated to F1 = 1. The value at node 4 is updated to F2 = 1. The value of node 5 is updated to F3 = 2.

The last three queries ask for the value stored at node 3, node 4 and node 5. These values are 1, 1, 2 respectively.
*/

import java.io.*;
import java.util.*;
import java.lang.*;
 
 
class Node {
	int data;
	Node left, right;
	
	Node(int item)
	{
		data = item;
		left =right = null;
	}
}

class FibonacciTree{
	Node root;
	static long[] fib;
	static final int mod = 1000000007;
	
	static long fibonacci(int n)
	{
		if(n <= 1)
			return n;
		if(fib[n] == 0)
			fib[n] = fibonacci(n-1) + fibonacci(n-2) ;
		return fib[n];
	}
	
	static void updateTree(Node node, int K)
	{
		if(node == null)
			return;
			
		node.data = (int)((node.data + fibonacci(K))%mod);
		updateTree(node.left,K+1);
		updateTree(node.right,K+1);
	}
	
	static int value(Node node)
	{
		if(node == null)
			return 0;
		return node.data;
	}
	
	static public void main(String args[])
	{
		FibonacciTree tree = new FibonacciTree();
		tree.root = new Node(0);
		tree.root.left = new Node(0);
		tree.root.right = new Node(0);
		tree.root.left.left = new Node(0);
		tree.root.left.right = new Node(0);
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int M = s.nextInt();
		
		fib = new long[N+1];
		
		for(int i=0;i<N-1;i++)
		{
			int p = s.nextInt();
			if(i == 1)
			{
				tree.root.left.data = p;
			}
			else if(i ==2)
			{
				tree.root.right.data = p;
			}
			else if(i == 3)
			{
				tree.root.left.left.data = p;
			}
			else if(i == 4)
			{
				tree.root.left.right.data = p;
			}
		}
		
		for(int i=0;i<M;i++)
		{
			String q = s.next();
			int x = s.nextInt();
			
			if(q.equals("U"))
			{
				updateTree(tree.root,x);
				//preOrder(tree.root);
			}
			else
			{
				if(x == 1)
					System.out.println(tree.root.data);
				else if(x == 2)
					System.out.println(tree.root.left.data);
				else if(x == 3)
					System.out.println(tree.root.right.data);
				else if(x == 4)
					System.out.println(tree.root.left.left.data);
				else
					System.out.println(tree.root.left.right.data);
			}
		}
		
	}
}