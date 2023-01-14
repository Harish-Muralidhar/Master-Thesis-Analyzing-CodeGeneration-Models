/*
*/
import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0;i<num;i++)
        {
            int number = scanner.nextInt();
            String str = Integer.toString(number);
            StringBuffer str1 = new StringBuffer(str);
            String str2 = str1.reverse().toString();
            System.out.println(str2);
        }
	}
}