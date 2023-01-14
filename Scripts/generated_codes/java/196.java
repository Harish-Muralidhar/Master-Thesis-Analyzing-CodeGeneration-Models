/*
 * @author Dell
 *
 */
public class ChefAndSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 0 ; i < T ;i++){
			int N = scan.nextInt();
			int[] arr = new int[N];
			int[] dp = new int[N];
			for(int j = 0 ; j < N ; j++){
				arr[j] = scan.nextInt();
				dp[j] = arr[j];
			}
			int count = 0;
			for(int j = 1 ; j < N ; j++){
				for(int k = j - 1 ; k >= 0 ; k--){
					dp[k] = Math.max(dp[k] , arr[k] - arr[j]);
					if(dp[k] == 1)count++;
				}
			}
			System.out.println(count);
			
		}

	}

}