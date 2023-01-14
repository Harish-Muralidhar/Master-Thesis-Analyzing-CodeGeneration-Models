/*


https://www.codechef.com/problems/RECIPE
*/
import java.util.*;

class Recipe
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numOfTestCases = sc.nextInt();
        sc.nextLine();
        int[] nums = new int[numOfTestCases];

        for (int i = 0; i < numOfTestCases; i++)
        {
            sc.next();

            int min = sc.nextInt();
            int gcd = min;
            while (sc.hasNextInt())
            {
                int num = sc.nextInt();
                gcd = findGCD(gcd, num);

                if (num < min)
                {
                    min = num;
                }
            }

            nums[i] = gcd;
        }

        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }

    static int findGCD(int num1, int num2)
    {
        if (0 == num2)
        {
            return num1;
        }

        return findGCD(num2, num1%num2);
    }
}