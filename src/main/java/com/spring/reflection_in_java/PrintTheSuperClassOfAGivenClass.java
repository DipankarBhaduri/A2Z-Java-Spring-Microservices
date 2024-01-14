package com.spring.reflection_in_java;

public class PrintTheSuperClassOfAGivenClass {
    public static void main(String[] args) {
        B b = new B();
        Class<?> superclass = b.getClass().getSuperclass();
        b.getClass().getInterfaces();

        if (superclass != null) {
            System.out.println("Super Class Name : "+superclass.getName());
        } else {
            System.out.println("There is no super class");
        }
    }
}


class B extends A{
    private int age;
}
class A {
    private String name;
}