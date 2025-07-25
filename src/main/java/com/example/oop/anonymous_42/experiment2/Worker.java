package com.example.oop.anonymous_42.experiment2;

public abstract class Worker {
    protected String workerId;

    public Worker(String workerId) {
        this.workerId = workerId;
    }

    abstract void work();

    void showInfo() {
        System.out.println("Работник " + workerId);
    }
}
