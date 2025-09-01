package com.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueVisitors {
    public static void main(String[] args) {
        List<String> visitLogs = new ArrayList<>();
        visitLogs.add("192.168.1.100");
        visitLogs.add("10.0.0.5");
        visitLogs.add("192.168.1.100");
        visitLogs.add("203.45.67.89");
        visitLogs.add("10.0.0.5");
        visitLogs.add("192.168.1.101");
        visitLogs.add("192.168.1.100");
        System.out.println("=== АНАЛИЗ ПОСЕТИТЕЛЕЙ САЙТА ===\n");
        System.out.println("Все логи посещений: " + visitLogs);
        System.out.println("Общее количество запросов: " + visitLogs.size());
        Set<String> uniqueVisitors = new HashSet<>(visitLogs);
        System.out.println("\nУникальные посетители: " + uniqueVisitors);
        System.out.println("Количество уникальных посетителей: " + uniqueVisitors.size());
        analyzeVisitorActivity(visitLogs, uniqueVisitors);
    }

    public static void analyzeVisitorActivity(List<String> logs, Set<String> unique) {
        System.out.println("\n=== АНАЛИЗ АКТИВНОСТИ ===");
        for (String visitors : unique) {
            int visits = 0;
            for (String log : logs) {
                if (log.equals(visitors)) {
                    visits++;
                }
            }
            System.out.println("IP " + visitors + ": " + visits + " посещений");
        }
    }
}
