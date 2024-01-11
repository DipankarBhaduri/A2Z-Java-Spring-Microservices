package com.spring.java_8_stream_api.to_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        Object[] intergers = getToArray(nums);
        Arrays.stream(intergers).forEach(System.out::println);
    }

    private static Object[] getToArray(List<Integer> nums) {
        if (nums != null && !nums.isEmpty()) {
            return Arrays.stream(nums.stream().toArray()).toArray();
        }
        return new int[][]{new int[nums.size()]};
    }
}
