/*

 *
 *
 */

public class VersionControl {
	private static int[] IGNORES, TRACKS;
	private static boolean[] IGNORED, TRACKED;
	private static Scanner sc ;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			
			IGNORED = new boolean[N+1];
			IGNORES = new int[M];
			
			TRACKED = new boolean[N+1];
			TRACKS = new int[K];
			
			for(int i = 0; i < M; i++) {
				IGNORES[i] = sc.nextInt();
				IGNORED[IGNORES[i]] = true;
			}
			
			for(int i = 0; i < K; i++) {
				TRACKS[i] = sc.nextInt();
				TRACKED[TRACKS[i]] = true;
			}
			
			int both = 0;
			int neither = 0;
			
			for(int i = 0; i < IGNORES.length; i++) {
				if(IGNORED[IGNORES[i]] && TRACKED[IGNORES[i]]) {
					both++;
				}
			}
			
			for(int i = 0; i < TRACKS.length; i++) {
				if(!IGNORED[TRACKS[i]] && !TRACKED[TRACKS[i]]) {
					neither++;
				}
			}
			
			System.out.println(both + " " + neither);
		}
	}

}