/*


*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < t; i++)
            list.add(Integer.valueOf(sc.nextInt()));
        Collections.sort(list);
        for(int i = 0; i < t; i++)
            System.out.println(list.get(i));
    }
}