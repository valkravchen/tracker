package com.com.example;

public class Outer {
   void printMessage(String message) {
       int repeat = 2;
       Runnable r = new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < repeat; i++) {
                   System.out.println(message);
               }
           }
       };
       new Thread(r).start();
   }

    public static void main(String[] args) {
       Outer outer = new Outer();
       outer.printMessage("Здравия!");
    }
}
