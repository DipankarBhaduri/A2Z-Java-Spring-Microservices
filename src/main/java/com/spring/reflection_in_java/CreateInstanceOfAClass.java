package com.spring.reflection_in_java;

import java.lang.reflect.Field;
import com.spring.java_8_stream_api.practice_problems.utils.Employee;

public class CreateInstanceOfAClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class<?> employee = Employee.class.newInstance().getClass();
        Field [] fields = employee.getDeclaredFields();
        System.out.println(fields.length);
    }
}