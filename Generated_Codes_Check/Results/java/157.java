/*

https://www.codechef.com/problems/AKBAR
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Akbar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt();
        int k = scanner.nextInt();

        int[] elements = new int[numOfElements];
        for (int index = 0; index < numOfElements; index++) {
            elements[index] = scanner.nextInt();
        }

        System.out.println(getNumOfGoodSubSegments(elements, k));
    }

    static int getNumOfGoodSubSegments(int[] elements, int k) {
        int numOfGoodSubSegments = 0;
        Map<Integer, Integer> prevMod = new HashMap<>();
        Map<Integer, Integer> curMod = new HashMap<>();
        for (int index = 0; index < elements.length; index++) {
            numOfGoodSubSegments++;
            Map<Integer, Integer> tmp = prevMod;
            prevMod = curMod;
            curMod = tmp;

            for (Map.Entry<Integer, Integer> entry : prevMod.entrySet()) {
                int curModVal = (elements[index] % entry.getKey() + entry.getKey()) % entry.getKey();
                if (curModVal == k) {
                    numOfGoodSubSegments -= entry.getValue();
                } else {
                    curMod.put(curModVal, curMod.getOrDefault(curModVal, 0) + entry.getValue());
                }
            }

            curMod.put(elements[index] % k, curMod.getOrDefault(elements[index] % k, 0) + 1);
            curMod.put(0, curMod.getOrDefault(0, 0) + 1);
        }

        return numOfGoodSubSegments;
    }
}