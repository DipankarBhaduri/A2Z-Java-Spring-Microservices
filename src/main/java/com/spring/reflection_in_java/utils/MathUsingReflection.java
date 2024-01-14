package com.spring.reflection_in_java.utils;

public class MathUsingReflection {
    private static <T extends Number> T privateStaticMethodForSumOfTwoNumber (T num1, T num2) {
        if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        }
    }

    private <T extends Number> T privateMethodForSumOfTwoNumber (T num1, T num2) {
        if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        }
    }

    public static <T extends Number> T publicStaticMethodForSumOfTwoNumber (T num1, T num2) {
        if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        }
    }

    public <T extends Number> T publicMethodForSumOfTwoNumber (T num1, T num2) {
        if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        }
    }
}
