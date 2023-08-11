package functional;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        BiConsumer<Integer, Integer> substraction = (a, b) -> System.out.println(a - b);
        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println(a * b);
        BiConsumer<Integer, Integer> divide = (a, b) -> System.out.println(a / b);

        biConsumer.accept(10, 20);
        substraction.accept(20, 10);
        multiply.accept(10, 50);
        divide.accept(20, 10);

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java");
        map.put(2, "Hibernate");
        map.put(3, "MySQL");
        map.put(4, "SpringBoot");
        map.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
    }
}

