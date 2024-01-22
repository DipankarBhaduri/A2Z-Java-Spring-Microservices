package com.spring.collection_and_collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementations {
    public static void main(String[] args) {
        // added code for ArrayDeque :->
        Queue<Integer> queue = new ArrayDeque<>();
        addValueInQueue(queue);

        // added code for LinkedList :->
        queue = new LinkedList<>();
        addValueInQueue(queue);
    }

    private static void addValueInQueue(Queue<Integer> queue) {
        queue.add(3);
        queue.add(4);
        queue.add(5);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
