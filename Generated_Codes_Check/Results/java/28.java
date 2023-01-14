/*
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0){
	        char c=sc.next().charAt(0);
	        switch(c){
	            case 'B':
	            case 'b':
	                System.out.println("BattleShip");
	                break;
	            case 'C':
	            case 'c':
	                System.out.println("Cruiser");
	                break;
	            case 'D':
	            case 'd':
	                System.out.println("Destroyer");
	                break;
	            case 'F':
	            case 'f':
	                System.out.println("Frigate");
	                break;
	            default:
	                break;
	        }
		}
	}
}