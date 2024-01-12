package com.spring.java_8_stream_api.practice_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Filter a List of integers to get only the even numbers.
 */
public class GetEvenNumberFromAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        List<Integer> integerList = getAllEvenNumbers(nums);
        integerList.stream().forEach(System.out::println);
    }

    private static List<Integer> getAllEvenNumbers(List<Integer> nums) {
        if (nums != null && !nums.isEmpty()) {
            return nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }
}
