package com.spring.java_8_stream_api.practice_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Given a List of strings, find the length of each string.
 */
public class ReturnLengthOfAllString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<String> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.next());
            totalNumber--;
        }

        List<Integer> stringList = getLengthOfAllString(nums);
        stringList.stream().forEach(System.out::println);
    }

    private static List<Integer> getLengthOfAllString(List<String> nums) {
        if (nums != null && !nums.isEmpty()) {
            return nums.stream().map(name -> name.length()).toList();
        }
        return new ArrayList<>();
    }
}
