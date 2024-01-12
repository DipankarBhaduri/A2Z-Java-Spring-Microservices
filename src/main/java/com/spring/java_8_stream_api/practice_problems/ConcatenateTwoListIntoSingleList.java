package com.spring.java_8_stream_api.practice_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Concatenate two Lists into a single List using Streams.
 */
public class ConcatenateTwoListIntoSingleList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<String> nums = new ArrayList<>();

        while (totalNumber != 0) {
            nums.add(scanner.next());
            totalNumber--;
        }

        List<List<String>> listOfList = new ArrayList<>();
        listOfList.add(nums);
        listOfList.add(nums);

        List<String> stringList = getConcatenatedList(listOfList);
        stringList.stream().forEach(System.out::println);
    }

    private static List<String> getConcatenatedList(List<List<String>> listOfList) {
        if (listOfList != null && !listOfList.isEmpty()) {
            return listOfList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

}
