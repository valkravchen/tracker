package ru.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11. Игроки по очереди берут от 1 до 3 спичек. Выигрывает тот, кто возьмет последние спички.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + ", введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= 3 && count >= matches) {
                count -= matches;
                System.out.println("Количество оставшихся спичек на столе = " + count);
                turn = !turn;
            } else {
                System.out.println("Введите корректное число (от 1 до 3 и не больше оставшихся спичек)");
            }
        }
        String winner = turn ? "второй игрок" : "первый игрок";
        System.out.println("Выиграл " + winner);
    }
}