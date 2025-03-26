package ru.tracker.input;

public class ValidateInput extends ConsoleInput {
    @Override
    public int askInt(String question) {
        while (true) {
            try {
                String input = super.askStr(question);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("⚠ Ошибка: введите целое число!");
            }
        }
    }
}
