package ru.tracker.input;

import ru.tracker.output.Output;

public class ValidateInput implements Input {
    private final Output output;
    private final Input input;

    public ValidateInput(Output output, Input input) {
        this.output = output;
        this.input = input;
    }

    @Override
    public String askStr(String question) {
        return input.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            String result = input.askStr(question);
            if (!isNumber(result)) {
                System.out.println("Пожалуйста, введите корректные данные");
                continue;
            }
            value = Integer.parseInt(result);
            invalid = false;
        } while (invalid);
        return value;
    }

    private boolean isNumber(String value) {
        boolean result = true;
        char[] check = value.toCharArray();
        for (char num : check) {
            if (num < 48 || num > 57) {
                result = false;
                break;
            }
        }
        return result;
    }
}


