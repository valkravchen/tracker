package com.example.oop.nested_37.experiment2;

public class AccessDemo {
    private String instanceField = "экземпляр";
    private static String staticField = "статическое";

    static class StaticAccessor {
        public void showAccess() {
            System.out.println("Static доступ: " + staticField);
        }
    }

    class InstanceAccessor {
        public void showAccess() {
            System.out.println("Instance доступ: " + instanceField + " и " + staticField);
        }
    }

    public void demonstrateLocalAccess(String parameter) {
        String localVar = "локальная";
        class LocalAccessor {
            public void showAccess() {
                System.out.println("Local доступ: " + parameter + ", "
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
        accessDemo.demonstrateLocalAccess("параметр");
    }
}
