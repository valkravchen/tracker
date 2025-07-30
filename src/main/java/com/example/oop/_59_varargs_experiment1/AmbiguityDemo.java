package com.example.oop._59_varargs_experiment1;

public class AmbiguityDemo {
    void processWithHeader(String header, String... messages) {
        System.out.println("Заголовок " + header);
        if (messages.length > 0) {
            System.out.println("Сообщения: " + String.join(", ", messages));
        } else {
            System.out.println("Сообщения отсутствуют");
        }
    }

    void processAll(String... allMessages) {
        if (allMessages.length == 0) {
            System.out.println("Нет сообщений для обработки");
        } else {
            System.out.println("Все сообщения: " + String.join(", ", allMessages));
        }
    }

    void handleNull(String... strings) {
        System.out.println("Обработка строк: " + (strings == null ? "null-массив" : "массив-из-" +
                strings.length + "-элементов"));
    }

    void handleNull(Integer... numbers) {
        System.out.println("Обработка чисел: " + (numbers == null ? "null-массив" : "массив-из-" +
                numbers.length + "-элементов"));
    }

    void demonstrateAmbiguity() {
        System.out.println("Демонстрация разрешения перегрузки:");
        processWithHeader("заголовок-без-сообщений");
        processWithHeader("заголовок-с-сообщениями", "сообщение1", "сообщение2");
        processAll("сообщение1", "сообщение2", "сообщение3");
        System.out.println("Решение неоднозначности с null:");
        handleNull((String[]) null);
        handleNull((Integer[]) null);
//        handleNull(null);
        System.out.println("Пример потенциальной неоднозначности (закомментировано):");
        // Если бы у нас были методы process(String, String...) и process(String...)
        // то вызов process("один-аргумент") был бы неоднозначным
    }

    public static void main(String[] args) {
        AmbiguityDemo demo = new AmbiguityDemo();
        demo.demonstrateAmbiguity();
    }
}
