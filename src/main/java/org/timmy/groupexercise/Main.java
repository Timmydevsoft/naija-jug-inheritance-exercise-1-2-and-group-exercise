package org.timmy.groupexercise;

public class Main {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.name = "Ade";
        student1.course = "Electrical Engineering";
        student1.id = 1;

        Student2 student2 = new Student2();
        student2.name = "John";
        student2.course = "Mechanical Engineering";
        student2.id = 3;

        System.out.println(student1);
        System.out.println(student2);
    }
}
