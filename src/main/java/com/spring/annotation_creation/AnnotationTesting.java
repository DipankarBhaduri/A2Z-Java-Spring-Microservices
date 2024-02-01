package com.spring.annotation_creation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTesting {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        CatForAnnotationCreation cat = new CatForAnnotationCreation();
        cat.setAge(3);
        cat.setName("Meao");

        if (cat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("Cat Class is very Important");
        } else {
            System.out.println("Not so much important");
        }

        DogForAnnotationCreation dog = new DogForAnnotationCreation();
        dog.setAge(6);
        dog.setName("Jimmy");

        for (Method method : dog.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(TotalRuntime.class)) {
                for (int i = 0; i < method.getAnnotation(TotalRuntime.class).times(); i++) {
                    method.invoke(dog);
                }
            }
        }
    }
}
