package com.spring.exception_handling_in_java;

import java.util.Arrays;
import java.util.List;

public class ReturnOverRide {
    public static void main(String[] args) {
        getObject(Arrays.asList(2, 5, 7, 8), "name 1234");
        getObject(Arrays.asList(2, 5, 7, 8));
    }

    public static void getObject(List<Integer> integerList, String... value) {
        if (value != null && value.length > 0 && value[0] != null) {
            String name = value[0];
            System.out.println(name);
        }
    }
}
