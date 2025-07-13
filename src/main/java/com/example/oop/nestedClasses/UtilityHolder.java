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

    public String getHolderInfo() {
        return "Держатель: " + holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public static class Helper {
        private final int helperId;

        public Helper(int helperId) {
            this.helperId = validateHelperId(helperId);
        }

        private int validateHelperId(int helperId) {
            if (helperId < 1) {
                throw new IllegalArgumentException("ID помощника не может быть меньше 1");
            }
            return helperId;
        }

        public int getHelperId() {
            return helperId;
        }
    }

    public static void main(String[] args) {
        UtilityHolder.Helper helper1 = new Helper(1);
        UtilityHolder.Helper helper2 = new Helper(2);
        UtilityHolder.Helper helper3 = new Helper(3);
        System.out.println(helper1.getHelperId());
        System.out.println(helper2.getHelperId());
        System.out.println(helper3.getHelperId());
    }
}
