/*

*/

import java.util.HashMap;
import java.util.Scanner;

public class ChefAndMetro{
	private HashMap<Integer, Integer> stations = new HashMap<>();
	private HashMap<Integer, Integer> times = new HashMap<>();
	private int currentStation = 0;
	private int currentTime = 0;
	private int result = 0;
	private int testCases = 0;
	private int numStations = 0;
	
	public ChefAndMetro(int testCases){
		this.testCases = testCases;
	}
	
	public void chefTime(){
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<testCases; i++){
			numStations = scan.nextInt() + 1;
			for(int j=0; j<numStations-1; j++){
				int x = scan.nextInt();
				int l = scan.nextInt();
				int f = scan.nextInt();
				stations.put(j, j+1);
				times.put(j, (l+f));
				if(j == 0){
					currentTime = x;
				}
				result = currentTime + l;
				currentTime = result;
			}
			System.out.println(result);
		}
	}
	
	public static void main(String args[]){
		ChefAndMetro chef = new ChefAndMetro(3);
		chef.chefTime();
	}
}