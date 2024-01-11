package com.spring.java_8_stream_api.any_match;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnyMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        boolean ans = getAnyMatches(nums);
        System.out.println(ans);
    }

    private static boolean getAnyMatches(List<Integer> nums) {
        return nums.stream().anyMatch(num -> num > 24);
    }
}
