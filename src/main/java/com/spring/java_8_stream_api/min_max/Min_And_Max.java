package com.spring.java_8_stream_api.min_max;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Min_And_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        int minValue = getMinValue(nums);
        int maxValue = getMaxValue(nums);

        System.out.println("The Min value is : "+minValue +" & Max value : "+maxValue);
    }

    private static int getMinValue(List<Integer> nums) {
        return nums.stream().sorted().min(Integer::compareTo).get();
    }

    private static int getMaxValue(List<Integer> nums) {
        return nums.stream().max(Integer::compareTo).get();
    }
}
