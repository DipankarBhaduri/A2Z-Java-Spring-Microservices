package com.spring.functional_interface_and_lambda_expression.types;

public class SupplierFunctionalInterface {
    public static void main(String[] args) {
        EngineSupplier engineSupplier = () -> "Very PowerFul Engine" ;

        String response = (String) engineSupplier.power();
        System.out.println(response);
    }
}


