package com.spring.java_8_stream_api.shorted_and_limit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortedWithLimits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        List<Integer> shortedAndLimitedNums = getShortedAndLimis(nums);
        shortedAndLimitedNums.stream().forEach(System.out::println);
    }

    private static List<Integer> getShortedAndLimis(List<Integer> nums) {
        if (nums != null && !nums.isEmpty()) {
            return nums.stream().sorted().limit(nums.size() / 2).toList();
        }
        return new ArrayList<>();
    }
}
