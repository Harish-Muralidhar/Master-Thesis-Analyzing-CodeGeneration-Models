/*

*/

import java.util.Scanner;

public class RPN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        
        while(t > 0){
            String expression = scanner.nextLine();
            System.out.println(convertRPN(expression));
            t--;
        }
        scanner.close();
    }
    
    private static String convertRPN(String expression){
        StringBuilder sb = new StringBuilder();
        int weight = 0;
        int i = 0;
        while (i < expression.length()) {
            char ch = expression.charAt(i);
            i++;
            if (ch == '(') {
                weight += 100;
                continue;
            }
            if (ch == ')') {
                weight -= 100;
                continue;
            }
            if (ch == '+' || ch == '-') {
                int currWeight = weight + 1;
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) != '(' && currWeight <= (sb.charAt(sb.length() - 1) - '0')) {
                    sb.append(' ');
                    sb.append(sb.charAt(sb.length() - 2));
                    sb.append(' ');
                    sb.deleteCharAt(sb.length() - 3);
                    sb.deleteCharAt(sb.length() - 3);
                }
                sb.append(currWeight);
            } else if (ch == '*' || ch == '/') {
                int currWeight = weight + 2;
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) != '(' && currWeight <= (sb.charAt(sb.length() - 1) - '0')) {
                    sb.append(' ');
                    sb.append(sb.charAt(sb.length() - 2));
                    sb.append(' ');
                    sb.deleteCharAt(sb.length() - 3);
                    sb.deleteCharAt(sb.length() - 3);
                }
                sb.append(currWeight);
            } else if (ch != ' ') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}