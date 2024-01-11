package com.spring.java_8_stream_api.distinct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Distinct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        List<Integer> convertedNames = getDistinctElement(nums);
        convertedNames.stream().forEach(System.out::println);
    }

    private static List<Integer> getDistinctElement(List<Integer> nums) {
        if (nums != null && !nums.isEmpty()) {
            return nums.stream().distinct().toList();
        }
        return new ArrayList<>();
    }
}
