package com.spring.java_8_stream_api.practice_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Convert a List of integers to a List of strings.
 */
public class ConvertListOfIntegerToListOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        List<String> stringList = convertListOfIntegerToListOfString(nums);
        stringList.stream().forEach(System.out::println);
    }

    private static List<String> convertListOfIntegerToListOfString(List<Integer> nums) {
        if (nums != null && !nums.isEmpty()) {
            return nums.stream().map(num -> num.toString()).toList();
        }
        return new ArrayList<>();
    }
}
