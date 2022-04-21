package com.averkina;

public class Person{
    private int amountStep;
    private int numberLeg;

    public Person(int amountStep, int numberLeg) {
        this.amountStep = amountStep;
        this.numberLeg = numberLeg;
    }

    public int getAmountStep() {
        return amountStep;
    }
    public int getNumberLeg() {
        return numberLeg;
    }

    //Если блок кода помечен ключевым словом synchronized, это значит, что блок может выполняться только одним потоком одновременно.
    public synchronized void step(String comment) {
        if(amountStep == 0) {
            return;
        }

        if(numberLeg == 1) {
            numberLeg = 2;
        }
        else {
            numberLeg = 1;
        }
        System.out.println(comment + "шаг №" + amountStep);
        amountStep--;
    }
}
