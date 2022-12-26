package ru.job4j.pojo;

public class Book {

    private String name;
    private int totalpages;

    public Book(String name, int totalpages) {
        this.name = name;
        this.totalpages = totalpages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalpages() {
        return totalpages;
    }

    public void setTotalpages(int totalpages) {
        this.totalpages = totalpages;
    }
}
