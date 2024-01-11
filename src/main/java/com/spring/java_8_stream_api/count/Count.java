package com.spring.java_8_stream_api.count;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        int count = getDistinctCount(nums);
        System.out.println(count);
    }

    private static int getDistinctCount(List<Integer> nums) {
        return (int)nums.stream().distinct().count();
    }
}
