package ru.modernjavainaction.chap01;

import java.util.ArrayList;
import java.util.List;

public class FilteringApples {
    public static void main(String[] args) {
        List<Apple> inventory = List.of(
                new Apple(80, "green" ),
                new Apple(155, "green" ),
                new Apple(120, "red" )
        );
        System.out.println(filterGreenApples(inventory));
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static class Apple {
        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return String.format("Apple{color='%s', weight=%d}", color, weight);
        }
    }
}
