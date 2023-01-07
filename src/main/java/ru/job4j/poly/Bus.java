package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    @Override
    public void go() {
        System.out.println("Автобус поехал");

    }

    @Override
    public void man(int num) {
        System.out.println("Кол-во пасажиров: " + num);
    }

    @Override
    public int ref(int benz) {
        int price = 55;
        return benz * price;
    }

    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.go();
        bus.man(10);
        System.out.println("Затраты на бензин: " + bus.ref(100));
    }

    @Override
    public void move() {
        System.out.println("Автобус двигается по скоростным трассам");
    }
}
