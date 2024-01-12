package com.spring.java_8_stream_api.practice_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Check if all elements in a List are greater than a certain value.
 */
public class AllElementGraterThenACertainValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        boolean result = checkAllElementGreaterThenACertainValue(nums);
        System.out.println(result);
    }

    private static boolean checkAllElementGreaterThenACertainValue(List<Integer> nums) {
        if (nums != null && !nums.isEmpty()) {
            return nums.stream().allMatch(num -> num > 2);
        }
        return false;
    }
}
