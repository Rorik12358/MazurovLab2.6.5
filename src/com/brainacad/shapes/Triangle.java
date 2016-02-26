package com.brainacad.shapes;
import static java.lang.Math.pow;

/**
 * Created by R2-D2 on 26.02.2016.
 */
public class Triangle {
    private double a = 1;
    private double b = 1.;
    private double c = 1.0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea(){
        double s = (a+b+c)/2;
        return pow(s*(s-a)*(s-b)*(s-c),1/2);
    }
}
