package com.example.oop.nested_40.experiment2;

public class CreationComparison {
    private String outerInfo = "экземпляр-внешнего-класса";

    static class StaticObject {
        private String staticInfo;

        public StaticObject(String info) {
            staticInfo = "статический-" + info;
        }

        public void  display() {
            System.out.println("Независимый объект: " + staticInfo);
        }
    }

    class InnerObject {
        private String innerInfo;
        public InnerObject(String info) {
            innerInfo = "внутренний-" + info;
        }

        public void display() {
            System.out.println("Привязанный объект: " + innerInfo + " из " + outerInfo);
        }
    }

    public static void main(String[] args) {
        System.out.println("Создание статических объектов без внешнего экземпляра:");
        CreationComparison.StaticObject object1 = new CreationComparison.StaticObject("объект-1");
        CreationComparison.StaticObject object2 = new CreationComparison.StaticObject("объект-2");
        CreationComparison.StaticObject object3 = new CreationComparison.StaticObject("объект-3");
        object1.display();
        object2.display();
        object3.display();
        System.out.println("Создание внутренних объектов требует внешний экземпляр:");
        CreationComparison outer1 = new CreationComparison();
        CreationComparison.InnerObject innerObject1 = outer1.new InnerObject("связанный-1");
        CreationComparison.InnerObject innerObject2 = outer1.new InnerObject("связанный-2");
        innerObject1.display();
        innerObject2.display();
        CreationComparison outer2 = new CreationComparison();
        CreationComparison.InnerObject innerObject3 = outer2.new InnerObject("связанный-3");
        innerObject3.display();
    }
}
