/*
 */
public class Billiards {

	public static void main(String[] args) {

		int sumPlayer1 = 0, sumPlayer2 = 0;
		int maxLead = 0, maxLeadPlayer = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		int noOfRounds = sc.nextInt();
		System.out.println("Number of Rounds: " + noOfRounds);
		while (i < noOfRounds) {
			int scorePlayer1 = sc.nextInt();
			System.out.println("Player1 score: " + scorePlayer1);
			int scorePlayer2 = sc.nextInt();
			System.out.println("Player2 score: " + scorePlayer2);

			sumPlayer1 = sumPlayer1 + scorePlayer1;
			sumPlayer2 = sumPlayer2 + scorePlayer2;
			i++;
		}
		int diff = Math.abs(sumPlayer1 - sumPlayer2);
		if (diff > maxLead) {
			maxLead = diff;
			if (sumPlayer1 > sumPlayer2) {
				maxLeadPlayer = 1;
			} else {
				maxLeadPlayer = 2;
			}
		}
		System.out.println("Max Lead: " + maxLead);
		System.out.println("Max Lead Player: " + maxLeadPlayer);
		sc.close();
	}

}