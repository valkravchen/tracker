package com.example.oop.encapsulation;

public class SamePackageUsage {
    public void demonstrate() {
        AccessModifierDemo obj4 = AccessModifierDemo.createSpecial();
    }

    public static void main(String[] args) {
        SamePackageUsage samePackageUsage = new SamePackageUsage();
        samePackageUsage.demonstrate();
    }
}
