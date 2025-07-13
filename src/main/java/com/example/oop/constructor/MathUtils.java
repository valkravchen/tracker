package com.example.oop.constructor;

public class MathUtils {
    private MathUtils(){
    }
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        System.out.println(MathUtils.square(5));
    }
}
