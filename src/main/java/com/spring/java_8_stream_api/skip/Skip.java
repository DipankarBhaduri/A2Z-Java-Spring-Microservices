package com.spring.java_8_stream_api.skip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Skip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        List<Integer> skipedElement = getSkipedElement(nums);
        skipedElement.stream().forEach(System.out::println);
    }

    private static List<Integer> getSkipedElement(List<Integer> nums) {
        if (nums != null && !nums.isEmpty()) {
            return nums.stream().skip(nums.size() / 2).toList();
        }
        return new ArrayList<>();
    }
}
