/*

*/
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			boolean flag=false;
			for(int i=0;i<n;i++){
				int sum=arr[i];
				for(int j=i+1;j<n;j++){
					sum+=arr[j];
					if(sum==m){
						flag=true;
						break;
					}
				}
				if(flag)
					break;
			}
			if(flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}