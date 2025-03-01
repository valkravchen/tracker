package ru.enumeration;

public class CarService {
    private enum Status {
        ACCEPTED,
        INWORK,
        WAITING,
        FINISHED
    }

    public static void main(String[] args) {
        System.out.println(Status.FINISHED);
    }
}

