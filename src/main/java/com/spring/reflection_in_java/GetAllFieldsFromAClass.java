package com.spring.reflection_in_java;

import com.spring.java_8_stream_api.practice_problems.utils.Employee;
import java.lang.reflect.Field;
/**
Get and display all the fields of a class using reflection.
 */
public class GetAllFieldsFromAClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Dipankar", 25);
        Field[] fields = employee.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName().toString());
        }
    }
}
