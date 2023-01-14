/*

Explanation
The expression 1. is valid and contains 4 symbols.
The expression 2. is not valid, as the first > symbol does not have a corresponding < symbol before it.
The expression 3. is not valid as well, but its first two symbols are valid and form a prefix of the expression.
*/

/**
 * @author Minh_Nguyen on  8/1/2019
 * @Project Algorithm-practice
 * @Email:
 */
public class ValidParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test > 0) {
            String str = sc.nextLine();
            int count = 0;
            int max = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) =='<') {
                    count += 1;
                } else {
                    count -= 1;
                }
                if (count == 0) max = i + 1;
                if (count < 0) break;
            }

            System.out.println(count == 0 ? max : 0);
            test -= 1;
        }
    }
}