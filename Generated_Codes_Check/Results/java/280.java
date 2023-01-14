/*
 
 Acknowledgement
 
 This problem is part of the ACMICPC-2017 contest.
 
 */
public class ChefAndHisMom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N>0){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[k];
			for(int i=0; i<k; i++){
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int j=0;
			int sum = 0;
			for(int i=1; i<=n; i++){
				if(j<k && arr[j]==i){
					j++;
					continue;
				}
				sum +=i;
			}
			if(sum%2==0){
				System.out.println("Mom");
			}
			else{
				System.out.println("Chef");
			}
			N--;
		}
		sc.close();
	}

}