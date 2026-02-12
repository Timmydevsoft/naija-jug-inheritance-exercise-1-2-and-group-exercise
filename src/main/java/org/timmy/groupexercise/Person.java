package org.timmy.groupexercise;

public class Person {
    public String name;
    public String course;
    public int id;

    public void printCourse(){
        System.out.println("Taking course");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", id=" + id +
                '}';
    }
}
