/*


Explanation:
For the first example, there are 4 roads. Let's say the roads are numbered from 1 to 4.

If the caravan is taken on road 1, the toll is 10 at 1st toll booth, 9 at 2nd toll booth, 8 at 3rd toll booth and so on. So the total toll on this road is 10+9+8+7+6 = 40. 
If the caravan is taken on road 2, the toll is 8 at 1st toll booth, 7 at 2nd toll booth, 6 at 3rd toll booth and so on. So the total toll on this road is 8+7+6+9+12 = 42.
If the caravan is taken on road 3, the toll is 16 at all the 5 toll booths. So the total toll on this road is 16+16+16+16+16 = 80.
If the caravan is taken on road 4, the toll is 7 at 1st toll booth, 6 at 2nd toll booth, 5 at 3rd toll booth and so on. So the total toll on this road is 7+6+5+4+3 = 25.

The cost of moving the caravan from road 1 to road 2 is 6. From road 2 it can be moved to road 4 for 17 dollars. From road 4 it can be moved to road 1 for 7 dollars. And from road 1 it can be moved to road 3 for 8 dollars. So, the total cost of moving the caravan is 6+17+7+8=38.

If the caravan is bought on road 1, the total cost is 40+38=78. But the friends have only 40 dollars. So they can't buy a caravan that costs 78 dollars and they can't afford the toll either. So the answer is -1.

If the caravan is bought on road 2, the total cost is 42+38=80. But the friends have only 40 dollars. So they can't buy a caravan that costs 80 dollars and they can't afford the toll either. So the answer is -1.

If the caravan is bought on road 3, the total cost is 80+38=118. But the friends have only 40 dollars. So they can't buy a caravan that costs 118 dollars and they can't afford the toll either. So the answer is -1.

If the caravan is bought on road 4, the total cost is 25+38=63. But the friends have only 40 dollars. So they can't buy a caravan that costs 63 dollars and they can't afford the toll either. So the answer is -1.

So the maximum amount they can spend on a caravan is 20.

For the second example, there are 2 roads. Let's say the roads are numbered from 1 to 2.

If the caravan is taken on road 1, the toll is 5 at 1st toll booth and 6 at 2nd toll booth. So the total toll on this road is 5+6 = 11.
If the caravan is taken on road 2, the toll is 6 at 1st toll booth and 7 at 2nd toll booth. So the total toll on this road is 6+7 = 13.

The cost of moving the caravan from road 1 to road 2 is 0. From road 2 it can be moved to road 1 for 5 dollars. So, the total cost of moving the caravan is 0+5=5.

If the caravan is bought on road 1, the total cost is 11+5=16. But the friends have only 10 dollars. So they can't buy a caravan that costs 16 dollars and they can't afford the toll either. So the answer is -1.

If the caravan is bought on road 2, the total cost is 13+5=18. But the friends have only 10 dollars. So they can't buy a caravan that costs 18 dollars and they can't afford the toll either. So the answer is -1.

So the maximum amount they can spend on a caravan is 0.

For the third example, there are 2 roads. Let's say the roads are numbered from 1 to 2.

If the caravan is taken on road 1, the toll is 3 at 1st toll booth, 4 at 2nd toll booth and 5 at 3rd toll booth. So the total toll on this road is 3+4+5 = 12.
If the caravan is taken on road 2, the toll is 5 at 1st toll booth, 7 at 2nd toll booth and 2 at 3rd toll booth. So the total toll on this road is 5+7+2 = 14.

The cost of moving the caravan from road 1 to road 2 is 0. From road 2 it can be moved to road 1 for 5 dollars. So, the total cost of moving the caravan is 0+5=5.

If the caravan is bought on road 1, the total cost is 12+5=17. But the friends have only 12 dollars. So they can't buy a caravan that costs 17 dollars and they can't afford the toll either. So the answer is -1.

If the caravan is bought on road 2, the total cost is 14+5=19. But the friends have only 12 dollars. So they can't buy a caravan that costs 19 dollars and they can't afford the toll either. So the answer is -1.

So the maximum amount they can spend on a caravan is 0.

*/


import java.util.Scanner;

public class ChefBirthday {
	
	static class Node{
		int road;
		int cost;
		public Node(int road,int cost){
			this.road=road;
			this.cost=cost;
		}
	}
	static int[][] cost;
	static int[][] toll;
	static int[][] graph;
	static boolean[] visited;
	static int n;
	static int m;
	static int d;
	static int answer=0;
	static int[] price;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++){
			d=sc.nextInt();
			n=sc.nextInt();
			m=sc.nextInt();
			graph=new int[m][m];
			toll=new int[m][n];
			visited=new boolean[m];
			price=new int[m];
			for(int j=0;j<m;j++){
				price[j]=sc.nextInt();
				for(int k=1;k<n;k++){
					toll[j][k]=toll[j][k-1]+sc.nextInt();
				}
			}
			for(int j=0;j<m;j++){
				for(int k=0;k<m;k++){
					graph[j][k]=sc.nextInt();
				}
			}
			answer=0;
			for(int j=0;j<m;j++){
				visited[j]=true;
				for(int k=0;k<m;k++){
					if(k!=j){
						visited[k]=true;
						int p=price[k]+graph[j][k];
						int t1=toll[j][n-1];
						int t2=toll[k][n-1];
						if(d-p>=Math.max(t1, t2)){
							answer=Math.max(answer,p);
						}
						for(int l=0;l<n-1;l++){
							p=price[j]+graph[k][j]+graph[j][k];
							t1=toll[k][l];
							t2=toll[j][l];
							if(d-p>=Math.max(t1, t2)){
								answer=Math.max(answer,p);
							}
						}
					}
					visited[k]=false;
				}
				visited[j]=false;
			}
			if(answer==0){
				System.out.println("-1");
			}
			else{
				System.out.println(answer);
			}
		}
		sc.close();
	}
}