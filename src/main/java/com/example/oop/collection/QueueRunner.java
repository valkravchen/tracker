package com.example.oop.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        String temp = queue.poll();
        System.out.println(temp);
//        queue.add("first");
//        queue.add("second");
//        queue.add("third");
//
//        for (String string: queue) {
//            System.out.println(string);
//        }
//        queue.remove();
//        System.out.println();
//        System.out.println("State of Queue after remove: ");
//        for (String string : queue) {
//            System.out.println(string);
//        }
    }
}
