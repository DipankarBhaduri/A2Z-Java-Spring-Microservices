package com.spring.reflection_in_java;

import com.spring.java_8_stream_api.practice_problems.utils.Employee;
import java.lang.reflect.Field;

public class CreateInstanceOfAClass {
    public static void main(String[] args) {
        Class<?>[] employee = Employee.class.getInterfaces();
        Field [] fields = employee.getClass().getDeclaredFields();
        System.out.println(fields.length);
    }
}
