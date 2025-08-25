package learning.basics;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я загадал число от 1 до 100. Попробуй угадать!");
        for (int i = 1; i <= 100; i++) {
            System.out.print("Введи число: ");
            int userGuess = scanner.nextInt();
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Введи число от 1 до 100!");
                i--;
            } else {
                if (userGuess == secretNumber) {
                    System.out.println("Угадал за " + i + " попытки");
                    break;
                } else if (userGuess > secretNumber) {
                    System.out.println("Меньше!");
                } else {
                    System.out.println("Больше!");
                }
            }
        }
        scanner.close();
    }
}


