package com.example.oop.nested_37.experiment2;

public class AccessDemo {
    private String instanceField = "поле-экземпляра";
    private static String staticField = "статическое-поле";

    static class StaticAccessor {
        public void showAccess() {
            System.out.println("Статический доступ: " + staticField);
//            System.out.println(instanceField);
        }
    }

    class InstanceAccessor {
        public void showAccess() {
            System.out.println("Внутренний доступ: " + instanceField + " и " + staticField);
        }
    }

    public void demonstrateLocalAccess(String parameter) {
        String localVar = "локальная-переменная";
        class LocalAccessor {
            public void showAccess() {
                System.out.println("Локальный доступ: " + parameter + ", "
                        + localVar + ", " + instanceField + ", " + staticField);
            }
        }

        LocalAccessor localAccessor = new LocalAccessor();
        localAccessor.showAccess();
    }

    public static void main(String[] args) {
        AccessDemo.StaticAccessor staticAccessor = new StaticAccessor();
        staticAccessor.showAccess();
        AccessDemo accessDemo = new AccessDemo();
        AccessDemo.InstanceAccessor instanceAccessor = accessDemo.new InstanceAccessor();
        instanceAccessor.showAccess();
        accessDemo.demonstrateLocalAccess("метод-параметр");
    }
}
