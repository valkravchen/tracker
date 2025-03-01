package ru.enumeration;

public class CarService {
    public static void main(String[] args) {
        Status[] statuses = Status.values();
        for (Status status : statuses) {
            System.out.println("Название статуса: " + status.name()
                    + ", порядковый номер статуса: " + status.ordinal());
        }
    }
}

