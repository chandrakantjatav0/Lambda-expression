package functional;

import java.util.function.BiPredicate;

public class BiPredicateDemo  {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate1 = (s1, s2) -> s1.equals(s2);
        System.out.println(biPredicate1.test("Chandrakant", "Chandrakant"));
        System.out.println(biPredicate1.test("chandu", "Chandu"));

        BiPredicate<Integer, Integer> biPredicate2 = (x, y) -> x > y;
        BiPredicate<Integer, Integer> biPredicate3 = (x, y) -> x == y;
        boolean result1 = biPredicate2.and(biPredicate3).test(20, 10);
        System.out.println(result1);
        boolean result2 = biPredicate2.or(biPredicate3).test(20, 10);
        System.out.println(result2);
    }
}
