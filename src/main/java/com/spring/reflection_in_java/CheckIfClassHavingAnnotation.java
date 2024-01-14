package com.spring.reflection_in_java;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CheckIfClassHavingAnnotation {
    public static void main(String[] args) {

        Class<Testing> myClass = Testing.class;
        String packageName = myClass.getPackageName();
        System.out.println(packageName);

        if (hasAnnotation(myClass, MyAnnotation.class)) {
            System.out.println("Testing has the MyAnnotation");
        } else {
            System.out.println("Testing does not have the MyAnnotation");
        }
    }

    public static boolean hasAnnotation(Class<?> clazz, Class<? extends Annotation> annotationClass) {
        return clazz.isAnnotationPresent(annotationClass);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {}

@MyAnnotation
class Testing {}
