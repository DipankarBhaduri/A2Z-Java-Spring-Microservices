package com.spring.optionalsInJava;

import java.util.Optional;

/*
Implement a method that takes an Optional<Integer> and squares
the value if present, otherwise returns 0.
 */
public class SquareTheValue {
    public static void main(String[] args) {
        Optional<Integer> optionalInteger = Optional.ofNullable(9);
        Optional<Integer> squareValue = getSquareValue (optionalInteger);
        System.out.println(squareValue.get());
    }

    private static Optional<Integer> getSquareValue(Optional<Integer> optionalInteger) {
        if (optionalInteger.isPresent()) {
            return Optional.of((optionalInteger.get() * optionalInteger.get()));
        }
        return Optional.of(0);
    }
}
