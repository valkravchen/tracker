package ru.oop;

public class WoodDoll {
    private WoodDoll child;
    private String name;

    public WoodDoll(WoodDoll child, String name) {
        this.child = child;
        this.name = name;
    }

    public void about() {
        System.out.println("Hello, my name is " + name);
        if (child != null) {
            System.out.println("I have a child. Let's I call her...");
            child.about();
        } else {
            System.out.println("I don't have a child.");
        }
    }

    public static void main(String[] args) {
        WoodDoll little = new WoodDoll(null, "Little Doll");
        WoodDoll middle = new WoodDoll(little, "Middle Doll");
        WoodDoll big = new WoodDoll(middle, "Big Doll");
        big.about();
    }
}
