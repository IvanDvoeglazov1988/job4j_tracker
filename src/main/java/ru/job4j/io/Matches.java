package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches <= count) {
                for (int i = matches; i < count; i++) {
                    if (matches <= 3 && matches != 0) {
                        System.out.println("Кол-во спичек: " + (count - matches));
                        break;
                    } else {
                        System.out.println("Неверное значение, введите число от 1 до 3");
                        turn = !turn;
                        break;
                    }
                }
                count = count - matches;
            } else if (matches > 3) {
                System.out.println("Неверное значение, введите число от 1 до 3");
                turn = !turn;
            }

        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
