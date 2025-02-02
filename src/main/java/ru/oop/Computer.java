package ru.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {
        multiMonitor = true;
        ssd = 500;
        cpu = "Intel Core I7-10700K";
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.printInfo();
    }
}
