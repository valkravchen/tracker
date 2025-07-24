package com.example.oop.localClasses_41.experiment1;

public class ScopeAccessDemo {
    private String instanceField = "поле-экземпляра-внешнего";
    private static String staticField = "статическое-поле-внешнего";

    public void demonstrateAccess(String methodParameter) {
        final String finalLocal = "финальная-локальная-переменная";
        String effectivelyFinal = "эффективно-финальная-переменная";

        class AccessTester {
            private String localClassField = "поле-локального-класса";

            void showAllAccess() {
                System.out.println("Локальный класс: " + localClassField);
                System.out.println("Параметр метода: " + methodParameter);
                System.out.println("Final переменная: " + finalLocal);
                System.out.println("Effectively final: " + effectivelyFinal);
                System.out.println("Поле экземпляра: " + instanceField);
                System.out.println("Статическое поле: " + staticField);
            }
        }

        AccessTester tester = new AccessTester();
        tester.showAllAccess();
    }

    public static void main(String[] args) {
        ScopeAccessDemo demo = new ScopeAccessDemo();
        demo.demonstrateAccess("параметр-из-main");
    }
}
