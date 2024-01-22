package com.spring.optionalsInJava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Given a list of Optional<Integer>, write a method to calculate the sum of all present values.
 */
public class CalculateTheSumOfAllPresentValues {
    public static void main(String[] args) {
        Optional<List<Integer>> integerList = Optional.ofNullable(Arrays.asList(2, 4, 6, 8));
        Optional<Integer> sumValue = getSumOfAllValues(integerList);
        System.out.println(sumValue.get());
    }

    private static Optional<Integer> getSumOfAllValues(Optional<List<Integer>> integerList) {
        return (integerList.isPresent()) ? integerList.map(list -> list.stream().mapToInt(Integer::intValue).sum()) : Optional.of(0);
    }
}