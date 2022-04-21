package com.averkina;

public class Person implements Comparable<Person>{
    private String surname;
    private String name;
    private int age;

    public Person(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLine() {
        return surname + " " + name + "(" + age + ")";
    }

    public String getFIO() {
        return surname + " " + name;
    }

    @Override
    public int compareTo(Person person) {
        return this.getFIO().compareTo(person.getFIO());
    }
}
