package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        System.out.println("Игра 11 спичек . каждый игрок убирает от 1 до 3 спичек за ход, побеждает тот кто уберет последнюю спичку.");
        game();
    }


    public static void game() {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int turn = 0;
        int count = 11;
        while (run) {
            if (turn == 0 || turn % 2 == 0) {
                System.out.println("Игрок 1, Ваш ход: ");
            } else {
                System.out.println("Игрок 2, Ваш ход: ");
            }
            turn++;
            int select = Integer.valueOf(input.nextLine());
            if (select > 3) {
                System.out.println("Выберите другое кол-во спичек");
            } else if (select < count) {
                System.out.println("На столе осталось " + (count - select) + " спичек");
                count = count - select;
            } else {
                System.out.println("Игра окончена. Вы победили!");
                run = false;
            }

        }
    }
}

