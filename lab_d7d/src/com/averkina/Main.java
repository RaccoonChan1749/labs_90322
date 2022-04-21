package com.averkina;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        int amount = 0;
        System.out.print("Введите кол-во элементов списка: ");

        try {
            amount = in.nextInt();
            in.nextLine();
        }
        catch(Exception ex) {
            System.out.printf("Ошибка! Некорректный ввод!\n");
            amount = 0;
            return;
        }

        for(int i = 0; i < amount; i++) {
            String surname;
            String name;
            int age;

            try {
                System.out.print("Введите фамилию: ");
                surname = in.nextLine();

                System.out.print("Введите имя: ");
                name = in.nextLine();

                System.out.print("Введите возраст: ");
                age = in.nextInt();

                if(age < 0) {
                    throw new Exception();
                }
            }
            catch(Exception ex) {
                System.out.printf("Ошибка! Некорректный ввод!\n");
                return;
            }

            persons.add(new Person(surname, name, age));
            System.out.println("------------------------------------------");
            in.nextLine();
        }


        System.out.println("Исходный лист:");
        persons
                .stream()
                .map(person -> person.getLine())
                .forEach(System.out::println);

        System.out.println("\nСортировка по фамилии:");
        persons
                .stream()
                .sorted(Comparator.comparing(Person::getSurname))
                .map(person -> person.getLine())
                .forEach(System.out::println);

        System.out.println("\nСортировка по имени:");

        persons
                .stream()
                .sorted(Comparator.comparing(Person::getName))
                .map(person -> person.getLine())
                .forEach(System.out::println);

        System.out.println("\nСортировка по возрасту:");

        persons
                .stream()
                .sorted(Comparator.comparing(Person::getAge))
                .map(person -> person.getLine())
                .forEach(System.out::println);
    }
}
