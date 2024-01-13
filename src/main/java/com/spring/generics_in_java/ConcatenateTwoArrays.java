package com.spring.generics_in_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenateTwoArrays {
    public static void main(String[] args) {
        List<Integer> integerList1 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> integerList2 = Arrays.asList(3, 5, 7, 9);
        List<Integer> finalList1 = mergeTwoList(integerList1, integerList2);
        finalList1.stream().forEach(System.out::println);

        List<String> stringList1 = Arrays.asList("abc", "abcd", "abcde");
        List<String> stringList2 = Arrays.asList("a", "ab", "aba");
        List<String> finalList2 = mergeTwoList(stringList1, stringList2);
        finalList2.stream().forEach(System.out::println);
    }

    public static <T> List<T> mergeTwoList(List<T> list1, List<T> list2) {
        List<T> finalList = new ArrayList<>();
        if (list1 != null) list1.stream().forEach(item -> finalList.add(item));
        if (list2 != null) list2.stream().forEach(item -> finalList.add(item));
        return finalList;
    }
}
