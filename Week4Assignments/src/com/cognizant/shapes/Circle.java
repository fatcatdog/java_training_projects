/*
@author Jacob Duchen
*/

package com.cognizant.shapes;

import java.util.Scanner;

public class Circle {

public float radius;
public float pi;

    public Circle() {
        this.radius = 1.5f;
        this.pi = 3.5f;
    }

    public Circle(float radius) {
        this.radius = radius;
        this.pi = 3.5f;
    }

    public Circle(float radius, float pi) {
        this.radius = radius;
        this.pi = pi;
    }

    public void setRadius(float rad) {
        this.radius = rad;
    }

    void calculateCircleArea(){
        float area = (pi * radius * radius);
        System.out.println("The area of circle is " + area);
    }

    void calculateCircumference(){
        float circumference = (pi * radius * 2);
        System.out.println("The circumference of circle is " + circumference);
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Lets make a circle!");
        System.out.println("What are our dimensions you ask?");
        Circle newCircle = new Circle();

        newCircle.calculateCircumference();
        newCircle.calculateCircleArea();

        System.out.println("What should the new radius be?");
        float new_radius = userInput.nextFloat();

        newCircle.setRadius(new_radius);

        newCircle.calculateCircumference();
        newCircle.calculateCircleArea();
    }


}
