package com.example.oop.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueue<>(3);
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        System.out.println(queue.element());
    }
}
