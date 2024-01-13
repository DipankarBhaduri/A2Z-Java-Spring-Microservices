package com.spring.generics_in_java;

/**
 * Create a generic class Box to store a single item of any type.
 */
public class CreateABoxToStoreAnyDataType {
    public static void main(String[] args) {
        Store<Integer> integerStore = new Store<>(45);
        Store<String> stringStore = new Store<>("Dipankar");
        integerStore.print();
        stringStore.print();
    }
}
class Store <T> {
    T storedData;
    public Store (T thingToStore) {
        this.storedData = thingToStore;
    }
    public void print () {
        System.out.println(storedData);
    }
}
