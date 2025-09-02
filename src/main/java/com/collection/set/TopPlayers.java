package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TopPlayers {
    static class Player implements Comparable<Player> {
        String name;
        int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public int compareTo(Player other) {
            return Integer.compare(other.score, this.score);
        }

        @Override
        public String toString() {
            return name + ": " + score;
        }
    }

    public static void main(String[] args) {
        Set<Player> topPlayers = new TreeSet<>();
        System.out.println("=== РЕЙТИНГ ИГРОКОВ ===\n");
        addPlayer(topPlayers, "Алексей", 1250);
        addPlayer(topPlayers, "Мария", 980);
        addPlayer(topPlayers, "Игорь", 1340);
        addPlayer(topPlayers, "Анна", 1100);
        addPlayer(topPlayers, "Дмитрий", 890);
        showTopPlayers(topPlayers);
        System.out.println("\nНовый игрок присоединился:");
        addPlayer(topPlayers, "Елена", 1200);
        showTopPlayers(topPlayers);
    }

    public static void addPlayer(Set<Player> players, String name, int score) {
        Player newPlayer = new Player(name, score);
        boolean added = players.add(newPlayer);
        if (added) {
            System.out.println("Добавлен игрок " + newPlayer);
        } else {
            System.out.println("Игрок уже существует: " + newPlayer);
        }
    }
    public static void showTopPlayers(Set<Player> players) {
        System.out.println("\nТоп игроков:");
        int position = 1;
        for (Player player : players) {
            System.out.println("  " + position + ". " + player);
            position++;
        }
    }
}
