package com.averkina;

import java.util.Scanner;

public class Main {

    public static int maxShape(Shape strategy[]){
        double maxArea = 0;
        int maxIndex = 0;
        for(int i = 0; i < strategy.length; i++) {
            if(strategy[i] == null){
                return -1;
            }

            if(maxArea < strategy[i].getArea()) {
                maxArea = strategy[i].getArea();
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        Shape strategy[];
        Scanner in = new Scanner(System.in);
        int amount = 10;
        double range = 20;

        System.out.printf("\nВведите кол-во фигур: ");
        try {
            amount = in.nextInt();
            if(amount < 1) {
                throw new Exception();
            }
        }
        catch(Exception ex) {
            System.out.printf("Ошибка! Некорректный ввод!\n");
            return;
        }

        System.out.print("\nВведите макс. габариты: ");
        try {
            range = in.nextDouble();
            if(range <= 0) {
                throw new Exception();
            }
        }
        catch(Exception ex) {
            System.out.printf("Ошибка! Некорректный ввод!\n");
            return;
        }

        System.out.printf("------------------------------------------\n");

        strategy = new Shape[amount];

        System.out.println("Все фигуры: ");
        for(int i = 0; i < amount; i++) {
            int type = 0;
            type = 1 + (int) ( Math.random() * 3 );
            if(type == 1) {
                strategy[i] = new Circle(range);
            }
            if(type == 2) {
                strategy[i] = new Triangle(range);
            }
            if(type == 3) {
                strategy[i] = new Rectangle(range);
            }

            System.out.print(strategy[i].getType());
            System.out.println(" -> Площадь: " + String.format("%.2f", strategy[i].getArea()));
        }
        System.out.printf("------------------------------------------\n");

        int maxIndex = Main.maxShape(strategy);

        System.out.println("Максимальная площадь: ");
        System.out.print(strategy[maxIndex].getType());
        System.out.println(" -> Площадь: " + String.format("%.2f", strategy[maxIndex].getArea()));
    }
}
