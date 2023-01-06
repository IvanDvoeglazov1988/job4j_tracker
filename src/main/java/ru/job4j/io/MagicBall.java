package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    private int answer = new Random().nextInt(3);

    public int getAnswer() {
        return answer;
    }

    public void ans() {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        if (getAnswer() == 0) {
            System.out.print("Да");
        } else if (getAnswer() == 1) {
            System.out.print("Нет");
        } else {
            System.out.print("Может быть");
        }
    }

    public static void main(String[] args) {
        MagicBall magicBall = new MagicBall();
        magicBall.ans();
    }
}
