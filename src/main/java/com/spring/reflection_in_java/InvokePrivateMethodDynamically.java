package com.spring.reflection_in_java;

import com.spring.reflection_in_java.utils.MathUsingReflection;
import java.lang.reflect.Method;
import java.util.Arrays;

public class InvokePrivateMethodDynamically {
    public static void main(String[] args) {
        MathUsingReflection mathUsingReflection = new MathUsingReflection();
        Class <?> clazz = mathUsingReflection.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        Arrays.stream(methods).forEach(method -> {
            if (method.getName().equals("publicStaticMethodForSumOfTwoNumber")) {
                try {
                    int ans = (int) method.invoke(null, 4, 6);
                    System.out.println("publicStatic : " + ans);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else if (method.getName().equals("publicMethodForSumOfTwoNumber")) {
                try {
                    double ans = (double) method.invoke(mathUsingReflection, 4.8, 6.6);
                    System.out.println("public : " + ans);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else if (method.getName().equals("privateStaticMethodForSumOfTwoNumber")) {
                try {
                    method.setAccessible(true);
                    double ans = (double) method.invoke(null, 4.8, 6.6);
                    System.out.println("privateStatic : " + ans);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else if (method.getName().equals("privateMethodForSumOfTwoNumber")) {
                try {
                    method.setAccessible(true);
                    double ans = (double) method.invoke(mathUsingReflection, 4.8, 6.6);
                    System.out.println("private : " + ans);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
