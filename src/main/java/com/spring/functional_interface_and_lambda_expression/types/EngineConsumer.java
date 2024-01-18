package com.spring.functional_interface_and_lambda_expression.types;

@FunctionalInterface
public interface EngineConsumer<T> {
    void power(T t);
}
