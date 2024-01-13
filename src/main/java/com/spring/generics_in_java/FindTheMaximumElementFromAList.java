package com.spring.generics_in_java;

import java.util.Arrays;
import java.util.List;

public class FindTheMaximumElementFromAList {
    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(3.5, 4.6, 6.7);
        List<Integer> integerList = Arrays.asList(3, 5, 8);
        List<String> stringList = Arrays.asList("Aniruddha", "Dipankar", "Pritam");

        System.out.println(getMaxElement(doubleList));
        System.out.println(getMaxElement(integerList));
        System.out.println(getMaxElement(stringList));
    }

    public static <T> T getMaxElement(List<T> list) {
        return list.stream().sorted().toList().get(list.size() - 1);
    }
}
