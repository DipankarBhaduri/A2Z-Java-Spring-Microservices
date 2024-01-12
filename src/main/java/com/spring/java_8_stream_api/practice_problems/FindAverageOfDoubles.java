package com.spring.java_8_stream_api.practice_problems;

import java.util.*;

/*
Find the average of a List of doubles using Streams.
 */
public class FindAverageOfDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Double> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextDouble());
            totalNumber--;
        }

        Double result = checkAllElementGreaterThenACertainValue(nums);
        System.out.println(result);
    }

    private static Double checkAllElementGreaterThenACertainValue(List<Double> nums) {
        if (nums != null && !nums.isEmpty()) {
            return (nums.stream().reduce(Double :: sum).get()) / nums.size();
        }
        return 0.0;
    }
}
