package com.spring.collection_and_collections;

import java.util.PriorityQueue;

public class PriorityQueueImplementations {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(7);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
