package com.spring.java_8_stream_api.practice_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Count the occurrences of a specific element in a List.
 */
public class CountTheOccurrenceOfSpecificElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        int count = getCountTheOccurrence(nums);
        System.out.println(count);
    }

    private static int getCountTheOccurrence(List<Integer> nums) {
        if (nums != null && !nums.isEmpty()) {
            return (int) nums.stream().filter(num -> num == 3).count();
        }
        return 0;
    }
}
