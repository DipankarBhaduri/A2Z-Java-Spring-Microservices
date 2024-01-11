package com.spring.java_8_stream_api.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reduce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        int num = getAllNumbersSum(nums);
        System.out.println(num);
    }

    private static int getAllNumbersSum(List<Integer> nums) {
        if (nums != null && !nums.isEmpty()) {
            return nums.stream().reduce(Integer::sum).get();
        }
        return 0;
    }
}
