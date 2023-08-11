package com.java.lambda;

//This is basically OOPS polymorphism Concept
interface Shape1 {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println(" rectangle draw method");
    }
}

//now change polymorphism to Functional programming Lambda expression
public class LambdaExample2 {
    public static void main(String[] args) {

        Shape1 rectangle = () -> System.out.println(" rectangle draw method");
        rectangle.draw();
    }
}
//Lambda Expression is a anonomous Function it don't have any name and it doesn't belong to class or object