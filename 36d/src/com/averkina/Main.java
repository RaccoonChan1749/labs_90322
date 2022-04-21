package com.averkina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = 0;
        int leg = 0;

        try {
            System.out.print("Введите кол-во шагов: ");
            amount = in.nextInt();
            System.out.print("Выберите первую ногу (1 - правая; 2 - левая): ");
            leg = in.nextInt();

            if(amount < 0 || leg < 1 || leg > 2) {
                throw new Exception();
            }
        }
        catch(Exception ex) {
            System.out.printf("Ошибка! Некорректный ввод!\n");
            return;
        }
        System.out.println("------------------------------------------");

        Person pers = new Person(amount,leg);

        Left left = new Left(pers);
        Right right = new Right(pers);

        new Thread(right).start();
        new Thread(left).start();
    }
}
