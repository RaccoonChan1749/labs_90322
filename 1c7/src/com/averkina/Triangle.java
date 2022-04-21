package com.averkina;

import java.util.Random;

public class Triangle implements Shape{
    double h;
    double a;

    public Triangle (double range) {
        Random random = new Random();
        a = range * random.nextDouble();
        h = range * random.nextDouble();
    }

    public Triangle (double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getType() {
        return "Треугольник (h=" + String.format("%.2f", h) + "; a=" + String.format("%.2f", a) + ")";
    }

    public double getArea() {
        return 0.5*a*h;
    }
}
