package com.java.lambda;

@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract void print(String msg);

    default void m1() {
        System.out.println(" default method");
    }

    static void m2() {
        System.out.println(" static method");
    }
}
//Functional Interfaces is a Interfaces it can contain any number of Static and Default methods, but it should contain only one abstract method