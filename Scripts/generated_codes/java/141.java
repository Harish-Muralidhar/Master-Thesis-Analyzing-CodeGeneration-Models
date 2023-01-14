/*

 * @author vivedula
 *
 */
public class ChefAndPathsInDirectedGraph {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();
		int k = s.nextInt();
		int[] graph = new int[(n + 2) * m];
		Arrays.fill(graph, 0);
		int[] layerCount = new int[n + 2];
		Arrays.fill(layerCount, 0);

		// int[][] graph = new int[n + 2][m];
		// int[] layerCount = new int[n + 2];
		while (k > 0) {
			k--;
			int l1 = s.nextInt();
			int p1 = s.nextInt();
			int l2 = s.nextInt();
			int p2 = s.nextInt();
			graph[(l1 * m) + p1] = m * l2 + p2;
			layerCount[l1] += 1;
			layerCount[l2] += 1;
		}
		layerCount[0] = 1;
		layerCount[n + 1] = 1;
		// for(int i=0; i<graph.length; i++){
		// System.out.println(graph[i]);
		// }

		// for(int i=0; i<layerCount.length; i++){
		// System.out.println(layerCount[i]);
		// }

		long[] table = new long[(n + 2) * m]; // used to store the number of
												// paths
		for (int i = 0; i < table.length; i++) {
			table[i] = 0;
		}
		table[0] = 1; // number of ways to reach the start is 1
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < m; j++) {
				// System.out.println(i + " " + j);
				if (graph[(i * m) + j] != 0) {
					table[graph[(i * m) + j]] += table[(i * m) + j];
				}
			}
		}
		long sum = 0;
		for (int i = 0; i < table.length; i++) {
			sum += table[i];
		}
		System.out.println(sum);
		s.close();
	}
}