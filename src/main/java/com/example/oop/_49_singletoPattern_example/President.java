package com.example.oop._49_singletoPattern_example;

public class President {
    private static President currentPresident;
    private String name;
    private String country;

    private President(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public static President getCurrentPresident(String name, String country) {
        if (currentPresident == null) {
            currentPresident = new President(name, country);
            System.out.println("Избран новый президент: " + name + " страны " + country);
        } else {
            System.out.println("Президент уже есть: " + currentPresident.name
                    + " страны " + country);
        }
        return currentPresident;
    }

    public void makeDecision(String decision) {
        System.out.println("Президент " + name + " принял решение: " + decision);
    }

    public void showInfo() {
        System.out.println("Действующий президент: " + name + " страны " + country);
    }

    public static void main(String[] args) {
        President president = new President("Президент", "Страна");
        president.showInfo();
    }
}
