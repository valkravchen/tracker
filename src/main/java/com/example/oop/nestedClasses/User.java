package com.example.oop.nestedClasses;

public class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return "Пользователь " + name + ", возраст: " + age;
    }

    public static class Builder {
        String tempName;
        int tempAge;

        public Builder setName(String name) {
            this.tempName = name;
            return this;
        }

        public Builder setAge(int age) {
            this.tempAge = age;
            return this;
        }

        public User build() {
            return new User(tempName, tempAge);
        }

        public static void main(String[] args) {
            User user1 = new Builder().setName("Иван").setAge(25).build();
            System.out.println(user1.getInfo());
        }
    }
}
