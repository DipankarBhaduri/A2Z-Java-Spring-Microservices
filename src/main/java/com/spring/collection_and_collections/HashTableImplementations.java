package com.spring.collection_and_collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableImplementations {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(2, "Dipankar");
        hashtable.put(3, "Ajay");
        hashtable.put(2, "Pritam");

        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
}
