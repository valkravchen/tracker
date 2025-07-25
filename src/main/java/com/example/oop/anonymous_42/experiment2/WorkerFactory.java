package com.example.oop.anonymous_42.experiment2;

public class WorkerFactory {
    private String factoryName = "фабрика-анонимных-работников";

    public Worker createWorker(String workerType) {
        final String creationContext = "создание-работника-" + workerType;
        return new Worker("анонимный-" + workerType) {
            @Override
            void work() {
                System.out.println("Анонимный работник выполняет задачу в " + creationContext);
                System.out.println("Фабрика: " + factoryName);
            }
        };
    }

    public static void main(String[] args) {
        WorkerFactory factory = new WorkerFactory();
        Worker specialist = factory.createWorker("специалист");
        specialist.showInfo();
        specialist.work();
        Worker assistant = factory.createWorker("помощник");
        assistant.showInfo();
        assistant.work();
    }
}
