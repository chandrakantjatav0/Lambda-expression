package functional;

import java.util.function.Function;

class FunctionalImpl implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionDemo {
    public static void main(String[] args) {
//        Function<String, Integer> function= new FunctionalImpl();
//        System.out.println(function.apply("Chandrakant"));
        Function<String, Integer> function = (String s) -> s.length();
        System.out.println(function.apply("Chandrakant"));
    }
}