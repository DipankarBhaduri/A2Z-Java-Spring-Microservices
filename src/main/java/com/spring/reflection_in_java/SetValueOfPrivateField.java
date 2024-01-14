package com.spring.reflection_in_java;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class SetValueOfPrivateField {
    public static void main(String[] args) {
        Person person = new Person("Dipankar", 22);
        setValueInPrivateField(person);
        System.out.println("Employee Name : "+person.getName()+", Employee Age : "+person.getAge());
    }

    private static void setValueInPrivateField(Person person) {
        Field[] declaredFields = person.getClass().getDeclaredFields();
        Arrays.stream(declaredFields).forEach(field -> {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                try {
                    field.set(person, "Dipakar Bhaduri");
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            } else if (field.getName().equals("age")) {
                field.setAccessible(true);
                try {
                    field.set(person, 27);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            if (Modifier.isTransient(field.getModifiers())) {

            }
        });
    }
}

@AllArgsConstructor
@Getter
class Person {
    private String name;
    private int age;
}