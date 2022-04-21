package com.averkina;

public class Right implements Runnable{
    Person pers;

    public Right( Person pers){
        this.pers=pers;
    }

    public void run(){
        while(pers.getAmountStep() > 0) {
            if(pers.getNumberLeg() == 1) {
                pers.step("Правый ");
            }
        }
    }
}