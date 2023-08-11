package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (t, u) -> (t + u);
        BiFunction<Integer, Integer, Integer> substraction = (t, u) -> (t - u);
        BiFunction<Integer, Integer, Integer> multiplication = (t, u) -> (t * u);
        BiFunction<Integer, Integer, Integer> division = (t, u) -> (t / u);

        Function<Integer, Integer> function = (number) -> number * number;
        Integer integer = biFunction.andThen(function).apply(10, 20);

        System.out.println("Addition : "+biFunction.apply(10, 20));
        System.out.println("Substraction : "+substraction.apply(400, 300));
        System.out.println("Multiplication : "+multiplication.apply(400, 300));
        System.out.println("Division : "+division.apply(400, 300));
        System.out.println("Two Side Expression  : "+integer);
    }
}
