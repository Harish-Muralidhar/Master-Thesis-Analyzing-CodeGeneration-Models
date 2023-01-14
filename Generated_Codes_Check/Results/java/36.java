/*


 */

public class ForgottenLanguage {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		in.nextLine();
		for (int t = 0; t < testcases; t++) {
			String[] dict = in.nextLine().split(" ");
			int k = in.nextInt();
			in.nextLine();
			for (int i = 0; i < k; i++) {
				int count = in.nextInt();
				in.nextLine();
				String[] phrase = in.nextLine().split(" ");
				for (int x = 0; x < dict.length; x++) {
					for (int y = 0; y < phrase.length; y++) {
						if (dict[x].equals(phrase[y])) {
							dict[x] = "YES";
							break;
						}
					}
					if (!dict[x].equals("YES")) {
						dict[x] = "NO";
					}
				}
			}
			for (int i = 0; i < dict.length; i++) {
				System.out.print(dict[i] + " ");
			}
			System.out.println();
		}
	}

}