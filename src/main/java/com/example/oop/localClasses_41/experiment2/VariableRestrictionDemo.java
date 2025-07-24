package com.example.oop.localClasses_41.experiment2;

public class VariableRestrictionDemo {
    void demonstrateRestrictions() {
        String accessibleVar = "доступная-переменная";
        String restrictedVar = "ограниченная-переменная";

        class VariableAccessor {
            void accessVariables() {
                System.out.println("Доступ к effectively final: " + accessibleVar);
//                System.out.println("Нет доступа: " + restrictedVar); // ОШИБКА: переменная изменяется
            }
        }
        restrictedVar = "измененная-переменная";
        System.out.println("Переменная restrictedVar изменена на: " + restrictedVar);
        VariableAccessor accessor = new VariableAccessor();
        accessor.accessVariables();
    }

    public static void main(String[] args) {
        VariableRestrictionDemo demo = new VariableRestrictionDemo();
        demo.demonstrateRestrictions();
    }
}
