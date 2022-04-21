package com.averkina;
import java.io.Serializable;
import java.util.*;

public class PersonList implements Serializable {
    private static final long serialVersionUID = 813248781814176996L;
    List<String> list;

    public PersonList() {
        list = new ArrayList<>();
    }

    public void addPerson(String pers) {
        list.add((sizeList() + 1) + ". " + pers);
    }
    public void printList() {
        list.stream().forEach(System.out::println);
    }
    public int sizeList() {
        return list.size();
    }
}
