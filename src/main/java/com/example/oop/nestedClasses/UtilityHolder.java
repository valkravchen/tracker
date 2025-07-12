package com.example.oop.nestedClasses;

public class UtilityHolder {
    private final String holderName;

    public UtilityHolder(String holderName) {
        this.holderName = validateHolderName(holderName);
    }

    private String validateHolderName(String holderName) {
        if (holderName == null || holderName.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя держателя не может быть null или пустой строкой");
        }
        return holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public static class Helper {
        private final int helperId;

        public Helper(int helperId) {
            this.helperId = helperId;
        }

        public int getHelperId() {
            return helperId;
        }
    }

    public static class Counter {
        private int count;

        public Counter(int initial) {
            this.count = initial;
        }

        public void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Helper helper = new Helper(1);
        Helper helper1 = new Helper(2);
        Helper helper2 = new Helper(3);
        System.out.println(helper.getHelperId());
        System.out.println(helper1.getHelperId());
        System.out.println(helper2.getHelperId());
    }
}
