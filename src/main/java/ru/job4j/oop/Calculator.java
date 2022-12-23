package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int divide(int num) {
        return num / x;
    }

    public int sumAllOperation(int num) {
        return sum(num) + divide(num) + minus(num) + multiply(num);
    }

    public int multiply(int num) {
        return num * x;
    }

    public int minus(int num) {
        return num - x;
    }

    public void printInfo(int num) {
        System.out.println("Данное значение: " + num);
        System.out.println("Арифметическая операция, сложение: " + sum(num));
        System.out.println("Арифметическая операция, вычитание: " + minus(num));
        System.out.println("Арифметическая операция, деление: " + divide(num));
        System.out.println("Арифметическая операция, умножение: " + multiply(num));
        System.out.println("Cумма всех арифметических операция: " + sumAllOperation(num));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.printInfo(10);

    }
}
