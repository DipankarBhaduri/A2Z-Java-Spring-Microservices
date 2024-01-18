package com.spring.functional_interface_and_lambda_expression.types;

public class PredicateFunctionalInterface {
    public static void main(String[] args) {
        EnginePredicate enginePredicate = (val) -> {
            return ((int)val % 2 == 0);
        };

        boolean response = enginePredicate.engine(44);
        System.out.println(response);
    }
}
