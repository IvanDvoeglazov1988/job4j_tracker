package ru.job4j.oop;

public class Jar {
    private int value;

    public Jar(int size) {
        this.value = size;
    }

    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Jar second = new Jar(7);
        Jar first = new Jar(10);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);

    }
}