/*



*/


import java.util.*;
class BrokenTelephone {

    public static int countPlayers(int[] nums) {

        int count = 0;
        int first = nums[0];
        int last = nums[nums.length - 1];
        for (int i = 1; i <= nums.length - 2; i++) {
            if (nums[i] == first) {
                count++;
            }
        }

        if (first == last) {
            count = 0;
        }


        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int numPlayers = sc.nextInt();
            int[] nums = new int[numPlayers];
            for (int j = 0; j < numPlayers; j++) {
                nums[j] = sc.nextInt();
            }
            int result = countPlayers(nums);
            System.out.println(result);
        }
    }
}