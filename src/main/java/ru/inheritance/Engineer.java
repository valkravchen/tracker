package ru.inheritance;

public class Engineer extends Profession {
    private int experience;

    public Engineer(int experience) {
        super(false);
        this.experience = experience;
    }

    public Engineer(int experience, boolean degree) {
        super(degree);
        this.experience = experience;
    }
}
