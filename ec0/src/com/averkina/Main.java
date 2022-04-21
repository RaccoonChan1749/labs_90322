package com.averkina;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SaveFile sf = new SaveFile();
        Scanner in = new Scanner(System.in);
        MyTimer timer = new MyTimer();

        int menu = 0;
        int submenu = 0;
        Person pers = new Person("");
        PersonList persList = (PersonList) sf.deserialize("archive/list.data", false);
        if(persList == null){
            persList = new PersonList();
        }

        int numberUser = 0;
        while (numberUser == 0) {
            System.out.println("------------------------------------------");
            System.out.println("Выберите пользователя:");

            persList.printList();

            System.out.println((persList.sizeList() + 1) + ". Новый пользователь");
            System.out.print("Введите пункт меню: ");

            try {
                numberUser = in.nextInt();
                if (numberUser < 0 || numberUser > (persList.sizeList() + 1)) {
                    throw new Exception();
                }
                in.nextLine();
            } catch (Exception ex) {
                System.out.printf("Ошибка! Некорректный ввод пункта меню!\n");
                numberUser = 0;
                in.nextLine();
            }
        }

        if(numberUser == (persList.sizeList() + 1)) {
            String fio = "";
            System.out.println("------------------------------------------");
            try {
                System.out.print("Введите ФИО: ");
                fio = in.nextLine();
            } catch (Exception ex) {
                System.out.printf("Ошибка! Некорректный ввод!\n");
                numberUser = 0;
                in.nextLine();
            }
            pers = new Person(fio);
            persList.addPerson(fio);
            sf.serialize(pers, "archive/" + numberUser + ".data");
            sf.serialize(persList, "archive/list.data");
        }

        pers = (Person) sf.deserialize("archive/" + numberUser + ".data");

        while (menu < 4) {
            menu = 0;
            submenu = 0;

            System.out.println("------------------------------------------");
            pers.printСal();
            System.out.print("Меню:" +
                    "\n1.Начать \"отжимание\" (0.125 ккал/сек)" +
                    "\n2.Начать \"скакалка\" (0.19 ккал/сек)" +
                    "\n3.Начать \"приседания\" (0.225 ккал/сек)" +
                    "\n4.Выход" +
                    "\nВведите пункт меню: ");

            try {
                menu = in.nextInt();
                if (menu < 1 || menu > 4) {
                    throw new Exception();
                }
                in.nextLine();
            } catch (Exception ex) {
                System.out.printf("Ошибка! Некорректный ввод пункта меню!\n");
                menu = 0;
                in.nextLine();
            }
            System.out.println("------------------------------------------");

            if(menu >= 1 && menu <= 3) {
                timer.run();

                while(submenu != 1) {
                    System.out.print("Меню:" +
                            "\n1.Закончить тренировку" +
                            "\nВведите пункт меню: ");

                    try {
                        submenu = in.nextInt();
                        if (submenu != 1) {
                            throw new Exception();
                        }
                        in.nextLine();
                    } catch (Exception ex) {
                        System.out.printf("Ошибка! Некорректный ввод пункта меню!\n");
                        submenu = 0;
                        in.nextLine();
                    }
                    System.out.println("------------------------------------------");
                }

                timer.stop();
                pers.addCal(menu, timer.getSecond());
            }
        }

        sf.serialize(pers, "archive/" + numberUser + ".data");
    }
}
