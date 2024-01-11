package com.spring.java_8_stream_api.find_any;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        int findAny = getFindAny(nums);
        System.out.println(findAny);
    }

    private static int getFindAny(List<Integer> nums) {
        return nums.stream().filter(num -> num != 0).findAny().get();
    }
}
