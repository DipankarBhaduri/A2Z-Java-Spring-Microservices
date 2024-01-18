package com.spring.functional_interface_and_lambda_expression.types;

public class ComsumerFunctionalInterface {
    public static void main(String[] args) {
        EngineConsumer engineConsumer = (val) -> {
            System.out.println(val + "cc engine");
        };

        engineConsumer.power(1200);
    }
}
