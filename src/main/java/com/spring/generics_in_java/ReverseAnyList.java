package com.spring.generics_in_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAnyList {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Pritam", "Dipankar", "Aniruddha");
        List<Integer> integerList = Arrays.asList(2, 4, 6, 8);

        stringList = getReverseList(stringList);
        integerList = getReverseList(integerList);

        stringList.forEach(System.out::println);
        integerList.forEach(System.out::println);
    }

    public static <T> List<T> getReverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>();
        int end = list.size() - 1;
        while (end >= 0) {
            reversedList.add(list.get(end));
            end--;
        }
        return reversedList;
    }
}
