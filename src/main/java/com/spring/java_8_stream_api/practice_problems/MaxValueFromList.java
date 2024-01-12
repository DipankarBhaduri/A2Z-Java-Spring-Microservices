package com.spring.java_8_stream_api.practice_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Find the maximum value in a List of integers using Streams.
 */
public class MaxValueFromList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        int maxValue = convertListOfIntegerToListOfString(nums);
        System.out.println(maxValue);
    }

    private static int convertListOfIntegerToListOfString(List<Integer> nums) {
        if (nums != null && !nums.isEmpty()) {
            return nums.stream().max(Integer::compareTo).get();
        }
        return 0;
    }
}
