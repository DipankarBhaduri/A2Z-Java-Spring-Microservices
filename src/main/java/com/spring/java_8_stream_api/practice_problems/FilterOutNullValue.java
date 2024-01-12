package com.spring.java_8_stream_api.practice_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Filter out null values from a List using Streams.
 */
public class FilterOutNullValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<String> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.next());
            nums.add(null);
            totalNumber--;
        }

        List<String> stringList = convertListOfIntegerToListOfString(nums);
        stringList.stream().forEach(System.out::println);
    }

    private static List<String> convertListOfIntegerToListOfString(List<String> nums) {
        if (nums != null && !nums.isEmpty()) {
            return nums.stream().filter(Objects::nonNull).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }
}
