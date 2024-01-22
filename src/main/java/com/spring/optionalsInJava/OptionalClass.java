package com.spring.optionalsInJava;

import java.util.Optional;

/**
 * Write a method that accepts an Optional<String> parameter and returns the length
 * of the string if present, otherwise returns a default length of 0.
 */
public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> string = Optional.ofNullable(null);
        Optional<Integer> integerOptional = getLength(string);
        System.out.println(integerOptional.get());
    }

    public static Optional<Integer> getLength (Optional<String> stringOptional) {
        return (stringOptional.isPresent()) ? Optional.of(stringOptional.get().length()) : Optional.of(0);
    }
}
