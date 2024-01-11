package com.spring.java_8_stream_api.all_match;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        boolean ans = getAllMatches(nums);
        System.out.println(ans);
    }

    private static boolean getAllMatches(List<Integer> nums) {
        return nums.stream().allMatch(num -> num > 24);
    }
}
