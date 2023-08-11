package com.java.lambda;

//This code is basically Polymorphism  Method Overriding
interface Shape {
    void draw();
}

public class LambdaExample {
    public static void main(String[] args) {
        //Functional Programming Using Lambda Expression
        print(() -> System.out.println("Rectangle class : draw() method "));
        print(() -> System.out.println("Square class : draw() method "));
        print(() -> System.out.println("Circle class : draw() method "));
    }

    private static void print(Shape shape) {
        shape.draw();
    }
}
