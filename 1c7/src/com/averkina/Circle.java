package com.averkina;

import java.util.Random;

public class Circle implements Shape{
    double r;

    public Circle (double range) {
        Random random = new Random();
        r = range * random.nextDouble();
    }
    public Circle (int r) {
        this.r = r;
    }

    public String getType() {
        return "Круг (r=" + String.format("%.2f", r) + ")";
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}
