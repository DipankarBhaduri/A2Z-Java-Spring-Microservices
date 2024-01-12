package com.spring.java_8_stream_api.practice_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Remove duplicate elements from a List using Streams.
 */
public class RemoveDuplicateFromAStringList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<String> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.next());
            totalNumber--;
        }

        List<String> stringList = removedDuplicateFromAString (nums);
        stringList.stream().forEach(System.out::println);
    }

    private static List<String> removedDuplicateFromAString(List<String> nums) {
        if (nums != null && !nums.isEmpty()) {
            return  new ArrayList<>(nums.stream().collect(Collectors.toSet()));
        }
        return new ArrayList<>();
    }
}
