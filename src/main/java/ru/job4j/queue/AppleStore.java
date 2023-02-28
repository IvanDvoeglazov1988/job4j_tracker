package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String rsl = "";
        int a = count;
        for (Customer i : queue) {
            a--;
            if (a == 0) {
                rsl = i.name();
                break;
            }
        }
        return rsl;
    }

    public String getFirstUpsetCustomer() {
        String rsl = "";
        int a = count;
        for (Customer i : queue) {
            a--;
            if (a < 0) {
                rsl = i.name();
                break;
            }
        }
        return rsl;
    }
}