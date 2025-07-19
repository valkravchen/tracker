package com.example.oop.encapsulation;

public class SamePackageUsage {
    public void demonstrate() {
        AccessModifierDemo obj1 = new AccessModifierDemo();
        AccessModifierDemo obj2 = new AccessModifierDemo("тест");
        AccessModifierDemo obj3 = new AccessModifierDemo(42);
        AccessModifierDemo obj4 = AccessModifierDemo.createSpecial();
    }

    public static void main(String[] args) {
        SamePackageUsage samePackageUsage = new SamePackageUsage();
        samePackageUsage.demonstrate();
    }
}
