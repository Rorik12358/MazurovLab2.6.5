package com.brainacad.calc;

import com.brainacad.shapes.Triangle;

/**
 * Created by R2-D2 on 26.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2.5,3,1);
        System.out.println(triangle.getArea());
    }
}
