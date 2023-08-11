package methodrefrence;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
    void print(String msg);
}

public class MethodReferenceDemo {
    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        //1. Method references to static method
        //Lambda Expression
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(64));

        //using Method References
        Function<Integer, Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(36));

        //lambda Expression
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferenceDemo.addition(a, b);
        System.out.println(biFunctionLambda.apply(10, 20));
        //MethodReference
        BiFunction<Integer, Integer, Integer> biFunction = MethodReferenceDemo::addition;
        System.out.println(biFunction.apply(10, 20));

        //2.Method Refrence To an Instance method of an Object
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
        //Lambda Expression
        Printable printable = (msg) -> methodReferenceDemo.display(msg);
        printable.print("Hello Chandrakant");
        //Method Refrence
        Printable printableMethodRef = methodReferenceDemo::display;
        printableMethodRef.print("Hello Charlie");

        //3.Refrence to the instance method of an orbitrary object
        //sometimes ,we call a method of argument in the lambda expression
        //In that case, we can use a Method Refrence to call an Instance
        //method of an Orbitrary object to a specific object
        Function<String, String> stringFunction = (String input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("Chandrakant Jatav"));
        //Using method Refrence
        Function<String, String> stringFunctionMethodRef = String::toLowerCase;
        System.out.println(stringFunctionMethodRef.apply("Chandrakant Jatav"));

        String[] strArray = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
        //using Lambda
        Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
        //using Method Refrence
        Arrays.sort(strArray, String::compareToIgnoreCase);
        //4.Refrence to a constructor
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("PineApple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));
        //using Method Reference
        Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
        System.out.println(setFunctionMethodRef.apply(fruits));

    }
}
