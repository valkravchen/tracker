package ru.oop;

public class Cat {

    private String name;

    private String food;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

   public void eat(String meat) {
        this.food = meat;
   }

   public void giveNick(String nick) {
        this.name = nick;
   }

    public static void main(String[] args) {
        Cat gav = new Cat();
        Cat black = new Cat();
        gav.giveNick("Гав");
        black.giveNick("Чёрный кот");
        gav.eat("Котлета");
        black.eat("Рыба");
        gav.show();
        black.show();
    }
}
