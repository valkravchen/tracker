package com.example.oop.nested_37.experiment3;

public class EvolutionDemo {
    static class StaticNested {
        static int staticCounter = 0;

        static void incrementStatic() {
            staticCounter++;
            System.out.println("Статический-вложенный счетчик: " + staticCounter);
        }

        public void showType() {
            System.out.println("Тип: статический-вложенный-класс");
        }
    }

    class Inner {
        static final String TYPE = "внутренний-класс";
        static int innerCounter = 0;
        static void incrementInner() {
            innerCounter++;
            System.out.println("Внутренний счетчик: " + innerCounter);
        }
        public void showType() {
            System.out.println("Тип: " + TYPE);
        }
    }

    public void createLocalClass() {
        class LocalClass {
            static final String SCOPE = "локальный-класс";
            static int localCounter = 0;

            static public void incrementLocal() {
                System.out.println("Локальный счетчик: " + localCounter);
            }

            public void showType() {
                System.out.println("Тип: " + SCOPE);
            }
        }

        LocalClass.incrementLocal();
        LocalClass localClass = new LocalClass();
        localClass.showType();
    }

    public static void main(String[] args) {
        EvolutionDemo.StaticNested.incrementStatic();
        EvolutionDemo.StaticNested.incrementStatic();
        EvolutionDemo.Inner.incrementInner();
        EvolutionDemo.Inner.incrementInner();
    }
}
