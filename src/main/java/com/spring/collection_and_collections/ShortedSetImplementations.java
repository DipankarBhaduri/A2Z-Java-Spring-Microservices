package com.spring.collection_and_collections;

import java.util.*;

public class ShortedSetImplementations {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        NavigableSet<Integer> navigableSet = new TreeSet<>();

        sortedSet.add(4);
        sortedSet.add(3);
        sortedSet.add(5);

        Iterator<Integer> integerIterator = sortedSet.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        navigableSet.add(7);
        navigableSet.add(4);
        navigableSet.add(16);
        navigableSet.add(5);

        int value = navigableSet.floor(6);
        value = navigableSet.ceiling(6);
        System.out.println(value);
    }
}
