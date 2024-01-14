package com.spring.reflection_in_java;

import com.spring.java_8_stream_api.practice_problems.utils.Employee;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class PrintConstructorsUsingReflection {
    public static void main(String[] args) {
        Constructor [] constructors = Employee.class.getConstructors();
        Arrays.stream(constructors).forEach(constructor -> System.out.println(constructor.getName()));
    }
}
