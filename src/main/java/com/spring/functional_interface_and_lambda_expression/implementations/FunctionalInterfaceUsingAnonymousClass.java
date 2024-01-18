package com.spring.functional_interface_and_lambda_expression.implementations;

public class FunctionalInterfaceUsingAnonymousClass {
    public static void main(String[] args) {
        Cricket cricket = new Cricket() {
            @Override
            public void totalPlayers() {
                System.out.println("Virat has completed 50th centuries in ODI..");
            }
        };
        cricket.totalPlayers();
    }
}
