package com.cognizant.shapes;

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

    void calculateCircleArea(){
        float area = (pi * radius * radius);
        System.out.println("The area of circle is " + area);
    }

    void calculateCircumference(){
        float circumference = (pi * radius * 2);
        System.out.println("The circumference of circle is " + circumference);
    }

    public static void main(String[] args) {
        Circle newCircle = new Circle(10, 2);
        newCircle.calculateCircumference();
        newCircle.calculateCircleArea();
    }


}
