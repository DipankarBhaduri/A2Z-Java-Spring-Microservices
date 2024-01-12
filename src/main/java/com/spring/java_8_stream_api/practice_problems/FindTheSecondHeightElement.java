package com.spring.java_8_stream_api.practice_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTheSecondHeightElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        int secondMax = findTheSecondHeightElement(nums);
        System.out.println(secondMax);
    }

    private static int findTheSecondHeightElement(List<Integer> nums) {
        if (nums != null && !nums.isEmpty()) {
            return nums.stream().sorted().toList().get(nums.size() - 2);
        }
        return 0;
    }
}
