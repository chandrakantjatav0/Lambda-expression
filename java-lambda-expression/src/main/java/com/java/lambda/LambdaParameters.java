package com.java.lambda;

import java.util.function.IntBinaryOperator;

interface Addable {
    int addition(int a, int b);
}

class AdditionImpl implements Addable {
    @Override
    public int addition(int a, int b) {
        return (a + b);
    }
}

public class LambdaParameters {
    public static void main(String[] args) {
//        Addable addition = (a, b) -> (a + b);
//        int result = addition.addition(10, 20);
//        System.out.println("Addition is : "+result);

        Addable abc = (int a, int b) -> {
            int c = (a + b);
            return c;
        };
    }
}
