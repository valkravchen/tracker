package com.example.oop._51_enum_experiment1;

public class TrafficManager {
    public void analyzeSignal(TrafficLight signal) {
        System.out.println("Анализ сигнала: " + signal);
        System.out.println("Порядковый номер: " + signal.ordinal());
        System.out.println("Название константы: " + signal.name());
        signal.showInfo();
    }

    public void simulateTraffic(TrafficLight starLight, int cycles) {
        TrafficLight current = starLight;
        System.out.println("Демонстрация всех сигналов через values():");
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println("Сигнал " + (light.ordinal() + 1) +
                    ": " + light.getDescription());
        }
        System.out.println("Симуляция работы светофора:");
        for (int i = 1; i <= cycles; i++) {
            System.out.println("Цикл " + i + ": " + current.getDescription() +
                    " (" + current.getDurationSeconds() + " сек)");
            current = current.getNext();
        }
    }

    public static void main(String[] args) {
        TrafficManager manager = new TrafficManager();
        manager.analyzeSignal(TrafficLight.ЖЕЛТЫЙ);
        manager.simulateTraffic(TrafficLight.КРАСНЫЙ, 4);
    }
}
