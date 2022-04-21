package com.averkina;

import java.util.Random;

public class Rectangle implements Shape{
    double a;
    double b;

    public Rectangle (double range) {
        Random random = new Random();
        a = range * random.nextDouble();
        b = range * random.nextDouble();
    }

    public Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String getType() {
        return "Квадрат (a=" + String.format("%.2f", a) + "; b=" + String.format("%.2f", b) + ")";
    }

    public double getArea() {
        return a*b;
    }
}
