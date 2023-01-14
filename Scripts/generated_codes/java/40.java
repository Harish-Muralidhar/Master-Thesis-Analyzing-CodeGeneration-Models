/*


Explanation
Example case 1. The first person only had "No" gesture, and the second person had "Yes" gesture. The third person had a mixture of "Yes", "No" and "Indian Yes" gestures.
*/
public class HeadBob
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();
            int y = 0, nn = 0, i = 0;
            for(int j = 0; j < n; j++)
            {
                char c = s.charAt(j);
                if(c == 'Y')
                    y++;
                else if(c == 'N')
                    nn++;
                else
                    i++;
            }
            if(i != 0)
                System.out.println("INDIAN");
            else if(y != 0)
                System.out.println("NOT INDIAN");
            else
                System.out.println("NOT SURE");
        }
    }
}