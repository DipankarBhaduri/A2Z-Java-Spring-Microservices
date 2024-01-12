package com.spring.java_8_stream_api.practice_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergedTwoListOfIntegerIntoSingleShortedList {
    public static void main(String[] args) {
        List<Integer> integerList1 = Arrays.asList(2, 4, 6, 8);
        List<Integer> integerList2 = Arrays.asList(3, 5, 7, 9);

        List<List<Integer>> listOfIntegerList = new ArrayList<>();
        listOfIntegerList.add(integerList1);
        listOfIntegerList.add(integerList2);

        List<Integer> mergedIntegerList = getListsAndShorted(listOfIntegerList);
        mergedIntegerList.stream().forEach(System.out::println);
    }

    private static List<Integer> getListsAndShorted(List<List<Integer>> listOfIntegerList) {
        return listOfIntegerList.stream().flatMap(list -> list.stream()).sorted().toList();
    }
}
