package ru.record;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Иван", 30);
        System.out.println("Имя: " + person.getName() + ", возраст: " + person.getAge());
        System.out.println(person);
        PersonRecord record = new PersonRecord("Иван", 30);
        System.out.println("Имя: " + record.name() + ", возраст: " + record.age());
        System.out.println(record);
        PersonRecord record1 = new PersonRecord("Иван", 30);
        System.out.println(record.equals(record1));
    }
}
