package com.example.oop.anonymous_42.experiment1;

public class MathOperations {
    private String operatorName = "математический-оператор";

    void performOperation(String operation, int num1, int num2) {
        final String context = "контекст-операции-" + operation;
        Calculator calc = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                if (operation.equals("сложение")) {
                    return a + b;
                } else if (operation.equals("умножение")) {
                    return a * b;
                } else {
                    return 0;
                }
            }

            @Override
            public void showResult(int result) {
                System.out.println("Анонимный калькулятор от " + operatorName +
                        " в " + context + ": результат " + result);
            }
        };

        int result = calc.calculate(num1, num2);
        calc.showResult(result);
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        math.performOperation("сложение", 15, 25);
        math.performOperation("умножение", 7, 8);
    }
}
