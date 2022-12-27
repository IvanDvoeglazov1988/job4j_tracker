package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Clean code", 100);
        Book book1 = new Book("Java code", 1000);
        Book book2 = new Book("C++ code", 950);
        Book book3 = new Book("Home", 50);
        Book[] books = {book, book1, book2, book3};
        for (Book num : books) {
            System.out.println("Название книги: " + num.getName() + "."
                    + " " + "Кол-во страниц: " + num.getTotalpages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println();
        for (Book num : books) {
            System.out.println("Название книги: " + num.getName() + "."
                    + " " + "Кол-во страниц: " + num.getTotalpages());
        }
        System.out.println();
        for (Book num : books) {
            if ("Clean code".equals(num.getName())) {
                System.out.println("Название книги: " + num.getName() + ". " + "Кол-во страниц: " + num.getTotalpages());
            }
        }
    }
}