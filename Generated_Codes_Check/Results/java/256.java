/*


import java.util.Scanner;
public class ChefAndSubarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int count = 1;
		String[] str = sc.nextLine().split(" ");
		int[] arr = new int[str.length];
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(str[i]);
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int result = 1;
				for(int k=i;k<=j;k++){
					result = result * arr[k];
				}
				if(result!=0){
					if(count<(j-i+1)){
						count = j-i+1;
					}
				}
			}
		}
		System.out.println(count);
	}
}

*/