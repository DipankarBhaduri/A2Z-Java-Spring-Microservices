package com.spring.generics_in_java;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethodToPrint {
    public static void print(List<?> thingToPrint) {
        thingToPrint.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        List<String> stringList = new ArrayList<>();
        stringList.add("Aniruddha");
        stringList.add("Dipankar");
        stringList.add("Pritam");

        print(integerList);
        print(stringList);
    }
}
