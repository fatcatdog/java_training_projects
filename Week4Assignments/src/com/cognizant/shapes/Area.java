/*
@author Jacob Duchen
*/

package com.cognizant.shapes;

public class Area {

    public static void main(String[] args) {

        Circle ourCircle = new Circle(1.9f);
        System.out.println("The pi value for circle is " + ourCircle.pi);
        System.out.println("The radius value for circle is " + ourCircle.radius);
        ourCircle.calculateCircleArea();
        ourCircle.calculateCircumference();
        ourCircle.setRadius(5.67f);
        System.out.println("The pi value for circle is " + ourCircle.pi);
        System.out.println("The radius value for circle is " + ourCircle.radius);
        ourCircle.calculateCircleArea();
        ourCircle.calculateCircumference();

    }
}

