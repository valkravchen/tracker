package com.com.example;

public class Outer {
   Runnable task = new Runnable() {
       @Override
       public void run() {
           System.out.println("Проверка анонимности");
       }
   };

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.task.run();
    }
}
