package ru.job4j.search;


import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person i : persons) {
            if (key.contains(i.getPhone()) || key.contains(i.getAddress())
                    || key.contains(i.getName()) || key.contains(i.getSurname())) {
                result.add(i);
            }
        }
        return result;
    }
}