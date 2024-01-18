package com.spring.functional_interface_and_lambda_expression.types;

@FunctionalInterface
public interface EnginePredicate <T> {
    boolean engine(T t);
}
