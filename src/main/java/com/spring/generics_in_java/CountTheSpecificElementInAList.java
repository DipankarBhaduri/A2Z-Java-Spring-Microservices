package com.spring.generics_in_java;

import java.util.Arrays;
import java.util.List;

public class CountTheSpecificElementInAList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 4, 6, 8, 9, 3, 5, 3, 2, 4);
        List<String> stringList = Arrays.asList("abc", "dec", "def", "abc", "abc");

        long ans = getOccurrenceOfTarget(integerList, 2);
        long ans2 = getOccurrenceOfTarget(stringList, "abc");

        System.out.println("2 occurrence : "+ans);
        System.out.println("abc occurrence : "+ans2);
    }

    private static <T> long getOccurrenceOfTarget(List<T> list, T i) {
        return list.stream().filter(t -> t.equals(i)).count();
    }
}
