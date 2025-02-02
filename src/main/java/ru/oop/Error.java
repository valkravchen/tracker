package ru.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Значение active = " + active);
        System.out.println("Значение status = " + status);
        System.out.println("Значение message = " + message);
    }

    public static void main(String[] args) {
        Error objectDefaultValues = new Error();
        Error objectValues1 = new Error(false, 3, "Error");
        Error objectValues2 = new Error(true, 2025, "Февраль");
        objectDefaultValues.printInfo();
        objectValues1.printInfo();
        objectValues2.printInfo();
    }
}
