package com.averkina;
import java.io.Serializable;

//Сериализация это процесс сохранения состояния объекта в последовательность байт; десериализация это процесс восстановления объекта, из этих байт.
public class Person implements Serializable {
    private static final long serialVersionUID = -3427837268287956311L;
    private String fio;
    private double cal;

    public Person(String fio) {
        this.fio = fio;
        cal = 0;
    }

    public void addCal(int type, long second) {
        switch (type) {
            case 1 -> cal += (0.125 * second);
            case 2 -> cal += (0.19 * second);
            case 3 -> cal += (0.225 * second);
        };
    }
    public String getFIO() {
        return  fio;
    }
    public double getCal() {
        return cal;
    }
    public void printСal() {
        System.out.println(fio + ": " + cal + " ккал");
    }
}
