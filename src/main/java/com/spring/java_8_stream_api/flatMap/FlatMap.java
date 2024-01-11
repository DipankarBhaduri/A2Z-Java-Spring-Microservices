package com.spring.java_8_stream_api.flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.nextInt());
            totalNumber--;
        }

        List<List<Integer>> intergers = new ArrayList<>();
        intergers.add(nums);
        intergers.add(nums);
        intergers.add(nums);

        List<Integer> integerList = getMergedList(intergers);
        integerList.stream().forEach(System.out::println);
    }

    private static List<Integer> getMergedList(List<List<Integer>> intergers) {
        return intergers.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
    }
}
