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
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            if (i == 0) {
                Book temp = books[i];
                books[i] = books[books.length - 1];
                books[books.length - 1] = temp;
            }
            System.out.println("Название книги: " + books[i].getName() + "."
                    + " " + "Кол-во страниц: " + books[i].getTotalpages());
        }
        System.out.println();
        for (Book num : books) {
            if (num.getName().equals("Clean code")) {
                System.out.println("Название книги: " + num.getName() + "Кол-во страниц: " + num.getTotalpages());
            }
        }
    }
}