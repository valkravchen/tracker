package com.example.oop._51_enum_example;

public class Task {
    private String taskName;
    private Priority priority;

    Task(String taskName, Priority priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    void showTask() {
        System.out.println("Задача: " + taskName + " с приоритетом " + priority);
    }

    public static void main(String[] args) {
        Task task  = new Task("важная-задача", Priority.ВЫСОКИЙ);
        task.showTask();
    }
}
