package ru.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return switch (eng) {
            case "Creation" -> "Созидание = " + eng;
            case "World" -> "Мир = " + eng;
            case "Hello" -> "Привет = " + eng;
            case "Dummy" -> "Манекен = " + eng;
            case "Program" -> "Программа " + eng;
            default -> "Неизвестное слово " + eng;
        };
    }

    public static void main(String[] args) {
        DummyDic translator = new DummyDic();
        System.out.println(translator.engToRus("Creation"));
    }
}
