/*

Explanation
The first example is already sorted, and the second one is not sorted and has no such property.
Notice that the first example has 3 numbers and the second one has 5 numbers.

Input:
3
5
2 4 1 3 5
1
1
5
5 4 3 2 1
Output:
NO
YES
YES

Explanation
The first example is not sorted and has no such property. The second example is already sorted, and the third one is not sorted but has such a property.

Input:
1
5
5 4 3 2 1
Output:
YES

Explanation
The first example is not sorted but has such a property.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class CodeKata4{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int flag;
		while(t-->0){
		    flag = 0;
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        if(Math.abs(i+1-arr[i])>1){
		            flag = 1;
		            break;
		        }
		    }
		    if(flag==0)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}