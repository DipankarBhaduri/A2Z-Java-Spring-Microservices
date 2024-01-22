package com.spring.collection_and_collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetImplementations {
    public static void main(String[] args) {
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();
        integerLinkedHashSet.add(3);
        integerLinkedHashSet.add(7);
        integerLinkedHashSet.add(2);

        Iterator <Integer> integerIterator = integerLinkedHashSet.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
    }
}
