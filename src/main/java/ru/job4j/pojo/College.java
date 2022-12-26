package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullname("Иванов Иван Иваныч");
        student.setGroup(1);
        student.setDate("01.12.2000");
        System.out.println("ФИО: " + student.getFullname() + ".");
        System.out.println("Группа: " + student.getGroup() + ".");
        System.out.println("Дата поступления: " + student.getDate() + ".");
    }
}
