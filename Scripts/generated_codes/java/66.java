/*
*/
import java.util.*;
class GFG {
    
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++){
            String s = sc.nextLine();
            String[] sArr = s.split(" ");
            int a = Integer.parseInt(sArr[0]);
            int b = Integer.parseInt(sArr[1]);
            int sum = 0;
            for(int j = a; j <= b; j++){
                if(isPalindrome(j)){
                    sum += j;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
    
    static boolean isPalindrome(int n){
        int x = n;
        int rev = 0;
        while(x > 0){
            int dig = x % 10;
            x /= 10;
            rev = rev * 10 + dig;
        }
        return rev == n;
    }
}