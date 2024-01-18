package com.spring.records_in_java;

public class Person {
    public static void main(String[] args) {
        PersonRecord personRecord = new PersonRecord("Dipankar", 26, "West bengal");
        System.out.println(personRecord.address());
        System.out.println(personRecord.age());
        System.out.println(personRecord.name());
        System.out.println(personRecord.hashCode());
    }
}
