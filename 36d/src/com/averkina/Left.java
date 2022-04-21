package com.averkina;

public class Left implements Runnable{
    Person pers;

    public Left( Person pers){
        this.pers=pers;
    }

    public void run(){
        while(pers.getAmountStep() > 0) {
            if(pers.getNumberLeg() == 2) {
                pers.step("Левый ");
            }
        }
    }
}
