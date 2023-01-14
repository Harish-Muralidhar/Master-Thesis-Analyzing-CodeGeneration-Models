/*


*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class ChefAndSoup {
    public static void main(String args[] ) throws Exception {
       
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        
        for (int i = 0; i < N; i++) {
        	
        	System.out.println(solve(br));
        }
    }
    
    public static long solve(BufferedReader br) throws Exception{
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        long sum = 0;
        int mask = (1 << M) - 1;
        
        for (int i = 0; i < N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	sum += arr[i];
        }
        
        long maskSum = 0;
        long maskSumCnt = 0;
        long zeroCnt = 0;
        long mod = 1000000009;
        long ans = 0;
        for (int i = 0; i < N; i++) {
        	
        	if ((arr[i] & mask) == 0) {
        		
        		zeroCnt++;
        	}
        	
        	maskSum += (arr[i] & mask);
        	
        	if (maskSum == 0) {
        		maskSumCnt++;
        	}
        	
        	
        	
        	long curSum = sum - arr[i];
        	long curMaskSum = maskSum - (arr[i] & mask);
        	if ((curSum & mask) == 0 && (curMaskSum & mask) == 0) {
        		
        		ans = (ans + (maskSumCnt + 1) * (zeroCnt + 1) % mod) % mod;
        	}
        }
        
        return ans;
    }
}