

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		int cases = input.nextInt();
		
			for(int i = 0; i < cases; i++) {
				int activities = input.nextInt();
				String origin = input.next();
				
				int laddus = 0;
				
				for(int j = 0; j < activities; j++) {
					String activity = input.next();
					if(activity.equals("CONTEST_WON")) {
						int rank = input.nextInt();
						laddus += 300;
						if(rank <= 20)
							laddus += 20-rank;
					}
					else if(activity.equals("TOP_CONTRIBUTOR"))
						laddus += 300;
					else if(activity.equals("BUG_FOUND")) {
						int severity = input.nextInt();
						laddus += severity;
					}
					else if(activity.equals("CONTEST_HOSTED"))
						laddus += 50;
				}
				
				int amount = 0;
				if(origin.equals("INDIAN"))
					amount = 200;
				else
					amount = 400;
				
				System.out.println(laddus/amount);
				
			}
	}
}