/*

 */
package dp.medium;

import java.util.Stack;

/**
 *
 * @author vishal
 */
public class BalancedBracketSequence {
    public static void main(String[] args) {
        int a[] = {-1,-2,9,2,-3,-4,3,4,8,8,1};
        System.out.println(balancedBracket(a,11));
    }
    static int balancedBracket(int a[] , int n){
        Stack<Integer> s = new Stack<>();
        int count = 0;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                if(!s.empty() && s.peek()==Math.abs(a[i])){
                    s.pop();
                    count++;
                    //System.out.println(s+" "+count);
                }else{
                    //s.push(a[i]);
                }
            }else{
                s.push(Math.abs(a[i]));
            }
        }
        return count;
    }
}