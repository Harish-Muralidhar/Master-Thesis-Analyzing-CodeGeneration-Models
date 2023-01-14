/*

*/

package com.cookingfox.chef_linguini.solution;

import com.cookingfox.chef_linguini.solution.task.Task;
import com.cookingfox.chef_linguini.solution.task.Task1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        Task task = new Task1();
        System.out.println(task.getResult(input));
    }

}