package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> temp = new HashMap<>();
        temp.put("id@stk-online.ru", "Двоеглазов Иван Николаевич");
        for (String i : temp.keySet()) {
            String value = temp.get(i);
            System.out.println(i + " : " + value);
        }
    }
}
