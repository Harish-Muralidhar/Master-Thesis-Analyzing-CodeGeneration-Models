/*
 */
import java.util.*;
public class KitchenSchedule {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int noOfTestCases = s.nextInt();
        int[] result = new int[noOfTestCases];
        int noOfStudents;
        int[] arrivalTime;
        int[] cookingTime;
        for(int i = 0; i < noOfTestCases; i++){
            noOfStudents = s.nextInt();
            arrivalTime = new int[noOfStudents];
            cookingTime = new int[noOfStudents];
            for(int j = 0; j < noOfStudents; j++){
                arrivalTime[j] = s.nextInt();
            }
            for(int j = 0; j < noOfStudents; j++){
                cookingTime[j] = s.nextInt();
            }
            result[i] = solve(arrivalTime, cookingTime);
        }
        for(int i = 0; i < noOfTestCases; i++){
            System.out.println(result[i]);
        }
    }
    public static int solve(int[] arrivalTime, int[] cookingTime){
        int noOfStudents = arrivalTime.length;
        int[] temp = new int[noOfStudents];
        int count = 0;
        for(int i = 0; i < noOfStudents; i++){
            if(i == 0){
                temp[i] = arrivalTime[i] - cookingTime[i];
            }else{
                temp[i] = arrivalTime[i] - (arrivalTime[i-1] + cookingTime[i]);
            }
            if(temp[i] < 0){
                count++;
            }
        }
        return noOfStudents - count;
    }
}