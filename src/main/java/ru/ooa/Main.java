package ru.ooa;

public class Main {
    public static void main(String[] args) {
        final User FIRST_USER = new User("Ivan", 32);
        System.out.println("Вывод в консоль до изменения.");
        System.out.println(FIRST_USER);

        FIRST_USER.setName("Ivan Ivanov");
        FIRST_USER.setAge(33);
        System.out.println("Вывод в консоль после изменения.");
        System.out.println(FIRST_USER);
    }
}
