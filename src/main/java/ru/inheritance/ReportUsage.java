package ru.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("David Gilmour", "Shine On You Crazy Diamond");
        System.out.println(text);
    }
}
