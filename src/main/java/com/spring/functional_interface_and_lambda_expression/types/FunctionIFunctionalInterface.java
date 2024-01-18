package com.spring.functional_interface_and_lambda_expression.types;

public class FunctionIFunctionalInterface {
    public static void main(String[] args) {
        EngineFunctional functional = (value) -> {
            if ((int)value > 10) {
                return "BIG";
            } else {
                return "SMALL";
            }
        };

        String response = (String) functional.power(2);
        System.out.println(response);
    }
}
