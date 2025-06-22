package com.example.oop.FactoryMethod;

public class Application {
    private Dialog dialog;

    void initialize(String osType) {
        if (osType.equals("Windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new WindowsDialog();
        }
    }

    void main() {
        initialize(System.getProperty("os.name"));
        dialog.renderWindow();
    }

    public static void main(String[] args) {
        new Application().main();
    }
}
