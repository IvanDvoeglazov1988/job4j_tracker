package ru.job4j.poly;

public class Air implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летит по воздуху");
    }

    public static void main(String[] args) {
        Air air = new Air();
        Train train = new Train();
        Bus bus = new Bus();
        Vehicle ai = air;
        Vehicle tra = train;
        Vehicle bu = bus;
        Vehicle[] num = {ai, tra, bu};
        for (Vehicle i : num) {
            i.move();
        }
    }
}
