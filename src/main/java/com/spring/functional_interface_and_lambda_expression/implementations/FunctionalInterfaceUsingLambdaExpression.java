package com.spring.functional_interface_and_lambda_expression.implementations;

public class FunctionalInterfaceUsingLambdaExpression {
    public static void main(String[] args) {
        Cricket cricket = () -> {
            System.out.println("Kolkata win the Game !!!");
        };
        cricket.totalPlayers();
    }
}
